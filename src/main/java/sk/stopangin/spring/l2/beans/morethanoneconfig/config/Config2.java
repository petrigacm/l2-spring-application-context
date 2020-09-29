package sk.stopangin.spring.l2.beans.morethanoneconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.stopangin.spring.l2.beans.morethanoneconfig.Service;
import sk.stopangin.spring.l2.beans.morethanoneconfig.p1.ServiceImpl1;

@Configuration
public class Config2 {

    @Bean
    public Service service() {
        ServiceImpl1 serviceImpl1 = new ServiceImpl1();
        serviceImpl1.setName("gajaka777");
        return serviceImpl1;
    }
}
