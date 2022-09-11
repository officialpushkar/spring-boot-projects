package com.spring.jpa.repository;

import com.spring.jpa.model.CustomerProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerProductRepository extends JpaRepository<CustomerProduct, Integer> {

}

