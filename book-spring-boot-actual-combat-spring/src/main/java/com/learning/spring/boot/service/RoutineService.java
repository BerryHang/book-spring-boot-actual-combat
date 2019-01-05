package com.learning.spring.boot.service;

import org.springframework.stereotype.Service;

@Service
public class RoutineService {

    public String getName(){
        System.out.println("方法截 getName执行中");
        return "Routine method";
    }

}
