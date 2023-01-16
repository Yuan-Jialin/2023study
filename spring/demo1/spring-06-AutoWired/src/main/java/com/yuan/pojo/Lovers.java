package com.yuan.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Lovers {

   private YangFan yangFan;

   private YuanJialin yuanJialin;


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
