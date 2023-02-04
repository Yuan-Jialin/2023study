package com.example.springboot10druid.pojo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
