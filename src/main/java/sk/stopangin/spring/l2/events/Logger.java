package sk.stopangin.spring.l2.events;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Logger implements EventLogger {

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent cse) {
        System.out.println("Handling context refreshed event. ");
    }

    @EventListener
    @Async
    public void logEventCreated(ExpenseCreatedEvent expenseCreatedEvent) {
        System.out.println("[From thread id:" + Thread.currentThread().getId() + "] Event created fired with data: " + expenseCreatedEvent.getData());
    }


    @EventListener(condition = "#expenseCreatedEvent.data.categoryId.equals(1l)")
    public void logEventCreatedOneCategory(ExpenseCreatedEvent expenseCreatedEvent) {
        System.out.println("[From thread id:" + Thread.currentThread().getId() + "] Conditional event created fired with data: " + expenseCreatedEvent.getData());
    }
}
