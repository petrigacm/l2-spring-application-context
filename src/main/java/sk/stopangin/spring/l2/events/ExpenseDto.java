package sk.stopangin.spring.l2.events;

import java.io.Serializable;

public class ExpenseDto implements Serializable {
    private Long categoryId;
    private String description;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
