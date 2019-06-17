package com.learning.spring.boot.service.system.impl;

import com.learning.spring.boot.domain.entity.TUserRole;
import com.learning.spring.boot.mapper.TUserRoleMapper;
import com.learning.spring.boot.service.system.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service("userRoleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private TUserRoleMapper userRoleMapper;

	@Override
	@Transactional
	public void deleteUserRolesByRoleId(String roleIds) {
		String[] ids = roleIds.split(",");
		for (String id : ids){
            TUserRole tUserRole = new TUserRole();
            tUserRole.setRoleId(Long.valueOf(id));
            userRoleMapper.deleteByPrimaryKey(tUserRole);
		}
	}

	@Override
	@Transactional
	public void deleteUserRolesByUserId(String userIds) {
		List<String> list = Arrays.asList(userIds.split(","));
        for (String id : list){
            TUserRole tUserRole = new TUserRole();
            tUserRole.setUserId(Long.valueOf(id));
            userRoleMapper.deleteByPrimaryKey(tUserRole);
        }
	}

}
