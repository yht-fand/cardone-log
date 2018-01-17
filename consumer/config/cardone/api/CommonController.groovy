package top.cardone.api

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import top.cardone.context.ApplicationContextHolder
import top.cardone.web.support.WebSupport

import javax.servlet.http.HttpServletRequest

/**
 * Created by cardone-home-001 on 2016/1/4.
 */
@Controller
class CommonController {
    static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(CommonController.class)

    /**
     * 所有json文件
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/**/*")
    @ResponseBody
    def allJson(HttpServletRequest request) throws IOException {
        ApplicationContextHolder.getBean(WebSupport.class).func(request, !log.isDebugEnabled(), request.getServletPath())
    }
}