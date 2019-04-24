package com.learning.spring.boot.event;

import com.learning.spring.boot.domain.request.UserCreateRequest;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @Package: com.learning.spring.boot.event
 * @ClassName: CreateUserEvent
 * @Author: beibei.huang
 * @Description: 创建用户事件源
 * @Date: 2019/4/24 8:05
 */
@ToString
public class CreateUserEvent extends ApplicationEvent {

    private UserCreateRequest userCreateRequest;
    /**
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public CreateUserEvent(Object source, UserCreateRequest userCreateRequest) {
        super(source);
        this.userCreateRequest = userCreateRequest;
    }

    public UserCreateRequest getUserCreateRequest() {
        return this.userCreateRequest;
    }
}
