package com.spring.jpa.controller;

import com.spring.jpa.model.Address;
import com.spring.jpa.model.Customer;
import com.spring.jpa.model.CustomerRequest;
import com.spring.jpa.model.CustomerResponse;
import com.spring.jpa.repository.AddressRepository;
import com.spring.jpa.repository.CustomerProductRepository;
import com.spring.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerProductRepository customerProductRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody CustomerRequest request) {

        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/getJoinInfo")
    public List<CustomerResponse> getJoinInfo() {
        return customerRepository.getJoinInfo();
    }

    @PostMapping("/saveAddress")
    public List<Customer> saveAddress(@RequestBody List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @GetMapping("/cities/{id}")
    public Optional<Address> getCityById(@PathVariable(name = "id") Integer id) {
        return addressRepository.findById(id);
    }


}
