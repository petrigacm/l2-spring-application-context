package sk.stopangin.spring.l2.dependency.dependant;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("gajaka")
public class ServiceFirst {
    public ServiceFirst() {
        System.out.println("serviceFirst created");
    }
}
