package com.learning.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/port/{key}")
    public String getPropertyByLoadBalancerClient(@PathVariable String key){
        ServiceInstance producer = loadBalancerClient.choose("producer");

        String url = String.format("http://%s:%s/port/%s", producer.getHost(), producer.getPort(), key);

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, String.class);
    }

    @RequestMapping("/{key}")
    public String getPropertyByRestTemplate(@PathVariable String key){

        String url = String.format("http://producer/port/%s", key);

        return restTemplate.getForObject(url, String.class);
    }


}
