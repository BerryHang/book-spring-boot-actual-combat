package com.learning.spring.boot.configuration;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: SecurityConfiguration
 * @Author: beibei.huang
 * @Description: 用户权限配置类
 * @Date: 2019/7/7 16:43
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //创建密码编辑器
        PasswordEncoder psswordEncoder = new BCryptPasswordEncoder();
        //使用内存存储信息
        auth.inMemoryAuthentication()
                //设置密码编辑器
                .passwordEncoder(psswordEncoder)
                //添加用户名和密码信息 并赋予角色信息
                .withUser("admin").password("$2a$10$t/Wfx1QMmhV5gXuKCI5bdu0yIhckRZ0HZXGE8sbijxxGMkwR6cruC").roles("admin")
                .and().withUser("berry").password("$2a$10$0yqV5U.4zVoF2uMYaz0GcOzCcdnRu1ZMTXh7aJus23s2sjlW0if0i").roles("manager");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //定义需要权限 才能访问的端点
        String[] endPoints = {"auditevents", "beans", "caches", "conditions", "configprops", "env"
                , "flyway", "httptrace", "integrationgraph", "loggers", "liquibase", "metrics"
                , "mappings", "scheduledtasks", "sessions", "shutdown", "threaddump"};

        //定义需要验证的请求
        http.requestMatcher(EndpointRequest.to(endPoints))
                //配置权限过滤
                .authorizeRequests().anyRequest().hasRole("admin").and().antMatcher("/logout")
                .authorizeRequests().anyRequest().hasRole("admin").and().httpBasic();
    }

}
