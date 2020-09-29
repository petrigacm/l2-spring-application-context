package sk.stopangin.spring.l2.dependencies.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUsingMutlipleCaches {
    private static final String SERVICE_CACHE_KEY = "serviceKey";

    @Lookup
    public CacheProvider cacheProvider() {
        return null;
    }

    public void doServiceMethod(String data) {
        CacheProvider cacheProvider = cacheProvider();

        System.out.println("cache provider obj from s1:" + cacheProvider);
        Optional byKey = cacheProvider.getByKey(SERVICE_CACHE_KEY);
        if (byKey.isPresent()) {
            System.out.println("Item " + SERVICE_CACHE_KEY + " returning from cache ");
        } else {
            System.out.println("Item " + SERVICE_CACHE_KEY + " not found in cache, inserting into cache.");
            cacheProvider.withItem(SERVICE_CACHE_KEY, data);
        }
    }
}
