package sk.stopangin.spring.l2.beaninsidecomponent;

import org.springframework.context.annotation.Bean;

@org.springframework.stereotype.Service
public class Service {
    public void doSomething() {
        System.out.println("something from service one");
    }

    @Bean
    public Service2 service2() {
        return new Service2();
    }
}
