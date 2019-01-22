package com.learning.spring.boot.controller;

import com.learning.spring.boot.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author: Berry Huang
 * @Description: ${description}
 * @Date: 2018/12/28 15:28
 */
@RestController
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping( produces = MediaType.APPLICATION_JSON)
    public String helloSpringBoot(){
        return "Hello Spring boot!";
    }

    @GetMapping("info")
    public String basicInfo(){
        return basicService.getAuthorInfo();
    }

}
