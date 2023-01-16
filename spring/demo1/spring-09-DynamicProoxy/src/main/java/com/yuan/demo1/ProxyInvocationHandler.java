package com.yuan.demo1;

import com.yuan.demo.rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result =method.invoke(target,args);//通过反射调用对应的方法



        return result;
    }


}
