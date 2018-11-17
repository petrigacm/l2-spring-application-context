package sk.stopangin.spring.l2.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

@Component("applicationEventMulticaster")
public class MyApplicationEventMulticaster extends SimpleApplicationEventMulticaster {
    @Override
    public void multicastEvent(ApplicationEvent event, ResolvableType eventType) {
        System.out.println("before multicasting");
        super.multicastEvent(event,eventType);
        System.out.println("after multicasting");
    }
}
