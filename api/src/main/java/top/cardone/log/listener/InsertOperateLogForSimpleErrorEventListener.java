package top.cardone.log.listener;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.postgresql.util.PGobject;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.listener.SimpleErrorEventListener;
import top.cardone.log.service.OperateLogService;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by cardo on 2017/7/18 0018.
 */
public class InsertOperateLogForSimpleErrorEventListener implements SimpleErrorEventListener {
    @Override
    public void eventListene(SimpleErrorEvent simpleErrorEvent) {
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
