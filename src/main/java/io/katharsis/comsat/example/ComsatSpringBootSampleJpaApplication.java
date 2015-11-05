package io.katharsis.comsat.example;

import co.paralleluniverse.springframework.boot.autoconfigure.web.FiberSpringBootApplication;
import org.springframework.boot.SpringApplication;

@FiberSpringBootApplication
public class ComsatSpringBootSampleJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsatSpringBootSampleJpaApplication.class, args);
    }
}
