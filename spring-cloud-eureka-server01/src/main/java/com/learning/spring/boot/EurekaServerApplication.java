package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Package: com.learning.spring.boot
 * @ClassName: EurekaServerApplication
 * @Author: beibei.huang
 * @Description: Eureka注册中心
 * @Date: 2019/10/9 18:58
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
