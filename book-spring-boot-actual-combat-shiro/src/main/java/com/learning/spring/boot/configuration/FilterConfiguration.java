package com.learning.spring.boot.configuration;

import com.learning.spring.boot.filter.RequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 过滤器配置
 * @Date: 2019/2/26 16:49
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean filterRegistration() {
        //新建过滤器注册类
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 添加我们写好的过滤器
        registration.setFilter( new RequestFilter());
        registration.setName("requestFilter");
        // 设置过滤器的URL模式
        registration.addUrlPatterns("/*");
        return registration;
    }


}
