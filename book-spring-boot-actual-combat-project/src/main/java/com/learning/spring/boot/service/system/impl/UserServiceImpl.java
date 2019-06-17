package com.learning.spring.boot.service.system.impl;

import com.learning.spring.boot.domain.entity.TUser;
import com.learning.spring.boot.domain.entity.TUserExample;
import com.learning.spring.boot.domain.entity.TUserRole;
import com.learning.spring.boot.domain.entity.TUserRoleExample;
import com.learning.spring.boot.domain.response.QueryRequest;
import com.learning.spring.boot.domain.response.User;
import com.learning.spring.boot.domain.response.UserRole;
import com.learning.spring.boot.domain.response.UserWithRole;
import com.learning.spring.boot.mapper.TUserMapper;
import com.learning.spring.boot.mapper.TUserRoleMapper;
import com.learning.spring.boot.service.system.UserRoleService;
import com.learning.spring.boot.service.system.UserService;
import com.learning.spring.boot.util.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
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
@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private TUserRoleMapper userRoleMapper;

    @Autowired
    private UserRoleService userRoleService;

    @Override
    public TUser findByName(String userName) {
        TUserExample tUserExample = new TUserExample();
        tUserExample.createCriteria().andUsernameEqualTo(userName);
        List<TUser> list = userMapper.selectByExample(tUserExample);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<TUser> findUserWithDept(User user, QueryRequest request) {
        return userMapper.findUserWithDept(user);
    }

    @Override
    @Transactional
    public void registUser(User user) {
        user.setCrateTime(new Date());
        user.setTheme(User.DEFAULT_THEME);
        user.setAvatar(User.DEFAULT_AVATAR);
        user.setSsex(User.SEX_UNKNOW);
        user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
        TUser tUser = new TUser();
        BeanUtils.copyProperties(user,tUser);
        userMapper.insertSelective(tUser);
        UserRole ur = new UserRole();
        ur.setUserId(user.getUserId());
        ur.setRoleId(3L);
        TUserRole tUserRole = new TUserRole();
        BeanUtils.copyProperties(ur,tUserRole);
        userRoleMapper.insert(tUserRole);
    }

    @Override
    @Transactional
    public void updateTheme(String theme, String userName) {
        TUserExample tUserExample = new TUserExample();
        tUserExample.createCriteria().andUsernameEqualTo(userName);
        TUser user = new TUser();
        user.setTheme(theme);
        this.userMapper.updateByExampleSelective(user, tUserExample);
    }

    @Override
    @Transactional
    public void addUser(User user, Long[] roles) {
        user.setCrateTime(new Date());
        user.setTheme(User.DEFAULT_THEME);
        user.setAvatar(User.DEFAULT_AVATAR);
        user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
        TUser tUser = new TUser();
        BeanUtils.copyProperties(user,tUser);
        userMapper.insertSelective(tUser);
        setUserRoles(user, roles);
    }

    private void setUserRoles(User user, Long[] roles) {
        Arrays.stream(roles).forEach(roleId -> {
            TUserRole ur = new TUserRole();
            ur.setUserId(user.getUserId());
            ur.setRoleId(roleId);
            userRoleMapper.insert(ur);
        });
    }

    @Override
    @Transactional
    public void updateUser(User user, Long[] roles) {
        user.setPassword(null);
        user.setUsername(null);
        user.setModifyTime(new Date());
        TUser tUser = new TUser();
        BeanUtils.copyProperties(user,tUser);
        userMapper.updateByPrimaryKeySelective(tUser);
        TUserRoleExample tUserRoleExample = new TUserRoleExample();
        tUserRoleExample.createCriteria().andUserIdEqualTo(user.getUserId());
        userRoleMapper.deleteByExample(tUserRoleExample);
        setUserRoles(user, roles);
    }

    @Override
    @Transactional
    public void deleteUsers(String userIds) {
        List<String> list = Arrays.asList(userIds.split(","));
        for (String userId : list){
            userMapper.deleteByPrimaryKey(Long.valueOf(userId));
        }
        this.userRoleService.deleteUserRolesByUserId(userIds);
    }

    @Override
    @Transactional
    public void updateLoginTime(String userName) {
        TUserExample tUserExample = new TUserExample();
        tUserExample.createCriteria().andUsernameEqualTo(userName);
        TUser user = new TUser();
        user.setLastLoginTime(new Date());
        this.userMapper.updateByExampleSelective(user, tUserExample);
    }

    @Override
    @Transactional
    public void updatePassword(String password) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        TUserExample tUserExample = new TUserExample();
        tUserExample.createCriteria().andUsernameEqualTo(user.getUsername());
        String newPassword = MD5Utils.encrypt(user.getUsername().toLowerCase(), password);
        user.setPassword(newPassword);
        TUser tUser = new TUser();
        BeanUtils.copyProperties(user,tUser);
        this.userMapper.updateByExampleSelective(tUser, tUserExample);
    }

    @Override
    public UserWithRole findById(Long userId) {
        List<UserWithRole> list = userMapper.findUserWithRole(userId);
        List<Long> roleList = list.stream().map(UserWithRole::getRoleId).collect(Collectors.toList());
        if (list.isEmpty())
            return null;
        UserWithRole userWithRole = list.get(0);
        userWithRole.setRoleIds(roleList);
        return userWithRole;
    }

    @Override
    public User findUserProfile(User user) {
        return userMapper.findUserProfile(user);
    }

    @Override
    @Transactional
    public void updateUserProfile(User user) {
        user.setUsername(null);
        user.setPassword(null);
        if (user.getDeptId() == null)
            user.setDeptId(0L);
        TUser tUser = new TUser();
        BeanUtils.copyProperties(user,tUser);
        userMapper.updateByPrimaryKeySelective(tUser);
    }

    @Override
    public void updateUser(User user) {
        TUser tUser = new TUser();
        BeanUtils.copyProperties(user,tUser);
        userMapper.updateByPrimaryKeySelective(tUser);
    }

}
