package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/3/3 21:00
 */
@SpringBootTest
public class SpringbootTemplateTest {

    //通过这个类放进去的数据会被加工成，在控制台不好操控
    @Autowired
    private RedisTemplate redisTemplate;


    //通过这个类操作可以实现和控制台同步
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    void get(){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        //之前从控制台放入的数据
        String name = stringStringValueOperations.get("name");
        System.out.println(name);
    }

}
