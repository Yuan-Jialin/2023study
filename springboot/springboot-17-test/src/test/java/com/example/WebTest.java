package com.example;

import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/27 12:19
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc//虚拟调用mvc
public class WebTest {
    @Autowired
    User user;
    @Test
    public void Test1(){
        System.out.println(user.getName());
    }

    @Test
    void TestWeb(@Autowired MockMvc mockMvc) throws Exception {
        MockHttpServletRequestBuilder request= MockMvcRequestBuilders.get("/book1");
        //接受请求结果
        ResultActions perform = mockMvc.perform(request);

        //定义本次调用的预期值
        StatusResultMatchers status= MockMvcResultMatchers.status();
        //预计本次调用时的状态
        ResultMatcher ok = status.isOk();
        //看看是否匹配
        perform.andExpect(ok);

    }

    @Test
    void TestBody(@Autowired MockMvc mockMvc) throws Exception {
        MockHttpServletRequestBuilder request= MockMvcRequestBuilders.get("/book1");
        //接受请求结果
        ResultActions perform = mockMvc.perform(request);

        //定义本次调用的预期值
        StatusResultMatchers status= MockMvcResultMatchers.status();
        //预计本次调用时的状态
        ResultMatcher ok = status.isOk();
        //看看是否匹配
        perform.andExpect(ok);

    }


    @Test
    void TestCOntent(@Autowired MockMvc mockMvc) throws Exception {
        MockHttpServletRequestBuilder request= MockMvcRequestBuilders.get("/book");
        //接受请求结果
        ResultActions perform = mockMvc.perform(request);

        //定义本次调用的预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();

        ResultMatcher springBoot = content.string("SpringBoot");

        //看看是否匹配
        perform.andExpect(springBoot);

    }


    @Test
    void TestJson(@Autowired MockMvc mockMvc) throws Exception {
        MockHttpServletRequestBuilder request= MockMvcRequestBuilders.get("/book");
        //接受请求结果
        ResultActions perform = mockMvc.perform(request);

        //定义本次调用的预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();

        ResultMatcher springBoot = content.json("{\"msg\":\"qq\",\"name\":\"ss\"}");

        //看看是否匹配
        perform.andExpect(springBoot);

    }

    @Test
    void TestContentType(@Autowired MockMvc mockMvc) throws Exception {
        MockHttpServletRequestBuilder request= MockMvcRequestBuilders.get("/book");
        //接受请求结果
        ResultActions perform = mockMvc.perform(request);

        //定义本次调用的预期值
        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher string = header.string("Content-Type", "application/json");


        //看看是否匹配
        perform.andExpect(string);

    }
}
