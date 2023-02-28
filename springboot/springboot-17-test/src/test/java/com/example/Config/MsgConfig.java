package com.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 11:50
 */
@Configuration
public class MsgConfig {

    @Bean
    public String msg(){
        return "bean msg";
    }



}
