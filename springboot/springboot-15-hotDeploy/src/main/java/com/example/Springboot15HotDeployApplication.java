package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot15HotDeployApplication {

    public static void main(String[] args) {

        System.setProperty("spring.devtools.restart.enabled","false");
        SpringApplication.run(Springboot15HotDeployApplication.class, args);
    }

}
