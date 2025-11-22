package com.lukas.quickstart;

import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL PAYMENT");
        System.out.println("Amount: " + amount);

    }
}
