package com.example.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjh
 * @date 2022/06/10
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(){
        return "hello springboot";
    }
}
