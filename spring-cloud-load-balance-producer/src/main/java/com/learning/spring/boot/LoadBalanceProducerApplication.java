package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.learning.spring.boot
 * @ClassName: LoadBalanceProducerApplication
 * @Author: beibei.huang
 * @Description: 负载均衡服务提供方启动类
 * @Date: 2019/12/3 16:41
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LoadBalanceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadBalanceProducerApplication.class);
    }

}
