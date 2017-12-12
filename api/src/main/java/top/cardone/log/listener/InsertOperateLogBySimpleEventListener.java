package top.cardone.log.listener;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.postgresql.util.PGobject;
import org.springframework.context.ApplicationListener;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleEvent;
import top.cardone.core.util.func.Func0;
import top.cardone.core.util.func.Func1;
import top.cardone.log.service.OperateLogService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by cardo on 2017/7/18 0018.
 */
@Log4j2
public class InsertOperateLogBySimpleEventListener implements ApplicationListener<SimpleEvent> {
    @Setter
    private boolean skipCreatedByCodeBlank = true;

    @Setter
    private Map<String, String> typeCodeMap;

    @Setter
    private String findListDictionaryFuncName = "findListDictionaryFunc";

    @Setter
    private Map<String, Object> findListDictionaryMap;

    @Setter
    private List<String> skipClassNameList = Lists.newArrayList("*Log*", "*Error*");

    public InsertOperateLogBySimpleEventListener() {
        typeCodeMap = Maps.newHashMap();

        typeCodeMap.put("insert*", "insert");
        typeCodeMap.put("update*", "update");
        typeCodeMap.put("delete*", "delete");
        typeCodeMap.put("save*", "save");
        typeCodeMap.put("page*", "page");

        findListDictionaryMap = Maps.newHashMap();

        findListDictionaryMap.put("dictionaryTypeCode", "serviceName");

        findListDictionaryMap.put("stateCode", "1");
        findListDictionaryMap.put("dataStateCode", "1");
    }

    private String getMessage(String className) {
        List<Map<String, Object>> serviceNameList = (List<Map<String, Object>>) ApplicationContextHolder.getBean(Func1.class, this.findListDictionaryFuncName).func(this.findListDictionaryMap);

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
    public void onApplicationEvent(SimpleEvent simpleEvent) {
        if (StringUtils.isNotBlank(top.cardone.context.util.StringUtils.getPathForMatch(Lists.newArrayList(skipClassNameList), simpleEvent.getFlags()[0]))) {
            return;
        }

        String typeCode = StringUtils.defaultString(MapUtils.getString(typeCodeMap, top.cardone.context.util.StringUtils.getPathForMatch(typeCodeMap.keySet(), simpleEvent.getFlags()[1])), "other");

        if (StringUtils.isBlank(typeCode)) {
            return;
        }

        String createdByCode = ApplicationContextHolder.func(Func0.class, func -> (String) func.func(), "readPrincipalFunc");

        if (skipCreatedByCodeBlank && StringUtils.isBlank(createdByCode)) {
            return;
        }

        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            String message = this.getMessage(simpleEvent.getFlags()[0]);

            if (StringUtils.isBlank(message)) {
                return;
            }

            Map<String, Object> insert = Maps.newHashMap();

            insert.put("typeCode", typeCode);
            insert.put("createdByCode", createdByCode);
            insert.put("personalCode", createdByCode);
            insert.put("objectTypeCode", "userLog");
            insert.put("objectCode", createdByCode);
            insert.put("message", message);

            Map<String, Object> jsonData = Maps.newHashMap();

            jsonData.put("flags", simpleEvent.getFlags());

            if (ArrayUtils.isNotEmpty(simpleEvent.getArgs())) {
                List<Object> newArgs = Lists.newArrayList();

                for (Object arg : simpleEvent.getArgs()) {
                    if (arg == null) {
                        continue;
                    }

                    if (arg instanceof Class) {
                        newArgs.add(arg.toString());
                    } else if (arg instanceof Serializable) {
                        newArgs.add(arg);
                    } else {
                        newArgs.add(arg.toString());
                    }
                }

                if (CollectionUtils.isNotEmpty(newArgs)) {
                    jsonData.put("input", newArgs);
                }
            }

//            if (simpleEvent.getOutput() instanceof Serializable) {
//                jsonData.put("output", simpleEvent.getOutput());
//            }

            jsonData.put("configs", simpleEvent.getConfigs());

            PGobject jsonObject = new PGobject();

            jsonObject.setType("json");

            try {
                jsonObject.setValue(ApplicationContextHolder.getBean(Gson.class).toJson(jsonData));

                insert.put("jsonData", jsonObject);
            } catch (Exception e) {
                log.error(e);
            }

            ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
        }, null, false));
    }
}
