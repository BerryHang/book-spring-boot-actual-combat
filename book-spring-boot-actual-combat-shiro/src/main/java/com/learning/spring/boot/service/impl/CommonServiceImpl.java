package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.domain.entity.*;
import com.learning.spring.boot.mapper.*;
import com.learning.spring.boot.service.CommonService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.SetUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Package: com.learning.spring.boot.service.impl
 * @ClassName: CommonServiceImpl
 * @Author: beibei.huang
 * @Description: 公共功能模块业务接口实现类
 * @Date: 2019/3/21 14:53
 */
@Service
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
        if (CollectionUtils.isEmpty(roles)){
            return SetUtils.EMPTY_SET;
        }
        return tSysRoleMapper.getRoleByIds(roles).stream().map(TSysRole::getRoleName).collect(Collectors.toSet());
    }

    @Override
    public Set<String> getPermissionsByUserId(Integer userId) {
        TComUserRoleRelationExample tComUserRoleRelationExample = new TComUserRoleRelationExample();
        tComUserRoleRelationExample.createCriteria().andUserIdEqualTo(userId).andFlagEqualTo(false);
        Set<Integer> roles = tComUserRoleRelationMapper.selectByExample(tComUserRoleRelationExample).stream().map(TComUserRoleRelation::getRoleId).collect(Collectors.toSet());
        if (CollectionUtils.isEmpty(roles)){
            return SetUtils.EMPTY_SET;
        }
        Set<Integer> menus = tComRoleMenuRelationMapper.getMenuByIds(roles).stream().map(TComRoleMenuRelation::getMenuId).collect(Collectors.toSet());
        return tSysMenuMapper.getMenuPermissionsByIds(menus).stream().map(TSysMenu::getPermissions).collect(Collectors.toSet());
    }
}
