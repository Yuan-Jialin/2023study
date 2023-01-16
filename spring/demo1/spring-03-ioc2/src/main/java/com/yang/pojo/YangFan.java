package com.yang.pojo;

public class YangFan {
    private int Age;
    private int Height;
    private String BoyFriendName;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public String getBoyFriendName() {
        return BoyFriendName;
    }

    public void setBoyFriendName(String boyFriendName) {
        BoyFriendName = boyFriendName;
    }

    @Override
    public String toString() {
        return "YangFan{" +
                "Age=" + Age +
                ", Height=" + Height +
                ", BoyFriendName='" + BoyFriendName + '\'' +
                '}';
    }

    public YangFan(){
        System.out.println("create object by construction method without parameters");
    }

    public YangFan(int age, int height, String boyFriendName) {
        Age = age;
        Height = height;
        BoyFriendName = boyFriendName;

        System.out.println("create object by construction method with parameters");
    }

    public void showLove(){
        System.out.println("喜欢袁佳林");
    }
}
