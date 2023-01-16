package com.yang.pojo;

public class Love {

    private YangFan yangFan;
    private YuanJialin yuanJialin;

    public Love(YangFan yangFan, YuanJialin yuanJialin) {
        this.yangFan = yangFan;
        this.yuanJialin = yuanJialin;
        System.out.println("Love");
        //当bean中通过有参数的构造方法进行构造时 可以不需要set方法
    }
}
