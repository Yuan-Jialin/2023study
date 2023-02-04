package com.example;

import com.example.dao.BookMapper;
import com.example.pojo.books;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybatisApplicationTests {

    @Autowired
    private BookMapper bookMapper;
    @Test
    void contextLoads() {
        books byId = bookMapper.getById(1);
        System.out.println(byId.toString());
    }

}
