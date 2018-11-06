package sk.stopangin.spring.l2.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(Runner.class);
        ServiceUsingMutlipleCaches serviceUsingCache1 = ac2.getBean(ServiceUsingMutlipleCaches.class);

        serviceUsingCache1.doServiceMethod("service1Data");
        serviceUsingCache1.doServiceMethod("service1Data");

    }
}
