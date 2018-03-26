package spring.microservices.cloud.client.utils;

import java.util.Random;

public enum Operations {
    PLUS, MINUS, MULT, DIV;

    public static Operations getRandom(){
        Operations[] values = Operations.values();
        int i = new Random().nextInt(values.length);
        return values[i];
    }
}
