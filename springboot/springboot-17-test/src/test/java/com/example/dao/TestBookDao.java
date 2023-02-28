package com.example.dao;

import com.example.pojo.Books;
import com.example.pojo.book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 11:41
 */
@SpringBootTest
@Transactional
@Import(book.class)
public class TestBookDao {
    @Autowired
    BookMapper bookMapper;
    @Test
    public void TestInsert(){
        bookMapper.insertBooks(new Books("123",1,"2222"));
    }
    @Autowired
    book book;

    @Test
    public void TestInsert2(){
        System.out.println(book.getId2());
    }




}
