package sk.stopangin.spring.l2.morebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.stopangin.spring.l2.morebeans.p1.ServiceImpl1;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        Service bean1 = ac.getBean(Service.class);
        bean1.doSomething();
        String[] beanNamesForType = ac.getBeanNamesForType(Service.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
            ServiceImpl1 bean = (ServiceImpl1)ac.getBean(s);
            bean.doSomething();
        }
    }
}
