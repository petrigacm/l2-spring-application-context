package sk.stopangin.spring.l2.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("TEST")
public class H2DataSource implements DataSource {

    @Value("${h2.datasource.username:default-user}")
    private String username;

    @Value("${h2.datasource.password:default-pass}")
    private String password;

    @Override
    public void init() {
        System.out.println("Initializing H2 data source with username '" + username + "' and password '" + password + "'");
    }
}
