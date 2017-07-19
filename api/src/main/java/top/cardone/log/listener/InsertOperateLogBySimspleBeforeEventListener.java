package top.cardone.log.listener;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.postgresql.util.PGobject;
import org.springframework.context.ApplicationListener;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleBeforeEvent;
import top.cardone.log.service.OperateLogService;

import java.util.Map;

/**
 * Created by cardo on 2017/7/18 0018.
 */
public class InsertOperateLogBySimspleBeforeEventListener implements ApplicationListener<SimpleBeforeEvent> {
    @Override
    public void onApplicationEvent(SimpleBeforeEvent simpleBeforeEvent) {
        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            Map<String, Object> insert = Maps.newHashMap();

            insert.put("typeCode", "interface");

            Map<String, Object> jsonData = Maps.newHashMap();

            jsonData.put("flags", simpleBeforeEvent.getFlags());
            jsonData.put("input", simpleBeforeEvent.getArgs());
            jsonData.put("configs", simpleBeforeEvent.getConfigs());

            PGobject jsonObject = new PGobject();
            jsonObject.setType("json");

            try {
                jsonObject.setValue(ApplicationContextHolder.getBean(Gson.class).toJson(jsonData));
            } catch (Exception e) {
                e.printStackTrace();
            }

            insert.put("jsonData", jsonObject);

            ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
        }, null, false));
    }
}
