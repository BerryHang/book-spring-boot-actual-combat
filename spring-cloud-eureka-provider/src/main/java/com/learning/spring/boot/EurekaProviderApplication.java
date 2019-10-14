package com.learning.spring.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.learning.spring.boot
 * @ClassName: EurekaProviderApplication
 * @Author: beibei.huang
 * @Description: 服务提供者启动类
 * @Date: 2019/10/14 15:26
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }

}
