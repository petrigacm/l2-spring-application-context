package sk.stopangin.spring.l2.morethanoneconfig.p1;

import sk.stopangin.spring.l2.morethanoneconfig.Service;

import javax.annotation.PostConstruct;

public class ServiceImpl1 implements Service {
    private String name = "some value";

    @PostConstruct
    public void init(){
        System.out.println("initialized"+name);
    }

    @Override
    public void doSomething() {
        System.out.println("s1 is doing something with value:" + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
