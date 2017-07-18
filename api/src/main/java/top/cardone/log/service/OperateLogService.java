package top.cardone.log.service;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.postgresql.util.PGobject;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleBeforeEvent;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.sql.SQLException;
import java.util.Map;

/**
 * 操作日志服务
 *
 * @author yao hai tao
 */
public interface OperateLogService extends PageService {
    @Async
    @EventListener
    default void eventListene(SimpleBeforeEvent simpleBeforeEvent) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }

        insert.put("jsonData", jsonObject);

        ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
    }

    @Async
    @EventListener
    default void eventListene(SimpleEvent simpleEvent) {
        Map<String, Object> insert = Maps.newHashMap();

        insert.put("typeCode", "interface");

        Map<String, Object> jsonData = Maps.newHashMap();

        jsonData.put("flags", simpleEvent.getFlags());
        jsonData.put("input", simpleEvent.getArgs());
        jsonData.put("output", simpleEvent.getOutput());
        jsonData.put("configs", simpleEvent.getConfigs());

        PGobject jsonObject = new PGobject();
        jsonObject.setType("json");

        try {
            jsonObject.setValue(ApplicationContextHolder.getBean(Gson.class).toJson(jsonData));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        insert.put("jsonData", jsonObject);

        ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
    }

    @Async
    @EventListener
    default void eventListene(SimpleErrorEvent simpleErrorEvent) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }

        insert.put("jsonData", jsonObject);

        ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
    }
}