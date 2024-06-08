package com.felipeomachado.kafka.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalesService {

    @Value("${kafka.topic.sales}")
    private String salesTopicName;


    private final KafkaTemplate<String, String> kafkaTemplate;

    public SalesService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void processSale(int inital, int max) {
        for(int i=0; i<max; i++) {
            kafkaTemplate.send(salesTopicName, "Message 1");
            inital++;
        }

//        for(int i=0; i<max; i++) {
//            kafkaTemplate.send(salesTopicName, "Sem Key - Message " + inital);
//            inital++;
//        }
        System.out.println("Mensagem enviada");
    }

}
