package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.learning.spring.boot
 * @ClassName: LoadBalanceConsumerApplication
 * @Author: beibei.huang
 * @Description: 负载均衡服务消费方启动类
 * @Date: 2019/12/3 16:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LoadBalanceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadBalanceConsumerApplication.class);
    }

}
