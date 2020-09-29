package sk.stopangin.spring.l2.beans.morethanoneconfig;

import org.springframework.context.annotation.*;
import sk.stopangin.spring.l2.beans.morethanoneconfig.p1.ServiceImpl1;

@Configuration
//@ImportResource("/spring/beans2.xml")
@ComponentScan
public class Config {

    @Bean
    public Service service() {
        ServiceImpl1 serviceImpl1 = new ServiceImpl1();
        serviceImpl1.setName("gajaka");
        return serviceImpl1;
    }
}
