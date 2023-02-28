package com.example.Config;

import com.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 12:03
 */
@Configuration
public class PojoConfig {
    @Bean
    public User User(){

        return new User("a","b");
    }
}
