package com.learning.spring.boot.controller;

import com.learning.spring.boot.domain.entity.TSysUser;
import com.learning.spring.boot.service.TSysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: TSysUserController
 * @Author: beibei.huang
 * @Description: 用户操作控制器
 * @Date: 2019/3/20 11:36
 */
@RestController
@RequestMapping("/")
@Api(tags = "用户操作API")
public class TSysUserController {

    @Autowired
    private TSysUserService tSysUserService;

    @ApiOperation("查询用户列表")
    @GetMapping("/user/{userId}")
    public ModelAndView findUser(@PathVariable Integer userId){
        ModelAndView mv = new ModelAndView();
        TSysUser user = tSysUserService.findUser(userId);
        mv.addObject("user", user);
        mv.setViewName("user/user");
        return mv;
    }



}
