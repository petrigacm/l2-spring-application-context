package sk.stopangin.spring.l2.dependencies.optional;

public class DefaultDependency implements SomeService {
    @Override
    public void doSomething() {
        System.out.println("hello from default service");
    }
}
