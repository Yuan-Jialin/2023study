package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.utils.R;
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
    public R getAllBook(){
        return new R(true,iBookService.list());
    }

    @PostMapping("save")
    public R saveBook(books book){
        return new R(iBookService.save(book),null);
    }

    @GetMapping("/select/{id}")
    public R getBookById(@PathVariable Integer id){
        return new R(true,iBookService.getById(id));
    }

    @GetMapping("/select/{a}/{b}")
    public R getPage(@PathVariable("a") int CurrentPage,@PathVariable("b") int PageSize){
        IPage<books> page = iBookService.getPage(CurrentPage, PageSize);
        return new R(true,page);

    }



}
