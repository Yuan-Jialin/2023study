package com.yuan.demo1;

import com.yuan.demo.landlord;

import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        ProxyInvocationHandler proxyInvocationHandler=new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(new landlord());

        com.yuan.demo.rent rent= (com.yuan.demo.rent) proxyInvocationHandler.getProxy();
        rent.rent();


    }
}
