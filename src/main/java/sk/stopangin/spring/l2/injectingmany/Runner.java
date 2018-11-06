package sk.stopangin.spring.l2.injectingmany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration
//@ComponentScan
public class Runner {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Runner.class);
        ProcessingService processingService = ac.getBean(ProcessingService.class);
        String processed = processingService.doProcess("hello i'm test string");
        System.out.println(processed);
    }
}
