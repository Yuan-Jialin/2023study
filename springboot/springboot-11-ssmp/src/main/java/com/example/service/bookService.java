package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.pojo.books;

import java.util.List;


public interface bookService {

    boolean save(books book);

    boolean update(books book);

    boolean deleteById(Integer id);

    books getById(int id);

    List<books> selectAllBooks();

    IPage<books> getPage(int currentPage,int pageSize);


}
