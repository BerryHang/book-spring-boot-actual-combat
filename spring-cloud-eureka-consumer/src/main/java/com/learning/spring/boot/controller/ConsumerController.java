package com.learning.spring.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: ConsumerController
 * @Author: beibei.huang
 * @Description: 消费者控制器
 * @Date: 2019/10/14 15:51
 */
@Slf4j
@RestController
@RequestMapping("")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("eureka-consumer")
    private String applicationName;

    @GetMapping("")
    public String test(){
        return restTemplate.getForObject("http://EUREKA-PROVIDER/"+applicationName,String.class);
    }

}
