package com.learning.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: ProducerController
 * @Author: beibei.huang
 * @Description: 生产者控制器
 * @Date: 2019/12/3 16:57
 */
@RestController
@RequestMapping("/")
public class ProducerController {

    @Autowired
    private Environment environment;

    @RequestMapping("port/{key}")
    public String getProperty(@PathVariable String key) {
        return "port：" + environment.getProperty(key);
    }

}
