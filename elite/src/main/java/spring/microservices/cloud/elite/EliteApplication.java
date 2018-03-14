package spring.microservices.cloud.elite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EliteApplication.class, args);
    }
}
