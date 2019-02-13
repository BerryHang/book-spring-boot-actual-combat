package com.learning.spring.boot.service;

import com.learning.spring.boot.domain.entity.TcSysUserEntity;

import java.util.List;

/**
 * @author beibei.huang
 * @Title: UserService
 * @ProjectName spring-boot-learning
 * @Description: 用户service接口
 * @date 2018/10/26    11:23
 */
public interface UserService {

    List<TcSysUserEntity> findAll();
}
