//package com.ehcachespringprework.config;
//
//import com.ehcachespringprework.model.Persons;
//import org.ehcache.config.CacheConfiguration;
//import org.ehcache.config.builders.CacheConfigurationBuilder;
//import org.ehcache.config.builders.ExpiryPolicyBuilder;
//import org.ehcache.config.builders.ResourcePoolsBuilder;
//import org.ehcache.config.units.MemoryUnit;
//import org.ehcache.jsr107.Eh107Configuration;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.cache.CacheManager;
//import javax.cache.Caching;
//import javax.cache.spi.CachingProvider;
//import java.time.Duration;
//import java.util.List;
//
//@Configuration
//@EnableCaching
//public class EHConfiguration {
//
//    @Bean
//    public CacheManager getCacheManager() {
//        CachingProvider provider = Caching.getCachingProvider();
//        CacheManager cacheManager = provider.getCacheManager();
//
//        CacheConfiguration<String, List<Persons>> configuration =
//                CacheConfigurationBuilder
//                        .newCacheConfigurationBuilder(String.class, List.class,
//                                ResourcePoolsBuilder.newResourcePoolsBuilder().offheap(10, MemoryUnit.MB))
//                        .build();
//
//
//        javax.cache.configuration.Configuration<String, List<Persons>> cacheConfiguration = Eh107Configuration
//                .fromEhcacheCacheConfiguration(configuration);
//        cacheManager.createCache("cacheStore", cacheConfiguration);
//
//        return cacheManager;
//    }
//}