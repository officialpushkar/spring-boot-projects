package com.spring.jpa.repository;

import com.spring.jpa.model.Customer;
import com.spring.jpa.model.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("select new com.spring.jpa.model.CustomerResponse(c.name, p.productName) from Customer c join c.products p")
    List<CustomerResponse> getJoinInfo();
}
