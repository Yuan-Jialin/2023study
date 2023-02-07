package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.pojo.books;
import com.example.service.IBookService;
import org.intellij.lang.annotations.JdkConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;
    @GetMapping("/select")
    public List<books> getAllBook(){

        return iBookService.list();
    }

    @PostMapping("save")
    public boolean saveBook(books book){
        return iBookService.save(book);
    }

    @GetMapping("/select/{id}")
    public books getBookById(@PathVariable Integer id){
        return iBookService.getById(id);
    }

    @GetMapping("/select/{a}/{b}")
    public IPage<books> getPage(@PathVariable("a") int CurrentPage,@PathVariable("b") int PageSize){
        IPage<books> page = iBookService.getPage(CurrentPage, PageSize);
        return page;

    }



}
