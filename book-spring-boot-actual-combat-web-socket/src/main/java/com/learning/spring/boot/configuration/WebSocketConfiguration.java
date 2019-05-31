package com.learning.spring.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: WebSocketConfiguration
 * @Author: beibei.huang
 * @Description: Web Socket配置类
 * @Date: 2019/5/31 15:07
 */
@Configuration
public class WebSocketConfiguration {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
