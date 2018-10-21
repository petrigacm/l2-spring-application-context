package sk.stopangin.spring.l2.dependency.dependant;

import org.springframework.stereotype.Service;

@Service
public class ServiceSecond {
    public ServiceSecond() {
        System.out.println("serviceSecond created");
    }
}
