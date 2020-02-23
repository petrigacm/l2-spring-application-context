package sk.stopangin.spring.l2.dependencies.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CircularService1 {

    private CircularService2 circularService2;

    @PostConstruct
    public void init() {
        System.out.println("CircularService1 initialized");
    }

    @Autowired
    public void setCircularService2(CircularService2 circularService2) {
        this.circularService2 = circularService2;
    }

    public void printHelloWorld() {
        System.out.println("Hello world from circular service 1");
        circularService2.printHelloWorld();
    }

}
