package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 11:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    @Value("qq")
    String msg;
    @Value("ss")
    String name;
}
