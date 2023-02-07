package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Administrator
 */
@Mapper
public interface BookMapper extends BaseMapper<books> {

    @Select("select * from books where bookName = #{name} ")
    books getBookByName(@Param("name") String name);
}
