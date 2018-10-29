package com.learning.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author beibei.huang
 * @Title: HelloWord
 * @ProjectName spring-boot-learning
 * @Description: 第一个接口
 * @date 2018/10/23    10:30
 */
@RestController
public class HelloWord {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
