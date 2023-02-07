package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.BookMapper;
import com.example.pojo.books;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Provider;
@Service
public class IBookServiceImpl extends ServiceImpl<BookMapper, books> implements IBookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public books getBookByName(String name) {
        return bookMapper.getBookByName(name);
    }

    public IPage<books> getPage(int CurrentPage,int PageSize){
       return bookMapper.selectPage(new Page<books>(CurrentPage,PageSize),null);
    }
}
