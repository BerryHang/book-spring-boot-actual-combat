package com.learning.spring.boot.controller;

import com.learning.spring.boot.domain.entity.TcSysUserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;
import com.learning.spring.boot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Package: com.learning.spring.boot.controller
 * @ClassName: UserController
 * @Author: beibei.huang
 * @Description: 用户操作控制器
 * @Date: 2019/1/21 10:56
 */
@RestController
@RequestMapping("/")
@Api(tags = "用户操作API")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("查询用户列表")
    @GetMapping("/users")
    public ModelAndView findUser(){
        ModelAndView mv = new ModelAndView();
        List<TcSysUserEntity> users = userService.findUserList();
        mv.addObject("users", users);
        mv.setViewName("users");
        return mv;
    }

    @ApiOperation("根据用户ID查询用户信息")
    @GetMapping("/user/{userId}")
    public ModelAndView findUser(@PathVariable Long userId, ModelMap modelMap){
        ModelAndView mv = new ModelAndView();
        TcSysUserEntity user = userService.findUser(userId);
        mv.addObject("user",user);
        mv.setViewName("user");
        return mv;
    }

    @ApiOperation("根据用户ID删除用户信息")
    @DeleteMapping("/user/{userId}")
    public ModelAndView deleteUser(@PathVariable Long userId){
        ModelAndView mv = new ModelAndView();
        Integer deleteCount = userService.deleteUser(userId);
        mv.addObject("count",deleteCount);
        mv.setViewName("success");
        return mv;
    }

    @ApiOperation("创建用户信息")
    @PostMapping(value = "/user",consumes = MediaType.APPLICATION_JSON)
    public ModelAndView createUser(@RequestBody @Validated UserCreateRequest userInfo){
        ModelAndView mv = new ModelAndView();
        Integer createCount = userService.createUser(userInfo);
        mv.addObject("count",createCount);
        mv.setViewName("success");
        return mv;
    }

    @ApiOperation("更新用户信息")
    @PutMapping(value = "/user",consumes = MediaType.APPLICATION_JSON)
    public ModelAndView updateUser(@RequestBody UserUpdateRequest userInfo){
        ModelAndView mv = new ModelAndView();
        Integer updateCount = userService.updateUser(userInfo);
        mv.addObject("count",updateCount);
        mv.setViewName("success");
        return mv;
    }
}
