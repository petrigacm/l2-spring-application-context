package sk.stopangin.spring.l2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class NewServiceForDifferentProject implements StatisticsService {

    @Value("#{dateMeta}")
    private String xxx;

    @Resource
    private Set<String> strings;

    @Override
    public void setDataService(DataService dataService) {

    }

    public String getXxx() {
        return xxx;
    }

    public Set<String> getStrings() {
        return strings;
    }
}
