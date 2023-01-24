package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
    model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        return "hello";//会被视图解析器处理
    }

    @RequestMapping("/hello2")
    public String hello2(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!2");
        return "hello";//会被视图解析器处理
    }

    @RequestMapping("/hello3")
    public String hello3(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!3");
        return "hello";//会被视图解析器处理
    }


}
