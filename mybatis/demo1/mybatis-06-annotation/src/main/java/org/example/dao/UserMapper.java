package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    @Select("Select * from user where id=#{id}")
   User selectUserById(Integer id);

    @Select("Select * from user where id=#{id} and name=#{name};")
    List<User> getUsersByNameAndId(@Param("id")int id,@Param("name") String name);

    @Insert("insert into user (id,name,pwd) values(#{id},#{name},#{password});")
    int insertUser(User user);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int update(User user);

    @Delete("delete from user where id=#{id}")
    int delete(@Param("id") int id);






}
