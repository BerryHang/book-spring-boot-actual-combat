package com.learning.spring.boot.configuration;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.SpringComponentProvider;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: JerseyConfig
 * @Author: beibei.huang
 * @Description: Jersey配置类
 * @Date: 2019/1/17 11:26
 */
@Configuration
@ComponentScan("com.learning.spring.boot.controller")
public class JerseyConfig extends ResourceConfig {

  /*  public JerseyConfig() {
        register(RequestContextFilter.class);
        packages("com.learning.spring.boot.controller");
        register(JacksonFeature.class);
        register(RequestContextFilter.class);
        register(SpringComponentProvider.class);
    }*/
}
