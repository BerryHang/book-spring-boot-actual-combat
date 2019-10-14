package com.learning.spring.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: ProviderController
 * @Author: beibei.huang
 * @Description: 服务提供者控制器
 * @Date: 2019/10/14 15:40
 */
@Slf4j
@RestController
@RequestMapping("")
public class ProviderController {

    @GetMapping("/{name}")
    public String provider(@PathVariable("name") String name){
        return name + ",this is spring-cloud-eureka-provider!";
    }

}
