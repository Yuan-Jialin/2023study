package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.pojo.books;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class serviceTest {

    /*boolean save(books book);

    boolean update(books book);

    boolean deleteById(Integer id);

    books getById(int id);

    List<books> selectAllBooks();
*/
    @Autowired
    private bookService bookService;
    @Test
    void TestSave(){
        books books=new books();
        books.setBookName("打倒习近平");
        books.setBookCounts(20);
        books.setDetail("反对习近平独裁相关书籍");
        bookService.save(books);
    }
    @Test
    void TestUpdate(){
        bookService.update(new books(1,"打到共产党",20,"666"));
    }

    @Test
    void testGetbyID(){
        books byId = bookService.getById(4);
        System.out.println(byId.toString());
    }

    @Test
    void Page(){
        IPage<books> page = bookService.getPage(3, 2);
        for (books record : page.getRecords()) {
            System.out.println(record);
        }
    }
}
