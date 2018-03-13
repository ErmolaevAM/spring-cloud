package spring.microservices.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Controller {

    @Value("${message:Default message}")
    private String msg;

    @RequestMapping("/message")
    public String getMsg() {
        return this.msg;
    }
}
