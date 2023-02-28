package com.example.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 12:04
 */
@Data
@Component
@ConfigurationProperties(prefix = "testcase.book")
public class book {
    private int id;

    private int id2;

    private int id3;
    private String bookName;
    private  int bookCounts;
    private  String detail;
}
