package com.example.springboot10druid;

import com.example.springboot10druid.dao.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot10DruidApplicationTests {


    @Autowired
    BookMapper bookMapper;
    @Test
    void contextLoads() {
        System.out.println(bookMapper.getById(1).toString());
    }

}
