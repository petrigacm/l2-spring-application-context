package sk.stopangin.spring.l2.dependencies.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Runner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Runner.class);

        SomeService service = applicationContext.getBean(SomeService.class);

        service.printHelloWorld();
    }
}
