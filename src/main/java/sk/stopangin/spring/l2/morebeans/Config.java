package sk.stopangin.spring.l2.morebeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sk.stopangin.spring.l2.morebeans.p1.ServiceImpl1;

@Configuration
@ComponentScan
public class Config {

    @Bean
    public Service service() {
        ServiceImpl1 serviceImpl1 = new ServiceImpl1();
        serviceImpl1.setName("gajaka");
        return serviceImpl1;
    }
}
