package com.roshan.service;

import com.roshan.dubboService.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:36010")
    private HelloService helloService;

    public String testConsumer() {
        return helloService.sayHello();
    }
}
