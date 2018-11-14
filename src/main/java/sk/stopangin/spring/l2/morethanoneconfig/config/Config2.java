package sk.stopangin.spring.l2.morethanoneconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import sk.stopangin.spring.l2.morethanoneconfig.Service;
import sk.stopangin.spring.l2.morethanoneconfig.p1.ServiceImpl1;

@Configuration
public class Config2 {

    @Bean
    public Service service() {
        ServiceImpl1 serviceImpl1 = new ServiceImpl1();
        serviceImpl1.setName("gajaka777");
        return serviceImpl1;
    }
}
