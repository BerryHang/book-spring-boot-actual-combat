package com.learning.spring.boot.service.system.impl;

import com.learning.spring.boot.domain.entity.TRoleMenuExample;
import com.learning.spring.boot.mapper.TRoleMenuMapper;
import com.learning.spring.boot.service.system.RoleMenuServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("roleMenuService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RoleMenuServiceImpl implements RoleMenuServie {

    @Autowired
    private TRoleMenuMapper roleMenuMapper;

	@Override
	@Transactional
	public void deleteRoleMenusByRoleId(String roleIds) {
        String[] roleIdList = roleIds.split(",");
        for (String id : roleIdList){
            TRoleMenuExample tRoleMenuExample = new TRoleMenuExample();
            tRoleMenuExample.createCriteria().andRoleIdEqualTo(Long.valueOf(id));
            roleMenuMapper.deleteByExample(tRoleMenuExample);
        }

	}

	@Override
	@Transactional
	public void deleteRoleMenusByMenuId(String menuIds) {
        String[] menuIdList = menuIds.split(",");
        for (String id : menuIdList){
            TRoleMenuExample tRoleMenuExample = new TRoleMenuExample();
            tRoleMenuExample.createCriteria().andMenuIdEqualTo(Long.valueOf(id));
            roleMenuMapper.deleteByExample(tRoleMenuExample);
        }
	}

}
