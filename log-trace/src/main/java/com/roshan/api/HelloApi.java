package com.roshan.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    private static final Logger log = LoggerFactory.getLogger(HelloApi.class);

    @RequestMapping("/hello")
    public void sayHello(@RequestParam String msg) {
        log.info(msg);
        Thread thread1 = new Thread(()-> log.info(Thread.currentThread().getName()));
        Thread thread2 = new Thread(()-> log.info(Thread.currentThread().getName()));
        Thread thread3 = new Thread(()-> log.info(Thread.currentThread().getName()));
        thread1.run();
        thread2.run();
        thread3.run();
    }
}
