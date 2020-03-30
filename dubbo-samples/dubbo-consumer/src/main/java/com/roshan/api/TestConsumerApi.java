package com.roshan.api;

import com.roshan.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConsumerApi {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return consumerService.testConsumer();
    }
}
