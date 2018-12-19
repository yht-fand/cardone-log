package top.cardone.log.listener;

import com.google.common.collect.Maps;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.ArrayUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.springframework.beans.factory.InitializingBean;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.log.action.InsertOperateLogByEventListenerAction;

import java.util.Date;
import java.util.Map;

/**
 * Created by cardo on 2018/4/24 0024.
 */
@Log4j2
public class QuartzJobListener implements JobListener, InitializingBean {
    @Setter
    private String name;

    @Setter
    private Map<String, String> typeNameMap;

    @Setter
    private boolean isInsertOperateLog = true;

    @Override
    public String getName() {
        return StringUtils.defaultIfBlank(this.name, this.getClass().getName());
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        addInsertOperateLogList(context, "jobToBeExecuted");
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        addInsertOperateLogList(context, "jobWasExecuted");
    }

    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        log.error(jobException);

        addInsertOperateLogList(context, "jobWasExecuted");
    }

    private String[] skipTriggers = new String[]{"batch-insert-log", "record-data-change", "reading-the-data-authorization-of-the-acquisition-station"};

    private void addInsertOperateLogList(JobExecutionContext context, String typeCode) {
        if (ArrayUtils.contains(skipTriggers, context.getTrigger().getKey().getName())) {
            return;
        }

        String message = context.getTrigger().getDescription() + "：" + typeNameMap.get(typeCode);

        if (log.isDebugEnabled()) {
            log.debug(message);
        }

        if (!isInsertOperateLog) {
            return;
        }

        Map<String, Object> insert = Maps.newHashMap();

        insert.put("typeCode", typeCode);
        insert.put("objectTypeCode", "quartz");
        insert.put("objectCode", context.getTrigger().getKey().getName());
        insert.put("createdDate", new Date());
        insert.put("message", message);
        insert.put("createdTimestamp", System.currentTimeMillis());

        ApplicationContextHolder.getBean(InsertOperateLogByEventListenerAction.class).action(insert);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (MapUtils.isEmpty(typeNameMap)) {
            typeNameMap = Maps.newHashMap();

            typeNameMap.put("jobToBeExecuted", "开始");
            typeNameMap.put("jobExecutionVetoed", "被否决");
            typeNameMap.put("jobWasExecuted", "完成");
        }
    }
}
