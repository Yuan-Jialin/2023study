package org.example.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","无视图解析器 转发");
        //默认是转发 forword
        return "/WEB-INF/jsp/test.jsp";


    }
    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg","无视图解析器 重定向");
        //WEB-INF是服务器级别 浏览器访问不了
        return "redirect:/index.jsp";


    }
    @RequestMapping("/test3")
    public String test3(@RequestParam("a") int a,@RequestParam("b") int b, Model model){
        model.addAttribute("msg",a+b);
        return "/WEB-INF/jsp/test.jsp";
    }

    @GetMapping("/test4")
    public String test4( @RequestParam("name") String name ,@RequestParam("id") int id,@RequestParam("age") int age,Model model){

        model.addAttribute("id",id);
        model.addAttribute("name",name);
        model.addAttribute("age",age);

        return "/WEB-INF/jsp/test2.jsp";
    }
}
