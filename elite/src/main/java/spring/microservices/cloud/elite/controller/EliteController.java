package spring.microservices.cloud.elite.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EliteController {

    @Value("${message:Default elite message}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message;
    }
}
