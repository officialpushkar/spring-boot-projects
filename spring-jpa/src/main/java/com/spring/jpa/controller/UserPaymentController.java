package com.spring.jpa.controller;


import com.spring.jpa.bank.service.Payment;
import com.spring.jpa.bank.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPaymentController {


    @Autowired
    private UserPaymentService service;

    @GetMapping("/payment")
    public void getPayment() {
        System.out.println(service.processPayment());

    }
}
