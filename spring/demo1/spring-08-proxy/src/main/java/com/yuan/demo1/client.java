package com.yuan.demo1;

public class client {

    public static void main(String[] args) {
        proxy proxy=new proxy(new landlord());
        proxy.rent();//代理的rent会比房东的rent多加一些操作

    }
}
