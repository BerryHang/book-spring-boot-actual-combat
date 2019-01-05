package com.learning.spring.boot;

import com.learning.spring.boot.service.AnnotationService;
import com.learning.spring.boot.service.RoutineService;
import com.learning.spring.boot.service.UseIocService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.learning.spring.boot")
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        UseIocService useIocService = context.getBean(UseIocService.class);
        System.out.println(useIocService.sayHello());
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        RoutineService routineService = context.getBean(RoutineService.class);
        annotationService.getName();
        routineService.getName();
        context.close();
    }

}
