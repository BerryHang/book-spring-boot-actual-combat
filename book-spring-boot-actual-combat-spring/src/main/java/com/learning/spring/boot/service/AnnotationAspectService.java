package com.learning.spring.boot.service;

import com.learning.spring.boot.annotation.Action;
import org.springframework.stereotype.Service;

@Service
public class AnnotationAspectService {

    @Action(name = "通过注解方式拦截")
    public void doAnnotationAspect(){};
}
