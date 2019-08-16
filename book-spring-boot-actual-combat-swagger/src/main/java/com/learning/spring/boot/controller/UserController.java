package com.learning.spring.boot.controller;

import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.*;
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
    public UserEntity findUser(@PathVariable Integer userId){
        return userService.findUser(userId);
    }

    @ApiOperation("根据用户ID删除用户信息")
    @DeleteMapping("/user/{userId}")
    public Integer deleteUser(@PathVariable Integer userId){
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

    @PostMapping(value = "/update/clue",consumes = MediaType.APPLICATION_JSON)
    public Integer updateClue(@RequestBody ClueInfo clueInfo){
        return null;
    }

    @PostMapping(value = "/create/clue",consumes = MediaType.APPLICATION_JSON)
    public Integer createClue(@RequestBody ClueInfo clueInfo){
        return null;
    }

    @PostMapping(value = "/update/niche",consumes = MediaType.APPLICATION_JSON)
    public Integer updateNiche(@RequestBody NicheInfo nicheInfo){
        return null;
    }

    @PostMapping(value = "/create/nihce",consumes = MediaType.APPLICATION_JSON)
    public Integer createNiche(@RequestBody NicheInfo nicheInfo){
        return null;
    }

    @PostMapping(value = "/agent/frozen",consumes = MediaType.APPLICATION_JSON)
    public Integer frozenAgent(@RequestBody AgentInfo agentInfo){
        return null;
    }


    @PostMapping(value = "/agent/open/sea",consumes = MediaType.APPLICATION_JSON)
    public Integer agentOpenSea(@RequestBody AgentOpenSea agentOpenSea){
        return null;
    }

    @PostMapping(value = "/agent/product/config",consumes = MediaType.APPLICATION_JSON)
    public Integer agentProductConfig(@RequestBody AgentProduct agentProduct){
        return null;
    }

    @PostMapping(value = "/clue/channel/open/sea",consumes = MediaType.APPLICATION_JSON)
    public Integer clueChannelOpenSea(@RequestBody AgentProduct agentProduct){
        return null;
    }

    @PostMapping(value = "/clue/agent/open/sea",consumes = MediaType.APPLICATION_JSON)
    public Integer clueAgentOpenSea(@RequestBody AgentProduct agentProduct){
        return null;
    }

}
