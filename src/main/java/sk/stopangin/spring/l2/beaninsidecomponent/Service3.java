package sk.stopangin.spring.l2.beaninsidecomponent;

import org.springframework.stereotype.Service;

@Service
public class Service3 {
    private Service2 service2;

    public Service3(Service2 service2) {
        this.service2 = service2;
    }

    public void doSomething() {
        System.out.println("----");
        service2.doSomething();
        System.out.println("----");
    }
}
