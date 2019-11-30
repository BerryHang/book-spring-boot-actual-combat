package com.learning.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Package: PACKAGE_NAME
 * @ClassName: ConfigServerApplication
 * @Author: beibei.huang
 * @Description: Spring Cloud config server 入口类
 * @Date: 2019/11/30 14:30
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
