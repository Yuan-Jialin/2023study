package com.example.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private boolean flag;
    private Object data;

    private String msg;

    public R(boolean flag,Object data){
        this.data=data;
        this.flag=flag;
    }
    public R(boolean flag,String msg){
        this.msg=msg;
        this.flag=flag;
    }

}
