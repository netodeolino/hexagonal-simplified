package com.hexagonal.simplified.application.usecase;

import com.hexagonal.simplified.application.port.in.ExampleOneWebUseCase;
import com.hexagonal.simplified.application.port.out.ExampleOneDatabasePort;
import com.hexagonal.simplified.domain.dto.response.ExampleOneResponse;
import com.hexagonal.simplified.domain.entity.ExampleOne;
import org.springframework.stereotype.Service;

@Service
public class ExampleOneWebUseCaseImpl implements ExampleOneWebUseCase {

    private final ExampleOneDatabasePort exampleOneDatabasePort;

    public ExampleOneWebUseCaseImpl(ExampleOneDatabasePort exampleOneDatabasePort) {
        this.exampleOneDatabasePort = exampleOneDatabasePort;
    }

    @Override
    public ExampleOneResponse execute() {
        ExampleOne exampleOne = exampleOneDatabasePort.getExampleOne();
        return ExampleOneResponse
                .builder()
                .fieldExampleOne(exampleOne.getFieldExampleOne())
                .fieldExampleTwo(exampleOne.getFieldExampleTwo())
                .build();
    }

}
