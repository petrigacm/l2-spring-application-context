package sk.stopangin.spring.l2.dependencies.dependant;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("gajaka")
public class ServiceSecond {
    public ServiceSecond() {
        System.out.println("serviceSecond created");
    }
}
