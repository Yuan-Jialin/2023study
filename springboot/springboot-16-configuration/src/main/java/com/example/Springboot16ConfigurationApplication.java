package com.example;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.config.ServletConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot16ConfigurationApplication {

    @Bean
    public DruidDataSource DataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return druidDataSource;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot16ConfigurationApplication.class, args);
        ServletConfig bean = run.getBean(ServletConfig.class);
        DruidDataSource bean1 = run.getBean(DruidDataSource.class);
        System.out.println(bean.getPort());
        System.out.println(bean1.getDriverClassName());
    }

}
