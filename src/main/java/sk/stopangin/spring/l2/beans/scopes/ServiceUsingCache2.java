package sk.stopangin.spring.l2.beans.scopes;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUsingCache2 {

    private static final String SERVICE_CACHE_KEY = "serviceKey";
    private CacheProvider cacheProvider;

    public ServiceUsingCache2(CacheProvider cacheProvider) {
        this.cacheProvider = cacheProvider;
    }

    public void doServiceMethod(String data) {
        System.out.println("cache provider obj from s2:"+cacheProvider);
        Optional<Object> byKey = cacheProvider.getByKey(SERVICE_CACHE_KEY);
        if (byKey.isPresent()) {
            System.out.println("Item " + SERVICE_CACHE_KEY + " returning from cache ");
        } else {
            System.out.println("Item " + SERVICE_CACHE_KEY + " not found in cache, inserting into cache.");
            cacheProvider.withItem(SERVICE_CACHE_KEY, data);
        }
    }

}
