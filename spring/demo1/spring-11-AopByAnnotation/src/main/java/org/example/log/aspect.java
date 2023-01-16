package org.example.log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect//maven里面添加依赖才有
public class aspect {

    @Before("execution(* org.example.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }

    @After("execution(* org.example.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

    @Around("execution(* org.example.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");

        Object result=pj.proceed();

        System.out.println("环绕后");
    }


}
