package com.yuan.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Lovers {


    //required = false 表示值可以为null 默认required =true 表示值不可以为null
    @Autowired(required = false)
   private YangFan yangFan;

    //Qualifier 可以显示的指定一个beans进行装入
    @Autowired
    @Qualifier(value = "yuanJialin")
   private YuanJialin yuanJialin;
    @Value("100")
   private int period;

    public YangFan getYangFan() {
        return yangFan;
    }

    public void setYangFan(YangFan yangFan) {
        this.yangFan = yangFan;
    }

    public YuanJialin getYuanJialin() {
        return yuanJialin;
    }

    public void setYuanJialin(YuanJialin yuanJialin) {
        this.yuanJialin = yuanJialin;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
