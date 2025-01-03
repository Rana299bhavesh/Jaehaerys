package com.jaehaerys.hl7Processor.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ConsumerTest {

    @Mock
    private Consumer consumer;

    @Test
    void testConsume() throws Exception {
        final ConsumerRecord<String, String> consumerRecord = new ConsumerRecord<>("hl7Topic", 0, 0L, "1", "test");

        consumer.consume(consumerRecord);

        verify(consumer, times(1)).consume(consumerRecord);
    }
}
