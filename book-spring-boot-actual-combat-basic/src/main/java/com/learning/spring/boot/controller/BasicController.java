package com.learning.spring.boot.controller;

import com.learning.spring.boot.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Berry Huang
 * @Description: ${description}
 * @Date: 2018/12/28 15:28
 */
@RestController
@RequestMapping("/")
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping("/")
    public String helloSpringBoot(){
        return "Hello Spring Boot！";
    }

    @GetMapping("/info")
    public String basicInfo(){
        return basicService.getAuthorInfo();
    }

}
