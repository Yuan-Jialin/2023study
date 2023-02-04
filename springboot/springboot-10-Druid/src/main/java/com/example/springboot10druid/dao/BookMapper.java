package com.example.springboot10druid.dao;


import com.example.springboot10druid.pojo.books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Jahup
 */
@Mapper
public interface BookMapper  {

    @Select("select * from books where bookID=#{id}")
    public books getById(@Param("id") Integer id);
}
