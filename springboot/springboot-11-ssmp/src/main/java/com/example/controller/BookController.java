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
    public R getAllBook() {
        return new R(true, iBookService.list());
    }

    @PostMapping("/save")
    public R saveBook(@RequestBody books book) {

        books Id = iBookService.getById(book.getBookID());
        if (Id!=null ) {
            boolean b = iBookService.updateById(book);
            return new R(b,null);
        } else {
            System.out.println("------------------------" + book.toString());
            return new R(iBookService.save(book), null);

        }
    }

    @GetMapping("/select/{id}")
    public R getBookById(@PathVariable Integer id) {
        return new R(true, iBookService.getById(id));
    }

    @GetMapping("/select/{a}/{b}")
    public R getPage(@PathVariable("a") int CurrentPage, @PathVariable("b") int PageSize) {
        IPage<books> page = iBookService.getPage(CurrentPage, PageSize);
        return new R(true, page);

    }

    @DeleteMapping("/delete/{name}")
    public R deleteByName(@PathVariable("name") String name) {
        books bookByName = iBookService.getBookByName(name);
        System.out.println(bookByName.toString());
        boolean b = iBookService.removeById(bookByName.getBookID());
        return new R(b, null);

    }
    @PostMapping("/updata")
    public R updata(@RequestBody books book){
        boolean b = iBookService.updateById(book);
        return new R(b,null);
    }


}
