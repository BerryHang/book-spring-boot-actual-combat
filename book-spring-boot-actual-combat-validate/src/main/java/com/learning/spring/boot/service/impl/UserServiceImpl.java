package com.learning.spring.boot.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.learning.spring.boot.domain.entity.TcSysUserEntity;
import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;
import com.learning.spring.boot.mapper.TcSysUserMapper;
import com.learning.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.service.impl
 * @ClassName: UserServiceImpl
 * @Author: beibei.huang
 * @Description: 用户业务操作类
 * @Date: 2019/1/21 11:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TcSysUserMapper tcSysUserMapper;

    @Override
    public List<TcSysUserEntity> findUserList(){
       return tcSysUserMapper.findUserList();
    }

    @Override
    public TcSysUserEntity findUser(Long userId) {
        return tcSysUserMapper.findUser(userId);
    }

    @Override
    public Integer deleteUser(Long userId) {
        return tcSysUserMapper.deleteUser(userId);
    }

    @Override
    public Integer createUser(UserCreateRequest userInfo) {
        return tcSysUserMapper.createUser(userInfo);
    }

    @Override
    public Integer updateUser(UserUpdateRequest userInfo) {
        return tcSysUserMapper.updateUser(userInfo);
    }

}
