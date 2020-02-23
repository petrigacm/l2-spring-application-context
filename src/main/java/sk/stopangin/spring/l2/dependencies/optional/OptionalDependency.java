package sk.stopangin.spring.l2.dependencies.optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class OptionalDependency {

    private SomeService service = new DefaultDependency();

    @PostConstruct
    public void init() {
        service.doSomething();
    }

    @Autowired(required = false)
    public void setService(SomeService service) {
        this.service = service;
    }
}
