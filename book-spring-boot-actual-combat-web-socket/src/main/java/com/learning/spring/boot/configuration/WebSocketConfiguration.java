package com.learning.spring.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Package: com.learning.spring.boot.controler
 * @ClassName: WebSocketController
 * @Author: beibei.huang
 * @Description: web socket 配置类
 * @Date: 2019/5/31 15:40
 */
@Configuration
@EnableWebSocket
public class WebSocketConfiguration {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
