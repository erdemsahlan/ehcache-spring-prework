package com.ehcachespringprework.service;


import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    @Cacheable(value = "cacheStore", key = "#side")
    public double areaOfSquare(int side) {
        System.err.println(side);
        return side * side;
    }

    @CacheEvict(cacheNames = "cacheStore", allEntries = true)
    public void clearCache() {
        System.err.println("Clear Cache...");
    }
}
