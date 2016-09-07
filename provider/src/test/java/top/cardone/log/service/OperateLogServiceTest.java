package top.cardone.log.service;

import top.cardone.ProviderApplication;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.context.ApplicationContextHolder;

@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@WebIntegrationTest(value = {"spring.profiles.active=test"})
@SpringApplicationConfiguration(classes = ProviderApplication.class)
public class OperateLogServiceTest {
    @Test
    public void pageCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void pageCache1() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void findListCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void findOneCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void readListCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void readOneCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void deleteCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void deleteAllCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void deleteByIdsCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void deleteListCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void findListCache1() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void findOneCache1() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void insertCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void insertByNotExistsCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void insertListCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void insertListByNotExistsCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void readListCache1() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void readOneCache1() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void saveCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void updateCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void updateListCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void saveListCache() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }

    @Test
    public void findOneByDepartmentRoleId() throws Exception {
//        ApplicationContextHolder.getBean(OperateLogService.class);
    }
}