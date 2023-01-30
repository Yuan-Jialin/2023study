package org.example.service;

import org.example.dao.BookMapper;
import org.example.pojo.Books;

import java.util.List;

public interface bookService {
    public int addBook(Books books);
    public int deleteBookById(int id);

    public int updateBook(Books books);

    public Books queryBookById(int id);

    public List<Books> queryAllBook();

}
