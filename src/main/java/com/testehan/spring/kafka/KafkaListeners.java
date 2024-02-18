package com.testehan.spring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "dante",
            groupId = "whatever",         // if you have more listeners, this should be unique
            containerFactory = "messageFactory"
    )
    public void listener(Message data){
        System.out.println("Listener recieved data " + data);
    }
}
