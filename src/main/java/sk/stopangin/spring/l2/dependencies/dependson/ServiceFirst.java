package sk.stopangin.spring.l2.dependencies.dependson;

import org.springframework.stereotype.Service;

@Service("gajaka")
public class ServiceFirst {
    public ServiceFirst() {
        System.out.println("serviceFirst created");
    }
}
