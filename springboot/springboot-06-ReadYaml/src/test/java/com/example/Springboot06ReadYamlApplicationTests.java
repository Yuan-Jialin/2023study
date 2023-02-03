package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06ReadYamlApplicationTests {
    @Value("${app}")
    String c;
    @Value("${user1.name}")
    String name;

    @Value("${hoppy[0]}")
    String hoppy;
    @Test
    void contextLoads() {
        System.out.println(c);
    }

}
