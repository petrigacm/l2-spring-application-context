package sk.stopangin.spring.l2.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Long createExpense(ExpenseDto expenseDto) {
        Expense expense = new Expense();
        expense.setCategoryId(expenseDto.getCategoryId());
        expense.setDescription(expenseDto.getDescription());
        expense.setId(1l);
        applicationContext.publishEvent(new ExpenseCreatedEvent(expense));
        return expense.getId();
    }
}
