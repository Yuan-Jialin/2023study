package com.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookMapper;
import com.example.pojo.books;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private BookMapper bookMapper;
    @Test
    void contextLoads() {
        String s = bookMapper.selectById(1).toString();
        System.out.println(s);
    }
    @Test
    void add(){
        bookMapper.insert(new books(4,"三体",100,"666"));
    }

    @Test
    void delete(){
        bookMapper.deleteById(4);
    }
    @Test
    void page(){
        IPage page=new Page(2,2);
        IPage page1 = bookMapper.selectMapsPage(page, null);
        System.out.println(page1.getRecords());
    }

    @Test
    void selectByCondition(){

        QueryWrapper<books> v=new QueryWrapper<>();
        v.like("bookName","习近平");
        List<books> books = bookMapper.selectList(v);
        System.out.println(books);
    }

    @Test
    void selectByCondition2(){

        LambdaQueryWrapper<books> v=new LambdaQueryWrapper<>();
        String name="习近平";
        v.like(name!=null,books::getBookName,name);
        List<books> books = bookMapper.selectList(v);
        System.out.println(books);
    }


}
