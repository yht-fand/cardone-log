package top.cardone.api.vx.log.operateLog

import top.cardone.context.ApplicationContextHolder
import top.cardone.log.service.OperateLogService

class r0002 implements java.io.Serializable {
    def input(input) {
        input
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(OperateLogService.class).findListByKeyword(input)
    }

    def output(output) {
        def newOutput = []

        for (def outputItem : output) {
            newOutput.add(['label': outputItem['name'], 'value': outputItem['c1_operate_log_code']])
        }

        newOutput
    }
}