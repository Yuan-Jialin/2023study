package com.example.springboot09mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot09mybatisplus.dao")
public class Springboot09MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot09MybatisplusApplication.class, args);
    }

}
