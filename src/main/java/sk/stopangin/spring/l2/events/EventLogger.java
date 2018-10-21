package sk.stopangin.spring.l2.events;

import org.springframework.context.event.ContextRefreshedEvent;

public interface EventLogger {
    void onApplicationEvent(ContextRefreshedEvent cse);

    void logEventCreated(ExpenseCreatedEvent expenseCreatedEvent);

    void logEventCreatedOneCategory(ExpenseCreatedEvent expenseCreatedEvent);

}
