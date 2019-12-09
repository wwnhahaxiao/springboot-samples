package com.roshan.api;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMsgApi {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/send")
    public void send(String msg) {
        amqpTemplate.convertAndSend("roshanExchange", "blue.fast", msg);
    }
}
