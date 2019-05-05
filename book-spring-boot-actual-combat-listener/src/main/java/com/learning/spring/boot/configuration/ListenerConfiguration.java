package com.learning.spring.boot.configuration;

import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.event.CreateUserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

/**
 * @Description: 监听器配置
 * @Date: 2019/2/26 18:03
 */
@Configuration
@Slf4j
public class ListenerConfiguration {

    @EventListener
    public void handleEvent(Object event) {
        log.info("监听到事件：{}", event);
    }

    @EventListener
    public void handleCustomEvent(CreateUserEvent createUserEvent) {
        //监听 CustomEvent事件
        log.info("监听到CreateUserEvent事件，消息内容为：{}, 发布时间：{}", createUserEvent.toString(), createUserEvent.getTimestamp());
    }

    /**
     * 监听 code为Berry的事件
     */
    @EventListener(condition="#createUserEvent.userCreateRequest.userName == 'Berry'")
    public void handleCustomEventByCondition(CreateUserEvent createUserEvent) {
        //监听 CustomEvent事件
        log.info("监听到用户名为“Berry”的CreateUserEvent事件，消息内容为：{}, 发布时间：{}", createUserEvent.toString(), createUserEvent.getTimestamp());
    }

    @EventListener
    public void handleObjectEvent(UserCreateRequest userCreateRequest) {
        //这个和eventbus post方法一样了
        log.info("监听到对象事件，消息为：{}", userCreateRequest.toString());

    }

}
