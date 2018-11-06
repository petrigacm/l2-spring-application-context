package sk.stopangin.spring.l2.morethanoneconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        Service bean = ac.getBean(Service.class);
        bean.doSomething();
    }
}
