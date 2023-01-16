package com.yuan.dao;

public class UserDaoMysqlImpl implements UserDao {

    @Override
    public void GetUser() {
        System.out.println("从Mysql获取用户信息");
    }
}
