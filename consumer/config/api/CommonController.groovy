package top.cardone.api

import com.google.code.kaptcha.Constants
import org.apache.commons.io.IOUtils
import org.apache.shiro.SecurityUtils
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import top.cardone.context.ApplicationContextHolder
import top.cardone.web.support.WebSupport

import javax.imageio.ImageIO
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

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
    Object allJson(HttpServletRequest request) throws IOException {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request, !log.isDebugEnabled(), request.getServletPath())
    }

    @RequestMapping(value = "/verifyCode.jpg")
    void loginValidationCode(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
        response.setDateHeader("Expires", 0)
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate")
        response.addHeader("Cache-Control", "post-check=0, pre-check=0")
        response.setHeader("Pragma", "no-cache")
        response.setContentType("image/jpeg")

        def verifyCode = ApplicationContextHolder.getBean(com.google.code.kaptcha.Producer.class).createText()

        SecurityUtils.getSubject().getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, verifyCode)

        def bi = ApplicationContextHolder.getBean(com.google.code.kaptcha.Producer.class).createImage(verifyCode)

        def out = null

        try {
            out = response.getOutputStream()

            ImageIO.write(bi, "jpg", out)

            out.flush()
        } finally {
            IOUtils.closeQuietly(out)
        }
    }
}