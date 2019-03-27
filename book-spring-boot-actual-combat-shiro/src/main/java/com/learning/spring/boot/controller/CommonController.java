package com.learning.spring.boot.controller;

import com.learning.spring.boot.domain.entity.TSysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

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

    @ApiOperation("用户登录操作")
    @PostMapping("/login")
    public ModelAndView userLogin(HttpServletRequest req, HttpServletResponse resp){

        Subject subject = SecurityUtils.getSubject();
        TSysUser userInfo = (TSysUser)subject.getPrincipal();
        ModelAndView mv = new ModelAndView();
        if(Optional.ofNullable(userInfo).isPresent()){
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userInfo.getUserName(), userInfo.getPassword());
            subject.login(usernamePasswordToken);
            mv.setViewName("index");
        }else {
            mv.setViewName("login");
        }
        return mv;
    }

    @ApiOperation("进入主页面")
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

}
