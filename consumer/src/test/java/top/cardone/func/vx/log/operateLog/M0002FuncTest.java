package top.cardone.func.vx.log.operateLog;

import com.google.common.base.Charsets;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.ConsumerApplication;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.io.IOException;

@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConsumerApplication.class, value = {"spring.profiles.active=test"}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class M0002FuncTest {
    @Value("http://localhost:${server.port:8765}${server.context-path:}/vx/log/operateLog/m0002.json")
    private String funcUrl;

    @Value("${app.root}/src/test/resources/top/cardone/func/vx/log/operateLog/M0002FuncTest.func.input.json")
    private Resource funcInputResource;

    @Value("${app.root}/src/test/resources/top/cardone/func/vx/log/operateLog/M0002FuncTest.func.output.json")
    private Resource funcOutputResource;

    private HttpHeaders headers;

    @Before
    public void setup() {
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
        headers.set("token", (String) ApplicationContextHolder.getBean(Func1.class, "readCredentialsForAesFunc").func("admin"));
        headers.set("username", "admin");

        if (!funcInputResource.exists()) {
            try {
                FileUtils.write(funcInputResource.getFile(), "{}", Charsets.UTF_8);
            } catch (IOException e) {
                log.debug(e);
            }
        }
    }

    @Test
    public void func() throws Exception {
        String input = FileUtils.readFileToString(funcInputResource.getFile(), Charsets.UTF_8);

        HttpEntity<String> httpEntity = new HttpEntity<>(input, headers);

        String output = new org.springframework.boot.test.web.client.TestRestTemplate().postForObject(funcUrl, httpEntity, String.class);

        log.debug(output);

        try {
            FileUtils.write(funcOutputResource.getFile(), output, Charsets.UTF_8);
        } catch (IOException e) {
            log.debug(e);
        }
    }
}