package top.cardone.log.message;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.log.service.OperateLogService;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by cardone-home-001 on 2016/4/9.
 */
@Log4j2
public class TestInfoMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        if (message instanceof MapMessage) {
            MapMessage mapMessage = (MapMessage) message;

            try {
                String id = mapMessage.getString("ID");

                if (StringUtils.isBlank(id)) {
                    id = mapMessage.getStringProperty("ID");
                }

                ApplicationContextHolder.getBean(OperateLogService.class).recordTestInfo(id);
            } catch (JMSException e) {
                log.error(e);
            }
        }
    }
}
