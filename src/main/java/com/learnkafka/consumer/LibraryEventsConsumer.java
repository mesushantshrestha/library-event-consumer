package com.learnkafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventsConsumer {

    @KafkaListener(topics = {"library-events"})
    public void onMessage(ConsumerRecords<Integer, String> consumerRecords){

        log.info("ConsumerRecord: {}", consumerRecords);

    }
}
