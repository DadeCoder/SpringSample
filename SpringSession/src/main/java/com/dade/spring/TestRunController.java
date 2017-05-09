package com.dade.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2017/5/9.
 */
@RestController
public class TestRunController {

    @RequestMapping("/api/test")
    String test(){
        return "Hello Spring Session!";
    }

}
