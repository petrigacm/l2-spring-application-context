package sk.stopangin.spring.l2.events;

public class ExpenseCreatedEvent extends Event<Expense> {
    public ExpenseCreatedEvent(Expense data) {
        super(data);
    }
}
