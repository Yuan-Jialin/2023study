package com.yuan.service;

import com.yuan.dao.UserDao;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }//精髓所在

    @Override
    public void getUser() {
        userDao.GetUser();
    }
}
