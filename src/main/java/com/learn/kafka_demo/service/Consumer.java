package com.learn.kafka_demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "emp_details", groupId = "emp_detail_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("The message received is: " + receivedMessage);
    }
}
