package com.yuan.config;


import com.yuan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//这个类也会被spring容器托管，注册到容器中，因为他本来就是一个component
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字相当于bean标签中的id属性
    //这个方法的返回值相当于bean中的class属性
    @Bean
    public User getUser(){
        return new User();//返回要注入的bean对象
    }


}
