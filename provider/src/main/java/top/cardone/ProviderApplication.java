package top.cardone;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 主执行端
 *
 * @author yao hai tao
 */
@Log4j2
@ComponentScan
public class ProviderApplication {
    /**
     * 主方法
     *
     * @param args 参数
     * @throws Exception 异常
     */
    public static void main(String[] args) throws Exception {
        new FileSystemXmlApplicationContext(new String[]{"${spring.configLocation}"}, true, SpringApplication.run(ProviderApplication.class, args));
    }
}