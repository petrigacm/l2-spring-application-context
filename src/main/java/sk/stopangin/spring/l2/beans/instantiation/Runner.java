package sk.stopangin.spring.l2.beans.instantiation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Runner {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Runner.class);
    }

    @Bean
    public SomeExternalService someExternalService() {
        System.out.println("Initializing using @Bean annotation");
        return new SomeExternalService();
    }
}
