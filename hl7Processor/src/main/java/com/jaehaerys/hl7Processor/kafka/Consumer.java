package com.jaehaerys.hl7Processor.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.jaehaerys.hl7Processor.*;
import java.util.Date;

@Component
public class Consumer {

    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "${hl7.topics}", groupId = "${hl7.groupId}" , concurrency = "${hl7.concurrency}")
    public void consume(ConsumerRecord<String, String> consumerRecord) throws Exception {
        var startTime = new Date();
        log.info("consume(): consumer start at {}", startTime);
        log.info("consume() : message = " + consumerRecord);
        log.debug("consume() : message = " + consumerRecord);

        messageSpliter(consumerRecord);


    }

    private void messageSpliter(ConsumerRecord<String, String> consumerRecord) {
            message messageRe = new message();
            messageRe.setMessageBlob(consumerRecord.value());
            log.info("messageSpliter(): message = " + messageRe.getMessageBlob().toString());
    }
}
