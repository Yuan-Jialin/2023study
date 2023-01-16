package com.yang.pojo;

public class YuanJialin {

    int age;
    String girl;

    public void setAge(int age) {
        this.age = age;
    }

    public YuanJialin(int age,String girl) {
        this.age = age;
        this.girl=girl;
        System.out.println("create object by construction method with parameters");
    }
    public YuanJialin(String girl) {

        this.girl=girl;
        System.out.println("create object by construction method with one parameter");
    }
}
