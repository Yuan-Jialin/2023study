package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {

    @RequestMapping("/test2")
    public String test2(HttpServletRequest request, HttpServletResponse response, Model model){
        HttpSession session = request.getSession();
        String id = session.getId();
        System.out.println("id="+id);
       model.addAttribute("msg","test");
        return  "test";
    }

}
