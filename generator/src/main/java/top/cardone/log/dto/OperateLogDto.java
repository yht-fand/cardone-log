package top.cardone.log.dto;

import top.cardone.log.po.OperateLog;

/**
 * 操作日志
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class OperateLogDto extends OperateLog {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 885307839342826924L;
}