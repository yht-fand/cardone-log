package top.cardone.log.listener;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import org.postgresql.util.PGobject;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleBeforeEvent;
import top.cardone.context.listener.SimspleBeforeEventListener;
import top.cardone.log.service.OperateLogService;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by cardo on 2017/7/18 0018.
 */
public class InsertOperateLogForSimspleBeforeEventListener implements SimspleBeforeEventListener {
    @Override
    public void eventListene(SimpleBeforeEvent simpleBeforeEvent) {
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
}
