package top.cardone.log.listener;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.postgresql.util.PGobject;
import org.springframework.context.ApplicationListener;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleBeforeEvent;
import top.cardone.core.util.func.Func0;
import top.cardone.log.service.OperateLogService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by cardo on 2017/7/18 0018.
 */
@Log4j2
public class InsertOperateLogBySimspleBeforeEventListener implements ApplicationListener<SimpleBeforeEvent> {
    @Setter
    private boolean skipCreatedByCodeBlank = true;

    @Override
    public void onApplicationEvent(SimpleBeforeEvent simpleBeforeEvent) {
        String createdByCode = ApplicationContextHolder.func(Func0.class, func -> (String) func.func(), "readPrincipalFunc");

        if (skipCreatedByCodeBlank && StringUtils.isBlank(createdByCode)) {
            return;
        }

        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            Map<String, Object> insert = Maps.newHashMap();

            insert.put("createdByCode", createdByCode);

            insert.put("typeCode", "interface");

            Map<String, Object> jsonData = Maps.newHashMap();

            jsonData.put("flags", simpleBeforeEvent.getFlags());

            if (ArrayUtils.isNotEmpty(simpleBeforeEvent.getArgs())) {
                List<Object> newArgs = Lists.newArrayList();

                for (Object arg : simpleBeforeEvent.getArgs()) {
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

            jsonData.put("configs", simpleBeforeEvent.getConfigs());

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
