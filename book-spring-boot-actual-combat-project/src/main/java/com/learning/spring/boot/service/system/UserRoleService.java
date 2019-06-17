package com.learning.spring.boot.service.system;

public interface UserRoleService {

	void deleteUserRolesByRoleId(String roleIds);

	void deleteUserRolesByUserId(String userIds);
}
