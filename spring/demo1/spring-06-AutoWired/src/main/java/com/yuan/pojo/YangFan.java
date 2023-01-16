package com.yuan.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class YangFan {


    private int age;
    void showLove(){
        System.out.println("喜欢袁佳林");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
