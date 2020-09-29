package sk.stopangin.spring.l2.dependencies.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CircularService2 {

    private CircularService1 circularService1;

    @PostConstruct
    public void init() {
        System.out.println("CircularService2 initialized");
    }

    @Autowired
    public void setCircularService1(CircularService1 circularService1) {
        this.circularService1 = circularService1;
    }

    public void printHelloWorld() {
        System.out.println("Hello world from circular service 2");
    }
}
