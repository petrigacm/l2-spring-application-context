package sk.stopangin.spring.l2.beans.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class SomeService implements InitializingBean, DisposableBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Calling post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Calling pre destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Calling after properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Calling destroy");
    }
}
