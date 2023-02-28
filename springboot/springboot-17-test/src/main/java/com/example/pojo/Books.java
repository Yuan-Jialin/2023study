package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 9:44
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

    public Books(String bookName, int bookCounts, String detail) {
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }
}
