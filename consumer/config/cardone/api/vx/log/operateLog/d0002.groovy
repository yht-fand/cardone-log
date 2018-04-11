package top.cardone.api.vx.log.operateLog

import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException
import top.cardone.log.service.OperateLogService

class d0002 implements java.io.Serializable {
    def input(input) {
        def operateLogIds = input?.operateLogIds?.split(",")

        if (!operateLogIds) {
            throw new CodeException("operateLogIds required", "操作日志标识集合必填")
        }

        def operateLogIdList = []

        for (def operateLogId : operateLogIds) {
            operateLogIdList.add(["operateLogId": operateLogId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["operateLogIds": operateLogIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(OperateLogService.class).updateListCache(input?.operateLogIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}