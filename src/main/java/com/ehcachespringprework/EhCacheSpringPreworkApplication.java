package com.ehcachespringprework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EhCacheSpringPreworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhCacheSpringPreworkApplication.class, args);
    }

}
