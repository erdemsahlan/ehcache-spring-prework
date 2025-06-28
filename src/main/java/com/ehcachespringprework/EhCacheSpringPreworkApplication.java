package com.ehcachespringprework;

import com.ehcachespringprework.dto.PersonsDTO;
import com.ehcachespringprework.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@RequiredArgsConstructor
public class EhCacheSpringPreworkApplication implements CommandLineRunner {
    private final PersonService personService;

    @Override
    public void run(String... args) throws Exception {
        personService.update(1);
    }
    public static void main(String[] args) {
        SpringApplication.run(EhCacheSpringPreworkApplication.class, args);
    }
}
