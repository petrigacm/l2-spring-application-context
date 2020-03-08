package sk.stopangin.spring.l2.beans.morebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.stopangin.spring.l2.beans.morebeans.p1.SomeServiceImpl1;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        SomeService bean1 = ac.getBean(SomeService.class);
        bean1.doSomething();
        String[] beanNamesForType = ac.getBeanNamesForType(SomeService.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
            SomeServiceImpl1 bean = (SomeServiceImpl1)ac.getBean(s);
            bean.doSomething();
        }
    }
}
