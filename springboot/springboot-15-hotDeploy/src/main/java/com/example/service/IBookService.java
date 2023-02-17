package com.example.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.books;

import java.util.List;

//通过mybatis-plus实现service层
public interface IBookService extends IService<books> {

    books getBookByName(String name);

    IPage<books> getPage(int CurrentPage,int PageSize);

    List<books> Myquery(QueryWrapper v);
}
