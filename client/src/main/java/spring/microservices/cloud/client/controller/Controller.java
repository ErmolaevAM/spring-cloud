package spring.microservices.cloud.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.microservices.cloud.client.utils.Calculator;
import spring.microservices.cloud.client.utils.Operations;

import java.util.Random;

@RestController
@Slf4j
public class Controller {

    @Value("${message:Default message}")
    private String message;

    @Autowired
    private Calculator calculator;

    @RequestMapping("/message")
    public String getMessage() {
        log.info(String.format("[CLIENT] %s Fetch message = \"%s\" from configuration server.", this.getClass().getName(), message));
        return this.message;
    }

    @RequestMapping(value = "/calculate")
    public Double calculate() {
        int i = new Random().nextInt();
        int j = new Random().nextInt();
        Operations random = Operations.getRandom();
        log.info(String.format("[CLIENT] %s Calculate method invoked on numbers %s and %s with operation %s.",
                this.getClass().getName(), i, j, random));
        return calculator.calculate(i, j, random);
    }
}
