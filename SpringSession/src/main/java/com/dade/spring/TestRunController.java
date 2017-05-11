package com.dade.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2017/5/9.
 */
@RestController
public class TestRunController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/api/redis")
    String testRedis(){
        stringRedisTemplate.opsForValue().set("dade", "faker");
        return stringRedisTemplate.opsForValue().get("dade");
    }

    @RequestMapping("/api/get_session")
    String getSession(){
        return "";
    }


    @RequestMapping("/api/test")
    String test(){
        return "Hello Spring Session!";
    }

}
