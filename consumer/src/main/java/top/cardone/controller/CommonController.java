package top.cardone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.web.support.FuncBindSupport;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/1/4.
 */
@Controller("top.cardone.controller.Controller")
public class CommonController {
    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    /**
     * 所有json文件
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/**/*.json")
    @ResponseBody
    public Object allJson(HttpServletRequest request) throws IOException {
        return ApplicationContextHolder.getBean(FuncBindSupport.class).func(request);
    }

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);

//        throw new CodeException("000000", "test");

        return "welcome.ftl";
    }
}