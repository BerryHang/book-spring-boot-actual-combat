package com.learning.spring.boot.controller;

import com.learning.spring.boot.constant.ViewConstant;
import com.learning.spring.boot.domain.request.UserLoginBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        if (SecurityUtils.getSubject().isAuthenticated()) {
            mv.setViewName(ViewConstant.INDEX);
        }else {
            mv.setViewName(ViewConstant.LOGIN);
        }
        return mv;
    }

    @ApiOperation("用户登录操作")
    @PostMapping("/login")
    public ModelAndView userLogin(UserLoginBean userLoginBean){

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userLoginBean.getUsername(), userLoginBean.getPassword());
        ModelAndView mv = new ModelAndView();
        try{
            subject.login(usernamePasswordToken);
            mv.addObject("loginUser",usernamePasswordToken.getUsername());
            mv.setViewName(ViewConstant.INDEX);
        } catch (UnknownAccountException exception){
            mv.setViewName(ViewConstant.LOGIN);
        }
        return mv;
    }

    @ApiOperation("进入主页面")
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName(ViewConstant.INDEX);
        return mv;
    }

    @ApiOperation("退出登录")
    @GetMapping("/logout")
    public ModelAndView logout() {
        ModelAndView mv = new ModelAndView();
        // 1、获取Subject
        Subject subject = SecurityUtils.getSubject();

        // 2、执行注销
        try {
            subject.logout();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            mv.setViewName(ViewConstant.LOGIN);
            return mv;
        }
    }

}
