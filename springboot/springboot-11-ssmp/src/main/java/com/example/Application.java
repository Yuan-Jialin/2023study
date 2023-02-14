package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")
public class Application {
    //boot通过args读取外部参数

    public static void main(String[] args) {

       /* String[] arg=new String[1];
        arg[0]="--server.port=8081";*/
        SpringApplication.run(Application.class, args);
    }

}
