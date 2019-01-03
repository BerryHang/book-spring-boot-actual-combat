package com.learning.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseIocService {

    @Autowired
    private TestIocService testIocService;

    public String sayHello(){
        return testIocService.sayHello();
    }
}
