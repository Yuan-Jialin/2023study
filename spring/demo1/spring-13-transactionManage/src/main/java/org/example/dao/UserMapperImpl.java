package org.example.dao;

import org.example.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> getUserList() {

        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();
        return userList;
    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
       return mapper.addUser(new User(5,"习近平","250"));
    }

    @Override
    public int deleteUserById(int id) {
       return sqlSessionTemplate.getMapper(UserMapper.class).deleteUserById(5);


    }
}
