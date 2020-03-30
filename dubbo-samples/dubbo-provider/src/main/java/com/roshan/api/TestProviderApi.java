package com.roshan.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProviderApi {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello world";
    }
}
