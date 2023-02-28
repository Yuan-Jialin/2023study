package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;




/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 11:24
 */
@SpringBootTest(args = {"--test2.prop2=value2"})
public class PropertiesAndArgsTest {
    @Value("${test2.prop2}")
    private String msg;

    @Test
    void testProperties(){
        System.out.println(msg);
    }
}
