package sk.stopangin.spring.l2.beans.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Runner.class);
        ServiceUsingCache1 serviceUsingCache1 = applicationContext.getBean(ServiceUsingCache1.class);
        ServiceUsingCache2 serviceUsingCache2 = applicationContext.getBean(ServiceUsingCache2.class);

        serviceUsingCache1.doServiceMethod("service1Data");
        serviceUsingCache2.doServiceMethod("service2Data");
        serviceUsingCache1.doServiceMethod("service1Data");
    }
}
