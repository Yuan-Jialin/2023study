package com.example.springboot09mybatisplus.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("books")
public class books {
    @TableId
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
