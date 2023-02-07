package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.books;

//通过mybatis-plus实现service层
public interface IBookService extends IService<books> {

    books getBookByName(String name);

    IPage<books> getPage(int CurrentPage,int PageSize);
}
