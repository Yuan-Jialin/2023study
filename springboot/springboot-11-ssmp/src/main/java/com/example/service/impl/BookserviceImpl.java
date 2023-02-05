package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.BookMapper;
import com.example.pojo.books;
import com.example.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookserviceImpl implements bookService {

    @Autowired
    private BookMapper bookMapper;

    @Override                       //影响行数大于0
    public boolean save(books book) { return bookMapper.insert(book)> 0; }

    @Override
    public boolean update(books book) { return bookMapper.updateById(book) > 0; }

    @Override
    public boolean deleteById(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public books getById(int id) {
        return bookMapper.selectById(id);
    }

    @Override
    public List<books> selectAllBooks() {
        return bookMapper.selectList(null);
    }

    @Override
    public IPage<books> getPage(int currentPage, int pageSize) { return bookMapper.selectPage(new Page<>(currentPage,pageSize),null); }
}
