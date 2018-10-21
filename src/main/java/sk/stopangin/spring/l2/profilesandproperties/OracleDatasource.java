package sk.stopangin.spring.l2.profilesandproperties;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("PROD")
public class OracleDatasource implements DataSource {
    @Override
    public void init() {
        System.out.println("hello from oracle datasource");
    }
}
