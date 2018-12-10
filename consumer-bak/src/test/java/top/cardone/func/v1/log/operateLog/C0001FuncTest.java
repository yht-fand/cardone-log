package top.cardone.func.v1.log.operateLog;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import top.cardone.ConsumerApplication;
import lombok.extern.log4j.Log4j2;
import lombok.val;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;
import top.cardone.context.ApplicationContextHolder;

import java.util.Map;

@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConsumerApplication.class, value = {"spring.profiles.active=test"}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class C0001FuncTest {
    @Value("http://localhost:${server.port:8765}${server.servlet.context-path:}/v1/log/operateLog/c0001.json")
    private String funcUrl;

    @Value("file:src/test/resources/top/cardone/func/v1/log/operateLog/C0001FuncTest.func.input.json")
    private Resource funcInputResource;

    @Value("file:src/test/resources/top/cardone/func/v1/log/operateLog/C0001FuncTest.func.output.json")
    private Resource funcOutputResource;

    @Test
    public void func() throws Exception {
        if (!funcInputResource.exists()) {
            FileUtils.write(funcInputResource.getFile(), "{}", Charsets.UTF_8);
        }

        val input = FileUtils.readFileToString(funcInputResource.getFile(), Charsets.UTF_8);

        Map<String, Object> parametersMap = ApplicationContextHolder.getBean(Gson.class).fromJson(input, Map.class);

        Assert.assertFalse("输入未配置", CollectionUtils.isEmpty(parametersMap));

        Map<String, Object> output = Maps.newLinkedHashMap();

        for (val parametersEntry : parametersMap.entrySet()) {
            val body = ApplicationContextHolder.getBean(Gson.class).toJson(parametersEntry.getValue());

            val headers = new HttpHeaders();

            headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
            headers.set("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
            headers.set("collectionStationCodeForToken", parametersEntry.getKey().split(":")[0]);
            headers.set("token", ApplicationContextHolder.getBean(org.apache.shiro.authc.credential.PasswordService.class).encryptPassword(headers.get("collectionStationCodeForToken").get(0)));

            val httpEntity = new HttpEntity<>(body, headers);

            val json = new org.springframework.boot.test.web.client.TestRestTemplate().postForObject(funcUrl, httpEntity, String.class);

            val value = ApplicationContextHolder.getBean(Gson.class).fromJson(json, Map.class);

            output.put(parametersEntry.getKey(), value);
        }

        FileUtils.write(funcOutputResource.getFile(), ApplicationContextHolder.getBean(Gson.class).toJson(output), Charsets.UTF_8);
    }
}