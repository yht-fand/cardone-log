package top.cardone.log.service.impl;

import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.domain.Page;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jms.core.JmsMessageOperations;
import org.springframework.scheduling.support.TaskUtils;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.service.impl.PageServiceImpl;
import top.cardone.log.dao.OperateLogDao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 操作日志服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@Log4j2
public class OperateLogServiceImpl extends PageServiceImpl<OperateLogDao> implements top.cardone.log.service.OperateLogService {
    @Override
    public Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

    @Override
    public <P> Page<P> pageCache(Class<P> mappedClass, Object page) {
        return this.page(mappedClass, page);
    }

    @Override
    public <P> List<P> findListCache(Class<P> mappedClass, Object findList) {
        return this.findList(mappedClass, findList);
    }

    @Override
    public <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        return this.findOne(mappedClass, findOne);
    }

    @Override
    public <R> List<R> readListCache(Class<R> requiredType, Object readList) {
        return this.readList(requiredType, readList);
    }

    @Override
    public <R> R readOneCache(Class<R> requiredType, Object readOne) {
        return this.readOne(requiredType, readOne);
    }

    @Override
    @Transactional
    public int deleteCache(Object delete) {
        return this.delete(delete);
    }

    @Override
    @Transactional
    public int deleteAllCache() {
        return this.deleteAll();
    }

    @Override
    @Transactional
    public int deleteByIdsCache(Object ids) {
        return this.deleteByIds(ids);
    }

    @Override
    @Transactional
    public int[] deleteListCache(List<Object> deleteList) {
        return this.deleteList(deleteList);
    }

    @Override
    public List<Map<String, Object>> findListCache(Object findList) {
        return this.findList(findList);
    }

    @Override
    public Map<String, Object> findOneCache(Object findOne) {
        return this.findOne(findOne);
    }

    @Override
    @Transactional
    public int insertCache(Object insert) {
        return this.insert(insert);
    }

    @Override
    @Transactional
    public int insertByNotExistsCache(Object insert) {
        return this.insertByNotExists(insert);
    }

    @Override
    @Transactional
    public int[] insertListCache(List<Object> insertList) {
        return this.insertList(insertList);
    }

    @Override
    @Transactional
    public int[] insertListByNotExistsCache(List<Object> insertList) {
        return this.insertListByNotExists(insertList);
    }

    @Override
    public List<Object> readListCache(Object readList) {
        return this.readList(readList);
    }

    @Override
    public Object readOneCache(Object readOne) {
        return this.readOne(readOne);
    }

    @Override
    @Transactional
    public Integer saveCache(Object save) {
        return this.save(save);
    }

    @Override
    @Transactional
    public int updateCache(Object update) {
        return this.update(update);
    }

    @Override
    @Transactional
    public int[] updateListCache(List<Object> updateList) {
        return this.updateList(updateList);
    }

    private String jmsMessageOperationsSendTestInfoBeandId = JmsMessageOperations.class.getName() + ".sendTestInfo";

    private String insertSql = "INSERT INTO c1_send_test (`ID`, `CREATED_DATE`) VALUES (:ID, :CREATED_DATE)";

    Runnable sendTestInfoRunnable = () -> {
        String id = UUID.randomUUID().toString();

        Map<String, Object> sendMap = Maps.newHashMap();

        sendMap.put("ID", id);

        ApplicationContextHolder.getBean(JmsMessageOperations.class, jmsMessageOperationsSendTestInfoBeandId).convertAndSend(sendMap);

        sendMap.put("CREATED_DATE", new Date());

        ApplicationContextHolder.getBean(NamedParameterJdbcOperations.class, NamedParameterJdbcOperations.class.getName() + ".2").update(insertSql, sendMap);
    };

    @Override
    public void sendTestInfo() {
        String createTableSql = "CREATE TABLE c1_send_test (\n" +
                "\tID VARCHAR(36) NOT NULL,\n" +
                "\tCREATED_DATE TIME,\n" +
                "\tUPDATE_DATE TIME\n" +
                ")";

        ApplicationContextHolder.getBean(NamedParameterJdbcOperations.class, NamedParameterJdbcOperations.class.getName() + ".2").getJdbcOperations().execute(createTableSql);

        int count = 0;

        while (true) {
            try {
                ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(sendTestInfoRunnable, null, true));

                if (count++ >= 4999) {
                    count = 0;

                    System.out.println("发送测试信息");

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                log.error(e);
            }
        }
    }

    @Override
    public void recordTestInfo(String testInfo) {
        String updateSql = "UPDATE c1_send_test SET `UPDATE_DATE` = :UPDATE_DATE WHERE `ID` = :ID";

        Runnable recordTestInfoRunnable = () -> {
            Map<String, Object> sendMap = Maps.newHashMap();

            sendMap.put("ID", testInfo);

            sendMap.put("UPDATE_DATE", new Date());

            ApplicationContextHolder.getBean(NamedParameterJdbcOperations.class, NamedParameterJdbcOperations.class.getName() + ".2").update(updateSql, sendMap);
        };

        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(recordTestInfoRunnable, null, true));
    }

    @Override
    public void recordTestInfos() {
        System.out.println("测试信息转存到mysql");
    }
}