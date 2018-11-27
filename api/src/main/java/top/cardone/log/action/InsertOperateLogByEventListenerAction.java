package top.cardone.log.action;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleBeforeEvent;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.core.util.action.Action0;
import top.cardone.core.util.action.Action1;
import top.cardone.core.util.func.Func0;
import top.cardone.core.util.func.Func1;
import top.cardone.log.service.OperateLogService;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by cardo on 2018/3/30 0030.
 */
@Log4j2
public class InsertOperateLogByEventListenerAction implements Action0, Action1<Object>, InitializingBean {
    @Getter
    private List<Object> insertOperateLogList = Collections.synchronizedList(Lists.newArrayList());

    @Setter
    private int insertOperateLogUpperLimit = 10000;

    @Setter
    private int insertOperateLogLowerLimit = 100;

    @Setter
    private int insertOperateLogLowerLimitTime = 1000;

    @Setter
    private Map<String, String> typeCodeMap;

    @Setter
    private String findListDictionaryFuncName = "findListDictionaryFunc";

    @Setter
    private Map<String, Object> findListDictionaryMap;

    @Setter
    @Value("#{'${top.cardone.log.action.InsertOperateLogByEventListenerAction.skipClassNameList:}'.split(',')}")
    private List<String> skipClassNameList = Lists.newArrayList("*.Log*", "*.Error*", "*.Count*", "*.RolePermission*", "*.UserPermission*", "*.I18nInfo*", "*.Navigation*", "*.Dictionary*", "*.Variable*");

    @Setter
    private List<String> whiteList = Lists.newArrayList();

    @Setter
    private String taskExecutorBeanName = "slowTaskExecutor";

    @Setter
    @Value("${app.isStoreToDatabase:false}")
    private boolean isStoreToDatabase = false;

    @Setter
    private List<Map<String, Object>> serviceNameList;

    public InsertOperateLogByEventListenerAction() {
        typeCodeMap = Maps.newHashMap();

        typeCodeMap.put("insert*", "insert");
        typeCodeMap.put("update*", "update");
        typeCodeMap.put("delete*", "delete");
        typeCodeMap.put("save*", "save");
        typeCodeMap.put("page*", "page");
        typeCodeMap.put("action", "action");
        typeCodeMap.put("func", "func");

        findListDictionaryMap = Maps.newHashMap();

        findListDictionaryMap.put("dictionaryTypeCode", "serviceName");

        findListDictionaryMap.put("stateCode", "1");
        findListDictionaryMap.put("dataStateCode", "1");
    }

    private String getMessage(String className) {
        if (CollectionUtils.isEmpty(serviceNameList)) {
            return StringUtils.EMPTY;
        }

        for (Map<String, Object> serviceName : serviceNameList) {
            String dictionaryCode = top.cardone.context.util.MapUtils.getString(serviceName, "dictionary_code");

            if (StringUtils.isNotBlank(top.cardone.context.util.StringUtils.getPathForMatch(Lists.newArrayList(dictionaryCode), className))) {
                return top.cardone.context.util.MapUtils.getString(serviceName, "name");
            }
        }

        return StringUtils.EMPTY;
    }

    @Override
    public void action(Object o) {
        if (insertOperateLogList.size() > insertOperateLogUpperLimit) {
            log.error("日志记录队列超出大小上限：" + insertOperateLogList.size());

            return;
        }

        if (o instanceof Map) {
            this.insertOperateLogList.add(o);

            return;
        }

        if (o instanceof List) {
            this.insertOperateLogList.addAll((List) o);

            return;
        }

        String[] flags;
        String[] configs;
        Object[] args;
        Throwable throwable;
        long timestamp;

        if (o instanceof SimpleBeforeEvent) {
            SimpleBeforeEvent simpleBeforeEvent = (SimpleBeforeEvent) o;

            flags = simpleBeforeEvent.getFlags();
            configs = simpleBeforeEvent.getConfigs();
            args = simpleBeforeEvent.getArgs();
            throwable = null;
            timestamp = simpleBeforeEvent.getTimestamp();
        } else if (o instanceof SimpleEvent) {
            SimpleEvent simpleEvent = (SimpleEvent) o;

            flags = simpleEvent.getFlags();
            configs = simpleEvent.getConfigs();
            args = simpleEvent.getArgs();
            throwable = null;
            timestamp = simpleEvent.getTimestamp();
        } else {
            SimpleErrorEvent simpleErrorEvent = (SimpleErrorEvent) o;

            flags = simpleErrorEvent.getFlags();
            configs = simpleErrorEvent.getConfigs();
            args = simpleErrorEvent.getArgs();
            throwable = simpleErrorEvent.getThrowable();
            timestamp = simpleErrorEvent.getTimestamp();
        }

        if (StringUtils.isNotBlank(top.cardone.context.util.StringUtils.getPathForMatch(Lists.newArrayList(skipClassNameList), flags[0]))) {
            return;
        }

        if (!CollectionUtils.isEmpty(whiteList) && StringUtils.isBlank(top.cardone.context.util.StringUtils.getPathForMatch(Lists.newArrayList(whiteList), flags[0]))) {
            return;
        }

        String typeCode = MapUtils.getString(typeCodeMap, top.cardone.context.util.StringUtils.getPathForMatch(typeCodeMap.keySet(), flags[1]));

        if (StringUtils.isBlank(typeCode)) {
            return;
        }

        String createdByCode = ApplicationContextHolder.func(Func0.class, func -> (String) func.func(), "readPrincipalFunc");

        ApplicationContextHolder.getBean(TaskExecutor.class, this.taskExecutorBeanName).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            Map<String, Object> insert = Maps.newHashMap();

            insert.put("typeCode", typeCode);
            insert.put("createdByCode", createdByCode);
            insert.put("personalCode", createdByCode);

            if (StringUtils.contains(createdByCode, "empty-user-code")) {
                insert.put("objectTypeCode", "systemLog");
            } else {
                insert.put("objectTypeCode", "userLog");
            }

            insert.put("objectCode", createdByCode);
            insert.put("createdDate", new Date(timestamp));
            insert.put("createdTimestamp", timestamp);
            insert.put("flags", flags);


            Map<String, Object> jsonData = Maps.newHashMap();

            jsonData.put("flags", flags);
            jsonData.put("configs", configs);
            jsonData.put("args", org.springframework.util.StringUtils.arrayToCommaDelimitedString(args));

            if (throwable != null) {
                jsonData.put("throwable-message", throwable.getMessage());
            }

            insert.put("jsonData", jsonData);

            insertOperateLogList.add(insert);
        }, null, true));
    }

    @Override
    public void action() {
        if (insertOperateLogList.isEmpty()) {
            return;
        }

        if (insertOperateLogList.size() < insertOperateLogLowerLimit) {
            long time = System.currentTimeMillis() - MapUtils.getLongValue((Map) insertOperateLogList.get(0), "createdTimestamp", 0);

            if (time < insertOperateLogLowerLimitTime) {
                return;
            }
        }

        List<Object> newInsertOperateLogList = Lists.newArrayList();

        while (insertOperateLogList.size() > 0) {
            Map<String, Object> insertOperateLog = (Map<String, Object>) insertOperateLogList.get(0);

            if (StringUtils.isBlank(MapUtils.getString(insertOperateLog, "message")) && insertOperateLog.containsKey("flags")) {
                String message = this.getMessage(((String[]) MapUtils.getObject(insertOperateLog, "flags"))[0]);

                insertOperateLog.put("message", message);
            }

            newInsertOperateLogList.add(insertOperateLog);

            insertOperateLogList.remove(0);
        }

        try {
            if (isStoreToDatabase) {
                ApplicationContextHolder.getBean(OperateLogService.class).insertList(newInsertOperateLogList);
            } else {
                ApplicationContextHolder.getBean(Func1.class, "top/cardone/log/func/InsertListFunc").func(newInsertOperateLogList);
            }
        } catch (Exception ex) {
            insertOperateLogList.addAll(newInsertOperateLogList);

            log.error(ex);
        }
    }

    @Override
    public void afterPropertiesSet() {
        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            serviceNameList = (List<Map<String, Object>>) ApplicationContextHolder.getBean(Func1.class, this.findListDictionaryFuncName).func(this.findListDictionaryMap);
        }, null, true));
    }
}