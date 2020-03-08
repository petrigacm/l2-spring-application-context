package sk.stopangin.spring.l2.beans.stereotypes;

import org.springframework.stereotype.Repository;

@Repository
public class SomeRepository {

    public String getPersonToGreet() {
        return "Sprint";
    }

}
