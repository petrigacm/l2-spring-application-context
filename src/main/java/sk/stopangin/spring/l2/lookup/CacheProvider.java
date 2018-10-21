package sk.stopangin.spring.l2.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Scope("prototype")
public class CacheProvider {
    private Map<String, Object> cache = new ConcurrentHashMap<>();

    public CacheProvider withItem(String key, Object val) {
        cache.put(key, val);
        return this;
    }

    public Optional getByKey(String key) {
        return Optional.ofNullable(cache.get(key));
    }

}
