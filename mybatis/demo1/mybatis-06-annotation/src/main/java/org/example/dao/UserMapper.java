package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    @Select("Select * from user where id=#{id}")
   User selectUserById(Integer id);






}
