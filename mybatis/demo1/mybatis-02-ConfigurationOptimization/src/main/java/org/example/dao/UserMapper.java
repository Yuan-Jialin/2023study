package org.example.dao;

import org.example.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int addUser2(Map<String, Object>map);

    int deleteById(int id);

    List<User> getUserByLike(String value);

/*    int getUserByIdandName(int id,String name);
*       多个参数不行
*       多个参数可以用map
*       因为在Mapper.xml的配置文件中 parameterType只有一个 所以多个参数不行
*       但放在可以放在map中
*       parameterType的参数可以写成Map
* */




}
