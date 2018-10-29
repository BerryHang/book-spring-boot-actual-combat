package com.learning.spring.boot.controller;

import com.learning.spring.boot.domain.entity.TcSysUserEntity;
import com.learning.spring.boot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author beibei.huang
 * @Title: UserController
 * @ProjectName spring-boot-learning
 * @Description: 用户相关操作
 * @date 2018/10/23    10:29
 */
@RestController
@RequestMapping("/user")
@Api("用户相关操作API")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有用户信息" , notes = "查询所有用户信息")
    @GetMapping("list")
    public List<TcSysUserEntity> findAll(){
        return userService.findAll();
    }


}
