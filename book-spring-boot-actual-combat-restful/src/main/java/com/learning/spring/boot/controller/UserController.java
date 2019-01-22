package com.learning.spring.boot.controller;

import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;
import com.learning.spring.boot.service.UserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<UserEntity> findUser(){
        return userService.findUserList();
    }

    @GetMapping("/find/{userId}")
    public UserEntity findUser(@PathVariable Integer userId){
        return userService.findUser(userId);
    }

    @DeleteMapping("/delete/{userId}")
    public Integer deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON)
    public Integer createUser(@RequestBody UserCreateRequest userInfo){
        return userService.createUser(userInfo);
    }

    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON)
    public Integer updateUser(@RequestBody UserUpdateRequest userInfo){
        return userService.updateUser(userInfo);
    }
}
