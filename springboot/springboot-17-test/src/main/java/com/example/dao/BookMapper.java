package com.example.dao;

import com.example.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 9:47
 */

@Mapper
@Repository
public interface BookMapper {

   boolean insertBooks(Books books);
}
