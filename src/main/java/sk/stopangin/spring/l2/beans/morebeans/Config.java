package sk.stopangin.spring.l2.beans.morebeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import sk.stopangin.spring.l2.beans.morebeans.p1.SomeServiceImpl1;

@Configuration
@ComponentScan
public class Config {

    @Bean("someBeanName")
    @Primary
    public SomeService serviceImpl1() {
        SomeServiceImpl1 serviceImpl1 = new SomeServiceImpl1();
        serviceImpl1.setName("gajaka");
        return serviceImpl1;
    }
}
