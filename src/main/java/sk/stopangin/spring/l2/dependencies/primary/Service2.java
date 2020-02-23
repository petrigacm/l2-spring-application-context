package sk.stopangin.spring.l2.dependencies.primary;

import org.springframework.stereotype.Service;

@Service
public class Service2 implements SomeService {
    @Override
    public void printHelloWorld() {
        System.out.println("No!");
    }
}
