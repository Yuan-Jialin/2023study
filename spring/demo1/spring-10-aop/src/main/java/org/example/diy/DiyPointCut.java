package org.example.diy;


import org.springframework.stereotype.Component;

@Component("diypointcut")
public class DiyPointCut {

    public void before(){
        System.out.println("方法执行前");
    }

    public void after(){
        System.out.println("方法执行后");
    }

}
