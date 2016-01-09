package top.cardone.log.po;

import java.util.Date;

/**
 * 操作日志
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class OperateLog implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 351776930676710174L;

    /**
     * 创建人代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String createdByCode;

    /**
     * 创建时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date createdDate;

    /**
     * 部门代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String departmentCode;

    /**
     * 消息
     */
    @lombok.Getter
    @lombok.Setter
    protected String message;

    /**
     * 操作日志代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String operateLogCode;

    /**
     * 操作日志标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String operateLogId;

    /**
     * 组织代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String orgCode;

    /**
     * 类别代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String typeCode;
}