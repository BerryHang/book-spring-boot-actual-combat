package com.learning.spring.boot.service;

import com.learning.spring.boot.annotation.Action;
import org.springframework.stereotype.Service;

@Service
public class AnnotationService {

    @Action(name = "通过注解拦截getName 方法")
    public String getName(){
        System.out.println("注解方式拦截 getName执行中");
        return "Annotation method";
    }

}
