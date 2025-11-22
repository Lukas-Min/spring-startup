package com.lukas.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class QuickstartApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(QuickstartApplication.class, args);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}
