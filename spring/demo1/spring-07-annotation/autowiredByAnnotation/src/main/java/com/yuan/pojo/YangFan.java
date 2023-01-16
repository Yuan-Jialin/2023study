package com.yuan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class YangFan {

    @Value("18")
    private int age;
    public void showLove(){
        System.out.println("喜欢袁佳林");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
