package com.roshan;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerApi {

    @RabbitListener(queues = "firstQueue")//, containerFactory="myFactory"
    public void firstQueueConsumer(String message) {
        System.out.println("firstQueue:" + message);
    }

    @RabbitListener(queues = "secondQueue")//, containerFactory="myFactory"
    public void secondQueueConsumer(String message) {
        System.out.println("secondQueue:" + message);
    }

}
