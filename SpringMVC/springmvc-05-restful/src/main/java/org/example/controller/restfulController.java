package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class restfulController {

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String add(@PathVariable int a,@PathVariable int b, Model model)
    {   Integer ans=a+b;
        String res=ans.toString();
        model.addAttribute("msg",res);
        return "test";

    }

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.POST)
    public String add2(@PathVariable int a,@PathVariable int b, Model model)
    {   Integer ans=a+b;
        String res=ans.toString();
        model.addAttribute("msg",res);
        return "test";

    }

}
