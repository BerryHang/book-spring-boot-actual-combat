package com.learning.spring.boot.event;

import com.learning.spring.boot.domain.request.UserCreateRequest;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@ToString
public class CreateUserEvent extends ApplicationEvent {

    private UserCreateRequest userCreateRequest;

    public CreateUserEvent(Object source, UserCreateRequest userCreateRequest) {
        super(source);
        this.userCreateRequest = userCreateRequest;
    }

    public UserCreateRequest getUserCreateRequest() {
        return this.userCreateRequest;
    }
}
