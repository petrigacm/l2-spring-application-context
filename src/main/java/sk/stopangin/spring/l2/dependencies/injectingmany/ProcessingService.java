package sk.stopangin.spring.l2.dependencies.injectingmany;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProcessingService {

    Set<StringItemProcessor> stringItemProcessors;

    public ProcessingService(Set<StringItemProcessor> stringItemProcessors) {
        this.stringItemProcessors = stringItemProcessors;
    }

    public String doProcess(String data) {
        for (StringItemProcessor stringItemProcessor : stringItemProcessors) {
            data = stringItemProcessor.processItem(data);
        }
        return data;
    }
}
