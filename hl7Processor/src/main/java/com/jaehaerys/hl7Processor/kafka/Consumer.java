package com.jaehaerys.hl7Processor.kafka;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component

public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @KafkaListener(topics = "${hl7.topics}", groupId = "${hl7.groupId}")
 public void ConsumeMessage(String message) throws Exception{
        logger.info("Consumed message: " + message);

    }

}
