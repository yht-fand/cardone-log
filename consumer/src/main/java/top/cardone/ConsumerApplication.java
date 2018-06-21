package top.cardone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import top.cardone.context.annotation.CardOneAnnotationBeanNameGenerator;

/**
 * 主执行端
 *
 * @author yao hai tao
 */
@Configuration
@ComponentScan(basePackages = {"top.cardone"}, nameGenerator = CardOneAnnotationBeanNameGenerator.class, lazyInit = true)
@Import({
        org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.class,
        org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration.class
})
@ImportResource({"file:config/applicationContext.xml", "file:config/applicationContext.groovy"})
@EnableAutoConfiguration
public class ConsumerApplication {
    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}