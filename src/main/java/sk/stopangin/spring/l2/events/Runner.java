package sk.stopangin.spring.l2.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.stopangin.spring.l2.config.Config;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(Config.class);
        ExpenseService expenseService = ac2.getBean(ExpenseService.class);
        ExpenseDto expenseDto = new ExpenseDto();
        expenseDto.setCategoryId(1l);
        expenseDto.setDescription("some description");
        expenseService.createExpense(expenseDto);
    }
}
