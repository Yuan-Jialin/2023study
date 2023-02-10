package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.utils.R;
import com.example.pojo.books;
import com.example.service.IBookService;
import org.intellij.lang.annotations.JdkConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
/*
*
*
* 反对习近平独裁，打倒习近平，人民万岁
*
* */
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
    public R saveBook(@RequestBody books book) throws IOException {
        System.out.println("-------------" + book.getBookName());
        if (Objects.equals(book.getBookName(), "123")) {
            throw new IOException();
        }
        books Id = iBookService.getById(book.getBookID());
        if (Id != null) {
            boolean b = iBookService.updateById(book);
            return new R(b, null);
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

        if (CurrentPage > page.getPages()) {
            page = iBookService.getPage((int) page.getPages(), PageSize);
        }
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
    public R updata(@RequestBody books book) {
        boolean b = iBookService.updateById(book);
        return new R(b, null);
    }

    @PostMapping("/query")
    public R query(@RequestBody books book) {
        String bookName = book.getBookName();
        System.out.println(bookName);
        System.out.println(book.getBookCounts());
        QueryWrapper<books> v = new QueryWrapper<>();
        if (bookName != null) {
            v.like("bookName", bookName);
        }
        if((book.getBookCounts() >=0)){
            v.eq("bookCounts",book.getBookCounts());
        }
        if(book.getDetail()!=null)
        {
            v.like("bookCounts",book.getDetail());
        }
        List<books> myquery = iBookService.Myquery(v);
        for (books books : myquery) {
            System.out.println(books);
        }
        return new R(true,myquery);
    }


}
