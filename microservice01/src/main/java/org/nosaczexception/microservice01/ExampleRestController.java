package org.nosaczexception.microservice01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ExampleRestController {

    @Value("${message:default value for message when config-server dont work}")
    private String message;

    @GetMapping
    public String hello() {
        return message;
    }
}
