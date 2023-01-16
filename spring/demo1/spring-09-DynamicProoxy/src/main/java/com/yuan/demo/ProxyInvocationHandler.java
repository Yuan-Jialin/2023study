package com.yuan.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private rent rent;
    public  void setRent(rent rent)
    {
        this.rent=rent;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }


    //传统的 proxy中
    /*
    @Override
    public void add() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.add();
    }

    @Override
    public void delete() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.delete();
    }

    @Override
    public void update() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.update();
    }

    @Override
    public void query() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.query();

    }

     每个方法前都要加重复的操作，现在可以通过反射执行对应的方法 然后在通过反射调用方法前 加上重复的操作

     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //可以加重复的操作
        seehouse();
        Object result =method.invoke(rent,args);//通过反射调用对应的方法

        //可以加重复的操作
        contract();

        return result;
    }

    public void seehouse(){
        System.out.println("看房子");
    }

    public void contract(){
        System.out.println("签合同");
    }
}
