package com.learning.spring.boot.service.system;

import com.learning.spring.boot.domain.entity.TRole;
import com.learning.spring.boot.domain.response.Role;
import com.learning.spring.boot.domain.response.RoleWithMenu;

import java.util.List;

public interface RoleService {

	List<Role> findUserRole(String userName);

	List<TRole> findAllRole(Role role);
	
	RoleWithMenu findRoleWithMenus(Long roleId);

	TRole findByName(String roleName);

	void addRole(Role role, Long[] menuIds);
	
	void updateRole(Role role, Long[] menuIds);

	void deleteRoles(String roleIds);
}
