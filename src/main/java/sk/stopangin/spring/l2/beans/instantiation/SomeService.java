package sk.stopangin.spring.l2.beans.instantiation;

import org.springframework.stereotype.Service;

@Service
public class SomeService {
    public SomeService() {
        System.out.println("Instantiating using constructor");
    }
}
