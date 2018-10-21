package sk.stopangin.spring.l2.dependency.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CircularService2 {


    @PostConstruct
    public void init(){
        System.out.println("postconstruct from CircularService2");
    }

    public CircularService2() {
        System.out.println("creating CircularService2");

    }

    @Autowired
    private CircularService1 circularService1;

    public CircularService1 getCircularService1() {
        return circularService1;
    }

    public void setCircularService1(CircularService1 circularService1) {
        this.circularService1 = circularService1;
    }
}
