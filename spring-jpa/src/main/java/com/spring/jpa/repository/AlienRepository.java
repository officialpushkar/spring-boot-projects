package com.spring.jpa.repository;

import com.spring.jpa.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienRepository extends JpaRepository<Alien, Integer> {
}
