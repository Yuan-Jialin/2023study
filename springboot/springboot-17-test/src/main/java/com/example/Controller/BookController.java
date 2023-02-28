package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 13:26
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public String getById(){

        System.out.println("Get is Running");
        return "SpringBoot";
    }
}
