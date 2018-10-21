package sk.stopangin.spring.l2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sk.stopangin.spring.l2.config.Config;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
        Arrays.stream(ac.getBeanDefinitionNames()).forEach(System.out::println);

        ApplicationContext ac2 = new AnnotationConfigApplicationContext(Config.class);
        Arrays.stream(ac2.getBeanDefinitionNames()).forEach(System.out::println);

        NewServiceForDifferentProject bean = ac2.getBean(NewServiceForDifferentProject.class);
        System.out.println(bean.getXxx());

        System.out.println(bean.getStrings());

    }
}
