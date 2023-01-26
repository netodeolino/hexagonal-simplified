package com.hexagonal.simplified.adapter.out.stream;

import com.hexagonal.simplified.application.port.out.ExampleOneStreamPort;
import com.hexagonal.simplified.domain.dto.response.ExampleOneResponse;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ExampleOneStreamProducer implements ExampleOneStreamPort {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public ExampleOneStreamProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public Boolean sendMessage(ExampleOneResponse exampleOneResponse) {
        kafkaTemplate.send("example-one-topic", exampleOneResponse);
        return true;
    }

}
