package top.cardone.api.vx.log.operateLog

import top.cardone.context.ApplicationContextHolder
import top.cardone.log.service.OperateLogService

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["operateLogId": input.operateLogId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.operateLogId)) {
//          throw new CodeException("operateLogId required", "操作日志标识必填")
//      }
    }

    def func(input) {
        ApplicationContextHolder.getBean(OperateLogService.class).findOneByOperateLogId(input)
    }

    def output(output) {
        def newOutput = [:]

        newOutput?.batchNo = output?.batch_no
        newOutput?.beginDate = output?.begin_date
        newOutput?.createdByCode = output?.created_by_code
        newOutput?.createdById = output?.created_by_id
        newOutput?.createdDate = output?.created_date
        newOutput?.dataStateCode = output?.data_state_code
        newOutput?.departmentCode = output?.department_code
        newOutput?.endDate = output?.end_date
        newOutput?.flagCode = output?.flag_code
        newOutput?.flagObjectCode = output?.flag_object_code
        newOutput?.jsonData = output?.json_data
        newOutput?.lastModifiedByCode = output?.last_modified_by_code
        newOutput?.lastModifiedById = output?.last_modified_by_id
        newOutput?.lastModifiedDate = output?.last_modified_date
        newOutput?.message = output?.message
        newOutput?.objectCode = output?.object_code
        newOutput?.objectId = output?.object_id
        newOutput?.objectTypeCode = output?.object_type_code
        newOutput?.operateLogId = output?.operate_log_id
        newOutput?.orderBy = output?.order_by_
        newOutput?.orgCode = output?.org_code
        newOutput?.personalCode = output?.personal_code
        newOutput?.personalId = output?.personal_id
        newOutput?.siteCode = output?.site_code
        newOutput?.stateCode = output?.state_code
        newOutput?.systemInfoCode = output?.system_info_code
        newOutput?.typeCode = output?.type_code
        newOutput?.version = output?.version_

        newOutput
    }
}