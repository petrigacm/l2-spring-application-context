package sk.stopangin.spring.l2.dependencies.injectingmany;

import org.springframework.stereotype.Component;

@Component
public class UppercaseProcessor implements StringItemProcessor {
    @Override
    public String processItem(String item) {
        return item.toUpperCase();
    }
}
