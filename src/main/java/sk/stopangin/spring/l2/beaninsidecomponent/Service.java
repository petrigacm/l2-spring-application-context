package sk.stopangin.spring.l2.beaninsidecomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Service2 service2;

    @PostConstruct
    public void doSomethingWithService2() {
        System.out.println("service 2 instance in service");
        System.out.println(service2);
    }

    @Bean
    public Service2 service2() {
        return new Service2();
    }

    @Bean
    public Service3 service3() {
        return new Service3(service2());
    }
}
