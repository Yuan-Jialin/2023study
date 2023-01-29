package org.example.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //@control 换成这个 相当于 下面所有方法全部加了 @ResponseBody
@Controller
public class UserController {

    //@ResponseBody//加上这个注解 就不会走视图解析器 会直接返回一个页面
//    @RequestMapping(value = "/json1",produces = "application/json;charset=utf-8") 因为在spring-mvc.xml文件中配置了 json编码 所以 produces可以不用写
    @RequestMapping(value = "/json1")
    public String json1() throws JsonProcessingException {
        User user=new User(3,"杨帆","男");
        ObjectMapper mapper=new ObjectMapper();
        String s = mapper.writeValueAsString(user);

        return s;
    }

    @RequestMapping(value = "/fastjson")
    public String fastjson(){
        User user=new User(3,"杨帆","男");
        String s = JSON.toJSONString(user);
        return s;
    }
}
