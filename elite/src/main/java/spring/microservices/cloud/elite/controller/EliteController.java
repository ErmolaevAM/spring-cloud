package spring.microservices.cloud.elite.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.microservices.cloud.elite.utils.Person;

@RestController
@Slf4j
public class EliteController {

    @Value("${message:Default elite message}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        log.info(String.format("[ELITE] %s Fetch message = \"%s\" from configuration server.", this.getClass().getName(), message));
        return this.message;
    }

    @RequestMapping(value = "/gibbet", method = RequestMethod.POST)
    public String gibbet(@RequestBody Person person) {
        log.info(String.format("[ELITE] %s Gibbet method invoked.", this.getClass().getName()));
        person.killFamily();
        person.takeMoney();
        return String.format("Person %s gibbeted.", person.getName());
    }
}
