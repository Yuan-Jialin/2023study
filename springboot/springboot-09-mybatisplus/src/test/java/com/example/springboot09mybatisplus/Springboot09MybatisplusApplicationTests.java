package com.example.springboot09mybatisplus;

import com.example.springboot09mybatisplus.dao.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot09MybatisplusApplicationTests {

    @Autowired
    private BookMapper bookMapper;
    @Test
    void contextLoads() {
        System.out.println(bookMapper.selectList(null).toString());

    }

}
