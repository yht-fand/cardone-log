package top.cardone.log.func.operateLog.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.log.service.OperateLogService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 操作日志 - 修改
 */
@Component("/web-api/v1/configuration/operateLog/u0004.json")
public class U0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(OperateLogService.class).update(map);
    }
}