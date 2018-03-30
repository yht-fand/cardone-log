package top.cardone.log.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationListener;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleEvent;
import top.cardone.log.action.InsertOperateLogByEventListenerAction;

/**
 * @author cardo on 2017/7/18 0018.
 */
@Log4j2
public class InsertOperateLogBySimpleEventListener implements ApplicationListener<SimpleEvent> {
    @Override
    public void onApplicationEvent(SimpleEvent simpleEvent) {
        ApplicationContextHolder.getBean(InsertOperateLogByEventListenerAction.class).action(simpleEvent);
    }
}
