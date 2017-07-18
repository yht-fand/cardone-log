package top.cardone.log.listener;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.postgresql.util.PGobject;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleEvent;
import top.cardone.context.listener.SimpleEventListener;
import top.cardone.log.service.OperateLogService;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by cardo on 2017/7/18 0018.
 */
public class InsertOperateLogForSimpleEventListener implements SimpleEventListener {
    @Override
    public void eventListene(SimpleEvent simpleEvent) {
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
}
