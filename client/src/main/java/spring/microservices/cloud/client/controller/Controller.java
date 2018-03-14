package spring.microservices.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${message:Default message}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message;
    }
}
