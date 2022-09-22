package com.javashastra.cache.controller;

import com.javashastra.cache.entity.City;
import com.javashastra.cache.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.web.bind.annotation.*;

@RestController
public class CacheController {
    @Autowired
    CacheService cacheService;

    @GetMapping("/city")
    public City getCityByName(@RequestParam("name") String name) {
        return cacheService.getZipCode(name);

    }

    @GetMapping("/cache")
    public Cache getCacheDetails(@RequestParam("name") String name) {
        return cacheService.getCacheByName(name);
    }

    @PostMapping("/city")
    public City addCache(@RequestBody City city) {
        return cacheService.addCity(city);
    }

    @DeleteMapping("/cache")
    public String removeCache() {
        return cacheService.removeCache();
    }
}
