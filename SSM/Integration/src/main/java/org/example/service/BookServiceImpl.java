package org.example.service;

import org.example.dao.BookMapper;
import org.example.pojo.Books;

import java.util.List;

public class BookServiceImpl implements bookService{

    BookMapper bookMapper;

    
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return 0;
    }

    @Override
    public int deleteBookById(int id) {
        return 0;
    }

    @Override
    public int updateBook(Books books) {
        return 0;
    }

    @Override
    public Books queryBookById(int id) {
        return null;
    }

    @Override
    public List<Books> queryAllBook() {
        return null;
    }
}
