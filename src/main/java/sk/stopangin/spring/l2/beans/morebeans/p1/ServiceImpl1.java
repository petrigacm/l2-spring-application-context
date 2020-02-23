package sk.stopangin.spring.l2.beans.morebeans.p1;

import sk.stopangin.spring.l2.beans.morebeans.Service;

@org.springframework.stereotype.Service
public class ServiceImpl1 implements Service {
    private String name = "some value";

    @Override
    public void doSomething() {
        System.out.println("s1 is doing something with value:" + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
