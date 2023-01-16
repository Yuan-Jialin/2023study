package com.yuan.demo;

public class client {
    public static void main(String[] args) {
        landlord landlord=new landlord();
        ProxyInvocationHandler proxyInvocationHandler= new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(landlord);
        rent rent=(rent) proxyInvocationHandler.getProxy();
        rent.rent();
    }
}
