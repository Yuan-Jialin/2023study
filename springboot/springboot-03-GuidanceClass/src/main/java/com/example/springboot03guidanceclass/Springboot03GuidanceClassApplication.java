package com.example.springboot03guidanceclass;

import com.example.springboot03guidanceclass.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Springboot03GuidanceClassApplication {

    public static void main(String[] args) {
//        从这可以看出run是一个ApplicationContext
        ConfigurableApplicationContext run = SpringApplication.run(Springboot03GuidanceClassApplication.class, args);
        //那么就可以从中取出注册的bean,虽然我们没有编写ApplicationContext.xml 但通过注解 springboot已经帮我们注册了bean,故可以拿出
        System.out.println(run.getBean(BookController.class));

        System.out.println(run.getBean("user"));
    }

}
