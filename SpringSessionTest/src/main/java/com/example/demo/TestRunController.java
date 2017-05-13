package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dade on 2017/5/13.
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

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public Map<String, Object> firstResp (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("request Url", request.getRequestURL());
        map.put("request Url", request.getRequestURL());
        return map;
    }

    @RequestMapping(value = "/sessions", method = RequestMethod.GET)
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("request Url"));
        return map;
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
