package com.example.Controller;

import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 13:26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private User user;
    @GetMapping
    public User getById(){

    return user;
    }
}
