package com.hexagonal.simplified.adapter.in.web;

import com.hexagonal.simplified.application.port.in.ExampleOneWebUseCase;
import com.hexagonal.simplified.domain.dto.response.ExampleOneResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleOneController {

    private final ExampleOneWebUseCase exampleOneWebUseCase;

    public ExampleOneController(ExampleOneWebUseCase exampleOneWebUseCase) {
        this.exampleOneWebUseCase = exampleOneWebUseCase;
    }

    @GetMapping
    public ExampleOneResponse exampleOne() {
        return exampleOneWebUseCase.execute();
    }

}
