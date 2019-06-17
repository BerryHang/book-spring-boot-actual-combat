package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TRole;
import com.learning.spring.boot.domain.entity.TRoleExample;
import com.learning.spring.boot.domain.response.Role;
import com.learning.spring.boot.domain.response.RoleWithMenu;

import java.util.List;

/**
 * TRoleMapper继承基类
 */
public interface TRoleMapper extends MyBatisBaseMapper<TRole, Long, TRoleExample> {
    List<Role> findUserRole(String userName);

    List<RoleWithMenu> findById(Long roleId);
}