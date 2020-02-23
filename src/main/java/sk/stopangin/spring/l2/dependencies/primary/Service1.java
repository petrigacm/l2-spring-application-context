package sk.stopangin.spring.l2.dependencies.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Service1 implements SomeService {
    @Override
    public void printHelloWorld() {
        System.out.println("Hello world");
    }
}
