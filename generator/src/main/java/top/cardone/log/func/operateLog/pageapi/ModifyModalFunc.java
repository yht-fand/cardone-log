package top.cardone.log.func.operateLog.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 操作日志 - 修改
 */
@Component("/log/operateLog/modifyModal.json")
public class ModifyModalFunc implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }
}
