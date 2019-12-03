package com.learning.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: ConsumerController
 * @Author: beibei.huang
 * @Description: 消费者控制器
 * @Date: 2019/12/3 16:57
 */
@RestController
@RequestMapping("/")
public class ConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;




}
