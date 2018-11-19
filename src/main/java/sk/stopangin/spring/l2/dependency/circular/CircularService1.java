package sk.stopangin.spring.l2.dependency.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CircularService1 {
    @PostConstruct
    public void init() {
        System.out.println("postconstruct from CircularService1");
    }



    private CircularService2 circularService2;


    public CircularService2 getCircularService2() {
        return circularService2;
    }

    @Autowired
    public void setCircularService2(CircularService2 circularService2) {
        this.circularService2 = circularService2;
    }
}
