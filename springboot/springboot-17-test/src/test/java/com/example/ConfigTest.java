package com.example;

import com.example.Config.MsgConfig;
import com.example.Config.PojoConfig;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 11:52
 */
@SpringBootTest
@Import({MsgConfig.class, PojoConfig.class})
public class ConfigTest {
    @Autowired
    private User user;
    @Autowired
    private String msg;
    @Test
    public void Testconfig(){
        System.out.println(user.getMsg());

    }
}
