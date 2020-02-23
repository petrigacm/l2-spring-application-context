package sk.stopangin.spring.l2.beans.beaninsidecomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Service1 {

    @Autowired
    private Service2 service2;

    @PostConstruct
    public void init() {
        System.out.println("service 1 initialized");
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
