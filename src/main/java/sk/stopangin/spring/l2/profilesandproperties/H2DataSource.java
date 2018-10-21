package sk.stopangin.spring.l2.profilesandproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("TEST")
public class H2DataSource implements DataSource {
    @Value("${property1}")
    private String prop;


    @Override
    public void init() {
        System.out.println("hello from h2 datasource");
    }
}
