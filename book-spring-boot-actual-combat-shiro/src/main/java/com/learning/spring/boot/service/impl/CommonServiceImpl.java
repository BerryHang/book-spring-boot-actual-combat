package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.domain.entity.TComUserRoleRelation;
import com.learning.spring.boot.domain.entity.TComUserRoleRelationExample;
import com.learning.spring.boot.domain.entity.TSysRole;
import com.learning.spring.boot.mapper.*;
import com.learning.spring.boot.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Package: com.learning.spring.boot.service.impl
 * @ClassName: CommonServiceImpl
 * @Author: beibei.huang
 * @Description: 公共功能模块业务接口实现类
 * @Date: 2019/3/21 14:53
 */
public class CommonServiceImpl implements CommonService {

    @Autowired
    private TSysUserMapper tSysUserMapper;

    @Autowired
    private TSysRoleMapper tSysRoleMapper;


    @Autowired
    private TSysMenuMapper tSysMenuMapper;

    @Autowired
    private TSysActionMapper tSysActionMapper;

    @Autowired
    private TComUserRoleRelationMapper tComUserRoleRelationMapper;

    @Autowired
    private TComRoleMenuRelationMapper tComRoleMenuRelationMapper;

    @Autowired
    private TComRoleActionRelationMapper tComRoleActionRelationMapper;

    @Override
    public Set<String> getRolesByUserId(Integer userId){
        TComUserRoleRelationExample tComUserRoleRelationExample = new TComUserRoleRelationExample();
        tComUserRoleRelationExample.createCriteria().andUserIdEqualTo(userId).andFlagEqualTo(false);
        Set<Integer> roles = tComUserRoleRelationMapper.selectByExample(tComUserRoleRelationExample).stream().map(TComUserRoleRelation::getRoleId).collect(Collectors.toSet());
        return tSysRoleMapper.getRoleByIds(roles).stream().map(TSysRole::getRoleName).collect(Collectors.toSet());
    }

    @Override
    public Set<String> getPermissionsByUserId(Integer userId) {
        TComUserRoleRelationExample tComUserRoleRelationExample = new TComUserRoleRelationExample();
        tComUserRoleRelationExample.createCriteria().andUserIdEqualTo(userId).andFlagEqualTo(false);
        Set<Integer> roles = tComUserRoleRelationMapper.selectByExample(tComUserRoleRelationExample).stream().map(TComUserRoleRelation::getRoleId).collect(Collectors.toSet());
        return null;
    }
}
