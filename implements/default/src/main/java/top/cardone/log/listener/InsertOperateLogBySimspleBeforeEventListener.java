package top.cardone.log.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationListener;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.event.SimpleBeforeEvent;
import top.cardone.log.action.InsertOperateLogByEventListenerAction;

/**
 * @author cardo on 2017/7/18 0018.
 */
@Log4j2
public class InsertOperateLogBySimspleBeforeEventListener implements ApplicationListener<SimpleBeforeEvent> {
    @Override
    public void onApplicationEvent(SimpleBeforeEvent simpleBeforeEvent) {
        ApplicationContextHolder.getBean(InsertOperateLogByEventListenerAction.class).action(simpleBeforeEvent);
    }
}