package top.cardone.log.service;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.Map;

/**
 * 操作日志服务
 *
 * @author yao hai tao
 */
public interface OperateLogService extends PageService {
    //    @EventListener(condition="#simpleEvent.configs[0]=='dd'")
    @Async
    @EventListener
    default void eventListene(SimpleEvent simpleEvent) {
        Map<String, Object> insert = Maps.newHashMap();

        insert.put("typeCode", "interface");

        Map<String, Object> jsonData = Maps.newHashMap();

        jsonData.put("input", simpleEvent.getArgs());
        jsonData.put("configs", simpleEvent.getConfigs());

        insert.put("jsonData", ApplicationContextHolder.getBean(Gson.class).toJson(jsonData));

        ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
    }

    @Async
    @EventListener
    default void eventListene(SimpleErrorEvent simpleErrorEvent) {
        Map<String, Object> insert = Maps.newHashMap();

        insert.put("typeCode", "interface");
        insert.put("message", simpleErrorEvent.getThrowable().getMessage());

        Map<String, Object> jsonData = Maps.newHashMap();

        jsonData.put("input", simpleErrorEvent.getArgs());
        jsonData.put("configs", simpleErrorEvent.getConfigs());
        jsonData.put("throwable", simpleErrorEvent.getThrowable());

        insert.put("jsonData", ApplicationContextHolder.getBean(Gson.class).toJson(jsonData));

        ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
    }
}