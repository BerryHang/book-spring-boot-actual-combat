package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Package: com.learning.spring.boot
 * @ClassName: EurekaConfigApplication
 * @Author: beibei.huang
 * @Description: Eureka配置
 * @Date: 2019/10/9 10:37
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigApplication.class, args);
    }

}
