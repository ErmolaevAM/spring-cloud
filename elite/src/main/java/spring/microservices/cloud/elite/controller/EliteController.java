package spring.microservices.cloud.elite.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EliteController {

    @Value("${message:defaule message from elite service")
    private String msg;

    @RequestMapping("/elite")
    public String getMsg() {
        return this.msg;
    }

}
