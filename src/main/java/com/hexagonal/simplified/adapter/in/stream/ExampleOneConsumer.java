package com.hexagonal.simplified.adapter.in.stream;

import com.hexagonal.simplified.application.port.in.ExampleOneStreamUseCase;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ExampleOneConsumer {

    private final ExampleOneStreamUseCase exampleOneStreamUseCase;

    public ExampleOneConsumer(ExampleOneStreamUseCase exampleOneStreamUseCase) {
        this.exampleOneStreamUseCase = exampleOneStreamUseCase;
    }

    @KafkaListener(topics = "example-one-topic", groupId = "example-one-group-id")
    private void exampleOneListener(String message) {
        exampleOneStreamUseCase.execute(message);
    }

}
