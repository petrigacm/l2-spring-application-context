package sk.stopangin.spring.l2.beans.beaninsidecomponent;

import javax.annotation.PostConstruct;

public class Service3 {
    private Service2 service2;

    public Service3(Service2 service2) {
        this.service2 = service2;
    }

    @PostConstruct
    public void init() {
        System.out.println("service 3 initialized");
    }

    public void doSomething() {
        System.out.println("service 2 instance in service2");
    }
}
