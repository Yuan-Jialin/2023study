package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Springboot18RedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {

    }
    @Test
    void set(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("age",23);
    }
    @Test
    void get(){
        ValueOperations ops = redisTemplate.opsForValue();
        Object age = ops.get("age");
        System.out.println(age);
    }
    @Test
    void setHash(@Autowired RedisTemplate redisTemplate){
        HashOperations hashOperations = redisTemplate.opsForHash();
       hashOperations.put("key1","a1","杨帆");


    }
    @Test
    void getHash(@Autowired RedisTemplate redisTemplate){
        HashOperations hashOperations = redisTemplate.opsForHash();
        Object o = hashOperations.get("key1", "a1");
        System.out.println(o);
    }
    @Test
    void DeleteHash(@Autowired RedisTemplate redisTemplate){
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.delete("key1","a1");
    }

}
