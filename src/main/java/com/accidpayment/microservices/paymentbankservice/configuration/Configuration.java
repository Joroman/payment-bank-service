package com.accidpayment.microservices.paymentbankservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("payment-bank-service")
public class Configuration {

    private double max_amount;

    private double min_amount;

    public double getMax_amount() {
        return max_amount;
    }

    public void setMax_amount(double max_amount) {
        this.max_amount = max_amount;
    }

    public double getMin_amount() {
        return min_amount;
    }

    public void setMin_amount(double min_amount) {
        this.min_amount = min_amount;
    }
}
