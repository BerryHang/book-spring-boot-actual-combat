package com.learning.spring.boot;

import com.learning.spring.boot.service.UseIocService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning.spring.boot")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        UseIocService useIocService = context.getBean(UseIocService.class);
        System.out.println(useIocService.sayHello());
        context.close();
    }

}
