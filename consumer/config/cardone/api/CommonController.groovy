package top.cardone.api

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import top.cardone.context.ApplicationContextHolder
import top.cardone.web.support.WebSupport

import javax.servlet.http.HttpServletRequest

/**
 * @author cardone-home-001 on 2016/1/4.
 */
@Controller
class CommonController {
    static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CommonController.class)

    /**
     * 所有json文件
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/**/*")
    @ResponseBody
    Object allJson(HttpServletRequest request) {
        ApplicationContextHolder.getBean(WebSupport.class).func(request, request.getServletPath(), !log.isDebugEnabled())
    }
}