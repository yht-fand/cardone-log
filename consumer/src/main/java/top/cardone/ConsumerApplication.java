package top.cardone;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 主执行端
 *
 * @author yao hai tao
 */
@Configuration
@ComponentScan(basePackages = {"top.cardone"})
@Import({
        org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.class,
        org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration.class
})
@ImportResource({"file:config/applicationContext.xml", "file:config/applicationContext.groovy"})
public class ConsumerApplication {
    /**
     * 主方法
     *
     * @param args 参数
     * @throws Exception 异常
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}