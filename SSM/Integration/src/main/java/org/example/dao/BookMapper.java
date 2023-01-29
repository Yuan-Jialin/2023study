package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Books;

import java.util.List;

public interface BookMapper {

    //add a book
    int addBook(Books books);

    int deleteBookById(@Param("id") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("id") int id);

    @Select("select * from books;")
    List<Books>queryAllbook();
}
