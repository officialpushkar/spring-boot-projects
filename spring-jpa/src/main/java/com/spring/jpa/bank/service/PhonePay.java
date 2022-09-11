package com.spring.jpa.bank.service;

import org.springframework.stereotype.Service;

@Service
public class PhonePay implements Payment {

    @Override
    public String doTransaction() {
        return "payment using PhonePay";
    }
}
