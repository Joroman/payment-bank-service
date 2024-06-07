package com.accidpayment.microservices.paymentbankservice.controller;

import com.accidpayment.microservices.paymentbankservice.bean.Payment;
import com.accidpayment.microservices.paymentbankservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PaymentController {

    @Autowired
    private Configuration configuration;

    @GetMapping("payment/bank")
    public Payment getPayment(){
        double amount= 60000.00;

        if(configuration.getMin_amount() < amount && amount < configuration.getMax_amount()){
            return new Payment("buy premium piano", amount,"EUR", "DONE","CARD",new Date(),new Date());
        }

        return new Payment("buy piano", 100.25,"EUR", "DONE","BANK",new Date(),new Date());
    }

    @GetMapping("payment/bank/configuration")
    public Configuration getConfiguration(){
        return configuration;
    }
}
