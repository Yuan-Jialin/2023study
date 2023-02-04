package com.example.dao;

import com.example.pojo.books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    @Select("select * from books where bookID=#{id}")
    public books getById(@Param("id") Integer id);
}
