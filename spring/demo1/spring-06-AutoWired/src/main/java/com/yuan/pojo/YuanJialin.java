package com.yuan.pojo;

import org.springframework.beans.factory.annotation.Value;

public class YuanJialin {



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
