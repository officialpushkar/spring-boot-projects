package com.spring.jpa.serviceimpl;

import com.spring.jpa.model.Alien;
import com.spring.jpa.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlienServiceImpl {


    @Autowired
    private AlienRepository alienRepository;

    @Cacheable( value = "alien-cache", key = "#aid")
    public Optional<Alien> getAliens(Integer aid) throws InterruptedException {
        //Thread.sleep(4000);
        System.out.println("fetching alien from db");
        return alienRepository.findById(aid);
    }
}
