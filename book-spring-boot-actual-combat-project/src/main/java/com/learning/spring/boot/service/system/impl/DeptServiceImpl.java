package com.learning.spring.boot.service.system.impl;

import com.learning.spring.boot.domain.entity.TDept;
import com.learning.spring.boot.domain.entity.TDeptExample;
import com.learning.spring.boot.domain.response.Dept;
import com.learning.spring.boot.domain.response.Tree;
import com.learning.spring.boot.mapper.TDeptMapper;
import com.learning.spring.boot.service.system.DeptService;
import com.learning.spring.boot.util.TreeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Slf4j
@Service("deptService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DeptServiceImpl implements DeptService {

	@Autowired
	private TDeptMapper deptMapper;

	@Override
	public Tree<Dept> getDeptTree() {
		List<Tree<Dept>> trees = new ArrayList<>();
		List<TDept> depts = findAllDepts(new Dept());
		depts.forEach(dept -> {
			Tree<Dept> tree = new Tree<>();
			tree.setId(dept.getDeptId().toString());
			tree.setParentId(dept.getParentId().toString());
			tree.setText(dept.getDeptName());
			trees.add(tree);
		});
		return TreeUtils.build(trees);
	}

	@Override
	public List<TDept> findAllDepts(Dept dept) {
		TDeptExample dictExample = new TDeptExample();
		TDeptExample.Criteria criteria = dictExample.createCriteria();
		if (StringUtils.isNotBlank(dept.getDeptName())) {
			criteria.andDeptNameEqualTo(dept.getDeptName());
		}
		dictExample.setOrderByClause("dept_id");
		return deptMapper.selectByExample(dictExample);
	}

	@Override
	public TDept findByName(String deptName) {
		TDeptExample dictExample = new TDeptExample();
		dictExample.createCriteria().andDeptNameLike(deptName);
		List<TDept> list = deptMapper.selectByExample(dictExample);
		return CollectionUtils.isEmpty(list) ? null : list.get(0);
	}

	@Override
	@Transactional
	public void addDept(Dept dept) {
		Long parentId = dept.getParentId();
		if (parentId == null)
			dept.setParentId(0L);
		dept.setCreateTime(new Date());
		TDept tDept = new TDept();
		BeanUtils.copyProperties(dept,tDept);
		deptMapper.insertSelective(tDept);
	}

	@Override
	@Transactional
	public void deleteDepts(String deptIds) {
		List<String> idList = Arrays.asList(deptIds.split(","));
		for (String id : idList){
			deptMapper.deleteByPrimaryKey(Long.valueOf(id));
		}
		this.deptMapper.changeToTop(idList);
	}

	@Override
	public TDept findById(Long deptId) {
		return deptMapper.selectByPrimaryKey(deptId);
	}

	@Override
	@Transactional
	public void updateDept(Dept dept) {
		TDept tDept = new TDept();
		BeanUtils.copyProperties(dept,tDept);
		deptMapper.updateByPrimaryKeySelective(tDept);
	}

}
