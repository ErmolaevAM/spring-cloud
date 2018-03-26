package spring.microservices.cloud.client.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Calculator {

    public double calculate(Integer a, Integer b, Operations operation) {
        log.info(String.format("[CALCULATOR] %s Calculate method invoked.", this.getClass().getName()));
        if (operation == Operations.PLUS) {
            log.info(String.format("[CALCULATOR] %s Operation %s invoked on numbers %s and %s",
                    this.getClass().getName(), operation, a, b));
            return a + b;
        }
        if (operation == Operations.MINUS) {
            log.info(String.format("[CALCULATOR] %s Operation %s invoked on numbers %s and %s",
                    this.getClass().getName(), operation, a, b));
            return a - b;
        }
        if (operation == Operations.MULT) {
            log.info(String.format("[CALCULATOR] %s Operation %s invoked on numbers %s and %s",
                    this.getClass().getName(), operation, a, b));
            return a * b;
        }
        if (operation == Operations.DIV) {
            log.info(String.format("[CALCULATOR] %s Operation %s invoked on numbers %s and %s",
                    this.getClass().getName(), operation, a, b));
            return a / b;
        }
        log.error(String.format("[CALCULATOR] %s Something went wrong. Operation: %s. Numbers: %s, %s.",
                this.getClass().getName(), operation, a, b));
        return 0;
    }
}
