package sk.stopangin.spring.l2.beans.stereotypes;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

    private SomeRepository someRepository;

    public SomeService(SomeRepository someRepository) {
        this.someRepository = someRepository;
    }

    public String getPersonToGreet() {
        return someRepository.getPersonToGreet();
    }

}
