package spring.microservices.cloud.elite.utils;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
public class Person {

    private String name;

    private Long money;

    private List<String> child;

    public void takeMoney() {
        log.info(String.format("[PERSON] %s Take %s's money.", this.getClass().getName(), name));
    }

    public void killFamily() {
        for (String child : child) {
            log.info(String.format("[PERSON] %s Kill %s's child %s.", this.getClass().getName(), name, child));
        }
    }

}
