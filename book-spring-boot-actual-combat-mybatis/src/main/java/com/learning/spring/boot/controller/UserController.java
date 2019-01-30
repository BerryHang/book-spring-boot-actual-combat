package com.learning.spring.boot.controller;

import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;
import com.learning.spring.boot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<UserEntity> findUser(){
        return userService.findUserList();
    }

    @ApiOperation("根据用户ID查询用户信息")
    @GetMapping("/user/{userId}")
    public UserEntity findUser(@PathVariable Long userId){
        return userService.findUser(userId);
    }

    @ApiOperation("根据用户ID删除用户信息")
    @DeleteMapping("/user/{userId}")
    public Integer deleteUser(@PathVariable Long userId){
        return userService.deleteUser(userId);
    }

    @ApiOperation("创建用户信息")
    @PostMapping(value = "/user",consumes = MediaType.APPLICATION_JSON)
    public Integer createUser(@RequestBody UserCreateRequest userInfo){
        return userService.createUser(userInfo);
    }

    @ApiOperation("更新用户信息")
    @PutMapping(value = "/user",consumes = MediaType.APPLICATION_JSON)
    public Integer updateUser(@RequestBody UserUpdateRequest userInfo){
        return userService.updateUser(userInfo);
    }
}
