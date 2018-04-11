package top.cardone.api.vx.log

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * @author yht
 */
@Controller
@RequestMapping("/vx/log/operateLog")
class OperateLogController {
    /**
     * /c0001.json begin
     ** xx/
     @RequestMapping ( " / c 0 0 0 1 . j s o n " )
     @ResponseBody
      Object c0001Json(HttpServletRequest request) {
      ApplicationContextHolder.getBean(WebSupport.class).func(request, { input -> ApplicationContextHolder.getBean(OperateLogService.class).insertByNotExistsCache(input) })
      }/** /c0001.json end  **/
}