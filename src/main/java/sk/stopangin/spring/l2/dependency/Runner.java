package sk.stopangin.spring.l2.dependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableAsync
public class Runner {
    public static void main(String[] args) {
      new AnnotationConfigApplicationContext(Runner.class);
    }
}
