package com.spring.jpa.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentService {

    @Autowired
    @Qualifier("paytm")
    private Payment payment;

    public String processPayment() {

        return payment.doTransaction();
    }
}
