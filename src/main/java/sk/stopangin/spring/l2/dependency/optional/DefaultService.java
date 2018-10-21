package sk.stopangin.spring.l2.dependency.optional;

public class DefaultService implements SomeService {
    @Override
    public void doSomething() {
        System.out.println("hello from default service");
    }
}
