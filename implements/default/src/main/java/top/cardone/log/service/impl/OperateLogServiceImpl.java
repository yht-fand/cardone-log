package top.cardone.log.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;
import top.cardone.log.dao.OperateLogDao;

/**
 * 操作日志服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class OperateLogServiceImpl extends PageServiceImpl<OperateLogDao> implements top.cardone.log.service.OperateLogService {

}