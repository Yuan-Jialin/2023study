package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getUserList();

    public int addUser(User user);

    public int deleteUserById(@Param("id") int id);






}
