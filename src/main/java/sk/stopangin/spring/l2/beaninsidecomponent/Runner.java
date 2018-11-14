package sk.stopangin.spring.l2.beaninsidecomponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Runner {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Runner.class);
        Service3 service3 = ac.getBean(Service3.class);
        service3.doSomething();
    }
}
