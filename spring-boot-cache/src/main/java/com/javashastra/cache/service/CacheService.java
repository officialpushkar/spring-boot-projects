package com.javashastra.cache.service;

import com.javashastra.cache.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CacheService {
	@Autowired
	CacheManager cacheManager;

	public Map<String, City> cityZipCodeMap;

	CacheService() {
		cityZipCodeMap = new HashMap<>();
		cityZipCodeMap.put("Hiteccity", new City("Hiteccity", "500081"));
		cityZipCodeMap.put("SrNagar", new City("SrNagar", "500038"));
		cityZipCodeMap.put("Miyapur", new City("Miyapur", "500049"));
		cityZipCodeMap.put("Waverock", new City("Waverock", "500095"));
		cityZipCodeMap.put("GachiWali", new City("GachiWali", "500032"));
	}

	@Cacheable(value = "city-zip-cache")
	public City getZipCode(String cityName) {

		System.out.println("getZipCode Method Called");
		return cityZipCodeMap.get(cityName);
	}

	public Cache getCacheByName(String cacheName) {
		return cacheManager.getCache(cacheName);
	}

	@CachePut(value = "city-zip-cache", key = "#city.cityName")
	public City addCity(City city) {
		cityZipCodeMap.put(city.getCityName(), city);
		return city;

	}

	@CacheEvict(value = "city-zip-cache", allEntries = true)
	public String removeCache() {
		return "Cache removed Successfully";
	}

}