package top.cardone.log.service.impl;

import com.google.common.collect.Maps;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.impl.PageServiceImpl;
import top.cardone.log.dao.OperateLogDao;
import top.cardone.log.service.OperateLogService;

import java.util.Map;

/**
 * 操作日志服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class OperateLogServiceImpl extends PageServiceImpl<OperateLogDao> implements top.cardone.log.service.OperateLogService {
    //    @EventListener(condition="#simpleEvent.configs[0]=='dd'")
    @Async
    @EventListener
    public void eventListene(SimpleEvent simpleEvent) {
        Map<String, Object> insert = Maps.newHashMap();

        insert.put("typeCode", "interface");
        insert.put("objectTypeCode", simpleEvent.getSource().getClass().getName());
        insert.put("objectCode", simpleEvent.getConfigs()[1]);

        ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
    }

    @Async
    @EventListener
    public void eventListene(SimpleErrorEvent simpleErrorEvent) {
        Map<String, Object> insert = Maps.newHashMap();

        insert.put("typeCode", "interface");
        insert.put("objectTypeCode", simpleErrorEvent.getSource().getClass().getName());
        insert.put("objectCode", simpleErrorEvent.getConfigs()[1]);
        insert.put("message", simpleErrorEvent.getThrowable().getMessage());

        ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
    }
}