package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.domain.entity.TcSysUserEntity;
import com.learning.spring.boot.jpa.TcSysUserJPA;
import com.learning.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beibei.huang
 * @Title: UserServiceImpl
 * @ProjectName spring-boot-learning
 * @Description: 用户业务实现类
 * @date 2018/10/26    11:24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TcSysUserJPA tcSysUserJPA;


    @Override
    public List<TcSysUserEntity> findAll() {
        /*TcSysUserEntity tcSysUserEntity = new TcSysUserEntity();
        tcSysUserEntity.setUserId(1L);
        List<TcSysUserEntity> list = new ArrayList<>();
        list.add(tcSysUserEntity);
        return list;*/
        return tcSysUserJPA.findAll();
    }
}
