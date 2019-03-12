package com.learning.spring.boot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description: 系统请求监听器
 * @Date: 2019/2/26 17:41
 */
@WebListener
@Slf4j
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("监听器初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("监听器销毁");
    }

}
