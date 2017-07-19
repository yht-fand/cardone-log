package top.cardone.log.listener;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.postgresql.util.PGobject;
import org.springframework.context.ApplicationListener;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.log.service.OperateLogService;

import java.util.Map;

/**
 * Created by cardo on 2017/7/18 0018.
 */
public class InsertOperateLogBySimpleErrorEventListener implements ApplicationListener<SimpleErrorEvent> {
    @Override
    public void onApplicationEvent(SimpleErrorEvent simpleErrorEvent) {
        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            Map<String, Object> insert = Maps.newHashMap();

            insert.put("typeCode", "interface");
            insert.put("message", simpleErrorEvent.getThrowable().getMessage());

            Map<String, Object> jsonData = Maps.newHashMap();

            jsonData.put("flags", simpleErrorEvent.getFlags());
            jsonData.put("input", simpleErrorEvent.getArgs());
            jsonData.put("configs", simpleErrorEvent.getConfigs());
            jsonData.put("throwable", simpleErrorEvent.getThrowable());

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
