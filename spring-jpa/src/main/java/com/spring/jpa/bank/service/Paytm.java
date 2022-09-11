package com.spring.jpa.bank.service;

import org.springframework.stereotype.Service;

@Service
public class Paytm implements Payment{


    @Override
    public String doTransaction() {
        return "Payment using Paytm";
    }
}
