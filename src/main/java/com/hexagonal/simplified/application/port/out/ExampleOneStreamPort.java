package com.hexagonal.simplified.application.port.out;

import com.hexagonal.simplified.domain.dto.response.ExampleOneResponse;

public interface ExampleOneStreamPort {

    Boolean sendMessage(ExampleOneResponse exampleOneResponse);

}
