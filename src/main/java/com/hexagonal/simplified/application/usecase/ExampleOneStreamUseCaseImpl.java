package com.hexagonal.simplified.application.usecase;

import com.hexagonal.simplified.application.port.in.ExampleOneStreamUseCase;
import com.hexagonal.simplified.application.port.out.ExampleOneStreamPort;
import com.hexagonal.simplified.domain.dto.response.ExampleOneResponse;
import org.springframework.stereotype.Service;

@Service
public class ExampleOneStreamUseCaseImpl implements ExampleOneStreamUseCase {

    private final ExampleOneStreamPort exampleOneStreamPort;

    public ExampleOneStreamUseCaseImpl(ExampleOneStreamPort exampleOneStreamPort) {
        this.exampleOneStreamPort = exampleOneStreamPort;
    }

    @Override
    public void execute(String message) {
        ExampleOneResponse exampleOneResponse = ExampleOneResponse
                .builder()
                .fieldExampleOne(message)
                .fieldExampleTwo(message)
                .build();

        exampleOneStreamPort.sendMessage(exampleOneResponse);
    }

}
