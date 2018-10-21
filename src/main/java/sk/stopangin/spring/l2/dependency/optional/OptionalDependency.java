package sk.stopangin.spring.l2.dependency.optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class OptionalDependency {

    @Autowired(required = false)
    private SomeService service = new DefaultService();

    @PostConstruct
    public void init() {
        service.doSomething();
    }

}
