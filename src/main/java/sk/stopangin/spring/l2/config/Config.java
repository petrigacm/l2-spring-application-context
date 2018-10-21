package sk.stopangin.spring.l2.config;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import sk.stopangin.spring.l2.NewServiceForDifferentProject;
import sk.stopangin.spring.l2.StatisticsService;
import sk.stopangin.spring.l2.dependency.circular.CircularService1;

import java.util.Date;

@Configuration
@ImportResource("/spring/beans.xml")
@ComponentScan(basePackageClasses = NewServiceForDifferentProject.class)
@PropertySource("classpath:application.properties")
@EnableAsync
public class Config {
    @Bean
    public StatisticsService statisticsService() {
        return new NewServiceForDifferentProject();
    }

    @Bean
    @Primary
    public String dateMeta() {
        return "current date is:" + (new Date());
    }

    @Bean
    public String randomString() {
        return "42";
    }

}
