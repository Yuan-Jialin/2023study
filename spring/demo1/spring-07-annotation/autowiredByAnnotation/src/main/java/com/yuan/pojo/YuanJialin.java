package com.yuan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class YuanJialin {

    @Value("8")
    private int age;
    public void showLove(){
        System.out.println("喜欢杨帆");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
