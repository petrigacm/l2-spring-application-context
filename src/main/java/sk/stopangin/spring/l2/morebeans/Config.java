package sk.stopangin.spring.l2.morebeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import sk.stopangin.spring.l2.morebeans.p1.ServiceImpl1;

@Configuration
@ComponentScan
public class Config {

    @Bean("someBeanName")
    @Primary
    public Service serviceImpl1() {
        ServiceImpl1 serviceImpl1 = new ServiceImpl1();
        serviceImpl1.setName("gajaka");
        return serviceImpl1;
    }
}
