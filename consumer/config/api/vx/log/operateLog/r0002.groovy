package api.vx.log.operateLog

import org.apache.commons.lang3.StringUtils
import top.cardone.log.service.OperateLogService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class r0002 {
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
			newOutput.add(['label': outputItem['name'], 'value': outputItem['operateLog_code']])
        }

        newOutput
    }
}