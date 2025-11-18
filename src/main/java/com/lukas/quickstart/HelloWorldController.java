package com.lukas.quickstart;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    public String sayHello() {
        return "Hello World!";
    }
}
