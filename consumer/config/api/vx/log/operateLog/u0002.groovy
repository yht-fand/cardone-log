package top.cardone.api.vx.log.operateLog

import org.apache.commons.lang3.StringUtils
import top.cardone.log.service.OperateLogService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0002 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.message = input?.message
		newInput?.objectCode = input?.objectCode
		newInput?.objectId = input?.objectId
		newInput?.objectTypeCode = input?.objectTypeCode
		newInput?.operateLogId = input?.operateLogId
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.typeCode = input?.typeCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.operateLogId)) {
//          throw new CodeException("operateLogId required", "操作日志标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "操作日志名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "操作日志名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "操作日志名称需小于{0}个字符", 255)
//      }

		def readOne = ["operateLogCode": input.operateLogCode, "object_id": "operateLogId", "dataStateCode": "1"]

		def dbOperateLogId = ApplicationContextHolder.getBean(OperateLogService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbOperateLogId, input.operateLogId)) {
			throw new CodeException("operateLogId already exists", "操作日志编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(OperateLogService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}