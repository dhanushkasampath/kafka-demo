package com.learn.kafka_demo.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
   // Whenever we send a message to a topic it has to be serialized. ie: string has to be converted to bytes
    public void sendMsgToTopic(String message){
        kafkaTemplate.send("emp_details", message);
    }
}
