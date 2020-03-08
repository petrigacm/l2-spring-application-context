package sk.stopangin.spring.l2.beans.morebeans.p1;

import sk.stopangin.spring.l2.beans.morebeans.SomeService;

@org.springframework.stereotype.Service
public class SomeServiceImpl1 implements SomeService {
    private String name = "some value";

    @Override
    public void doSomething() {
        System.out.println("s1 is doing something with value:" + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
