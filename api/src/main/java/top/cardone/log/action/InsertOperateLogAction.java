package top.cardone.log.action;

import com.google.common.collect.Maps;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.action.Action3;
import top.cardone.core.util.action.Action4;
import top.cardone.log.service.OperateLogService;

import java.util.Map;

/**
 * Created by Administrator on 2016/10/16.
 */
public class InsertOperateLogAction implements Action3<Object, Object[], String[]>, Action4<Object, Object[], String[], Throwable> {
    @Override
    public void action(Object source, Object[] args, String[] configs, Throwable throwable) {
        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            Map<String, Object> insert = Maps.newHashMap();

            insert.put("typeCode", "interface");
            insert.put("objectTypeCode", source.getClass().getName());
            insert.put("objectCode", configs[1]);
            insert.put("message", throwable.getMessage());

            ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
        }, null, true));
    }

    @Override
    public void action(Object source, Object[] args, String[] configs) {
        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            Map<String, Object> insert = Maps.newHashMap();

            insert.put("typeCode", "interface");
            insert.put("objectTypeCode", source.getClass().getName());
            insert.put("objectCode", configs[1]);

            ApplicationContextHolder.getBean(OperateLogService.class).insert(insert);
        }, null, true));
    }
}