package com.learning.spring.boot.listener;

import com.learning.spring.boot.event.CreateUserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Package: com.learning.spring.boot.listener
 * @ClassName: EventListener
 * @Author: beibei.huang
 * @Description: ApplicationListener监听事件发布
 * @Date: 2019/4/24 8:15
 */
@Component
@Slf4j
public class EventListener implements ApplicationListener<CreateUserEvent> {
    @Override
    public void onApplicationEvent(CreateUserEvent event) {
        log.info("ApplicationListener方式监听事件,消息内容为：{}", event);
    }
}
