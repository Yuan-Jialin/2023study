package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 11:24
 */
@SpringBootApplication
@MapperScan("com.example.dao")
public class Springboot17TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot17TestApplication.class, args);
    }

}
