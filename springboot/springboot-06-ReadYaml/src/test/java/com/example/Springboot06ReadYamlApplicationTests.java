package com.example;

import com.example.MyDataSource.My;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class Springboot06ReadYamlApplicationTests {
    @Value("${app}")
    String c;
    @Value("${user1.name}")
    String name;

    @Value("${hoppy[0]}")
    String hoppy;

    //使用自动装配将配置文件封装到environment
    @Autowired
    private Environment environment;

    @Autowired
    private My my;


    @Test
    void contextLoads() {
        System.out.println(my.getDriver());
    }

}
