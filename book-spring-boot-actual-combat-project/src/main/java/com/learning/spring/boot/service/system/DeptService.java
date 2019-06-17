package com.learning.spring.boot.service.system;

import com.learning.spring.boot.domain.entity.TDept;
import com.learning.spring.boot.domain.response.Dept;
import com.learning.spring.boot.domain.response.Tree;

import java.util.List;

public interface DeptService {

	Tree<Dept> getDeptTree();

	List<TDept> findAllDepts(Dept dept);

	TDept findByName(String deptName);

	TDept findById(Long deptId);
	
	void addDept(Dept dept);
	
	void updateDept(Dept dept);

	void deleteDepts(String deptIds);
}
