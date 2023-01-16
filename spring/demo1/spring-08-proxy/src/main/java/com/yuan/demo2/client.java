package com.yuan.demo2;

public class client {

    public static void main(String[] args) {
        proxy proxy=new proxy();
        proxy.setUserService(new UserServiceImpl());
        proxy.add();
    }
}
