package com.learn.kafka_demo.controller;

import com.learn.kafka_demo.service.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {

    private final Producer producer;

    public RestControllerForKafkaMsg(Producer producer) {
        this.producer = producer;
    }

    // http://localhost:8081/rest/api/producerMsg?message=Hello
    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message){
        producer.sendMsgToTopic(message);
    }
}
