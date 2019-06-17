package com.learning.spring.boot.service.system.impl;

import com.learning.spring.boot.domain.entity.TRole;
import com.learning.spring.boot.domain.entity.TRoleExample;
import com.learning.spring.boot.domain.entity.TRoleMenu;
import com.learning.spring.boot.domain.entity.TRoleMenuExample;
import com.learning.spring.boot.domain.response.Role;
import com.learning.spring.boot.domain.response.RoleMenu;
import com.learning.spring.boot.domain.response.RoleWithMenu;
import com.learning.spring.boot.mapper.TRoleMapper;
import com.learning.spring.boot.mapper.TRoleMenuMapper;
import com.learning.spring.boot.service.system.RoleMenuServie;
import com.learning.spring.boot.service.system.RoleService;
import com.learning.spring.boot.service.system.UserRoleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service("roleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RoleServiceImpl implements RoleService {

    @Autowired
    private TRoleMapper roleMapper;

    @Autowired
    private TRoleMenuMapper roleMenuMapper;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleMenuServie roleMenuService;

    @Override
    public List<Role> findUserRole(String userName) {
        return roleMapper.findUserRole(userName);
    }

    @Override
    public List<TRole> findAllRole(Role role) {
        TRoleExample tRoleExample = new TRoleExample();
        if (StringUtils.isNotBlank(role.getRoleName())) {
            tRoleExample.createCriteria().andRoleNameEqualTo( role.getRoleName());
        }
        tRoleExample.setOrderByClause("create_time");
        return roleMapper.selectByExample(tRoleExample);
    }

    @Override
    public TRole findByName(String roleName) {
        TRoleExample tRoleExample = new TRoleExample();
        tRoleExample.createCriteria().andRoleNameEqualTo( roleName);
        List<TRole> list = roleMapper.selectByExample(tRoleExample);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    @Transactional
    public void addRole(Role role, Long[] menuIds) {
        role.setCreateTime(new Date());
        TRole tRole = new TRole();
        BeanUtils.copyProperties(role, tRole);
        roleMapper.insertSelective(tRole);
        setRoleMenus(role, menuIds);
    }

    private void setRoleMenus(Role role, Long[] menuIds) {
        Arrays.stream(menuIds).forEach(menuId -> {
            RoleMenu rm = new RoleMenu();
            rm.setMenuId(menuId);
            rm.setRoleId(role.getRoleId());
            TRoleMenu tRoleMenu = new TRoleMenu();
            BeanUtils.copyProperties(rm,tRoleMenu);
            roleMenuMapper.insert(tRoleMenu);
        });
    }

    @Override
    @Transactional
    public void deleteRoles(String roleIds) {
        List<String> list = Arrays.asList(roleIds.split(","));
        for (String id : list){
            TRoleExample tRoleExample = new TRoleExample();
            tRoleExample.createCriteria().andRoleIdEqualTo(Long.valueOf(id));
            roleMapper.deleteByExample(tRoleExample);
        }
        this.roleMenuService.deleteRoleMenusByRoleId(roleIds);
        this.userRoleService.deleteUserRolesByRoleId(roleIds);

    }

    @Override
    public RoleWithMenu findRoleWithMenus(Long roleId) {
        List<RoleWithMenu> list = roleMapper.findById(roleId);
        List<Long> menuList = list.stream().map(RoleWithMenu::getMenuId).collect(Collectors.toList());
        if (list.isEmpty())
            return null;
        RoleWithMenu roleWithMenu = list.get(0);
        roleWithMenu.setMenuIds(menuList);
        return roleWithMenu;
    }

    @Override
    @Transactional
    public void updateRole(Role role, Long[] menuIds) {
        role.setModifyTime(new Date());
        TRole tRole = new TRole();
        BeanUtils.copyProperties(role,tRole);
        roleMapper.updateByPrimaryKeySelective(tRole);
        TRoleMenuExample tRoleMenuExample = new TRoleMenuExample();
        tRoleMenuExample.createCriteria().andRoleIdEqualTo( role.getRoleId());
        this.roleMenuMapper.deleteByExample(tRoleMenuExample);
        setRoleMenus(role, menuIds);
    }

}
