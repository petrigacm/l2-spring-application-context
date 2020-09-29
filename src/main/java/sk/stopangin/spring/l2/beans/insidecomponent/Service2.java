package sk.stopangin.spring.l2.beans.insidecomponent;

import javax.annotation.PostConstruct;

public class Service2 {
    @PostConstruct
    public void init() {
        System.out.println("service 2 initialized");
    }

    public void doSomething() {
        System.out.println("hello from service 2");
    }
}
