package com.roshan.service;

import com.roshan.dubboService.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello roshan";
    }
}
