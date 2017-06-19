package top.cardone.api.vx.log.operateLog

import org.apache.commons.lang3.StringUtils
import top.cardone.log.service.OperateLogService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0001 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.message = input?.message
		newInput?.objectCode = input?.objectCode
		newInput?.objectId = input?.objectId
		newInput?.objectTypeCode = input?.objectTypeCode
		newInput?.operateLogId = input?.operateLogId
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.typeCode = input?.typeCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.operateLogCode)) {
//          throw new CodeException("operateLogCode required", "操作日志编号必填")
//      }
//
//      if (StringUtils.length(input?.operateLogCode) < 4) {
//          throw new CodeException("operateLogCode minlength", "操作日志编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.operateLogCode) > 255) {
//          throw new CodeException("operateLogCode maxlength", "操作日志编号需小于{0}个字符", 255)
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
		
		def readOne = ['operateLogCode': input.operateLogCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(OperateLogService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("operateLogCode already exists", "操作日志编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}