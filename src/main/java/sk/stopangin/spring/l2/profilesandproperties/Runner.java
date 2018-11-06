package sk.stopangin.spring.l2.profilesandproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//@Configuration
//@ComponentScan
//@PropertySource("classpath:application.properties")
public class Runner {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Runner.class);
        DataSource dataSource = ac.getBean(DataSource.class);
        dataSource.init();
    }
}
