package sk.stopangin.spring.l2.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import sk.stopangin.spring.l2.NewServiceForDifferentProject;
import sk.stopangin.spring.l2.config.Config;
@Configuration
//@ImportResource("/spring/beans.xml")
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableAsync
public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(Runner.class);
        ExpenseService expenseService = ac2.getBean(ExpenseService.class);
        ExpenseDto expenseDto = new ExpenseDto();
        expenseDto.setCategoryId(1l);
        expenseDto.setDescription("some description");
        expenseService.createExpense(expenseDto);
    }
}
