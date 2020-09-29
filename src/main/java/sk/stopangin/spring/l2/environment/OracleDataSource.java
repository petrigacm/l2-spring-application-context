package sk.stopangin.spring.l2.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("PROD")
public class OracleDataSource implements DataSource {

    @Value("${oracle.datasource.username}")
    private String username;

    @Value("${oracle.datasource.password}")
    private String password;

    @Override
    public void init() {
        System.out.println("Initializing Oracle data source with username '" + username + "' and password '" + password + "'");
    }
}
