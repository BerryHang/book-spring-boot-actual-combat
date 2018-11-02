package com.learning.spring.boot.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author beibei.huang
 * @Title: HelloJsp
 * @ProjectName book-spring-boot-actual-combat-parent
 * @Description: spring boot 对JSP的支持 控制层
 * @date 2018/11/2    15:10
 */
@RestController
@RequestMapping("/")
public class HelloJsp {

    @GetMapping("map")
    public String index(String name , ModelMap modelMap){
        modelMap.addAttribute("name",name);
        return "index";
    }

    @GetMapping("mv")
    public ModelAndView index(String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("index");
        return mv;
    }

}
