package com.learning.spring.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: CommonController
 * @Author: beibei.huang
 * @Description: 公共模块控制器
 * @Date: 2019/3/20 16:51
 */
@RestController
@RequestMapping("/")
@Api(tags = "公共功能操作API")
public class CommonController {

    @ApiOperation("跳转至登录页面")
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

}
