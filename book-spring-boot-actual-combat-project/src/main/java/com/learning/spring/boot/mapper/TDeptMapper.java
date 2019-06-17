package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TDept;
import com.learning.spring.boot.domain.entity.TDeptExample;

import java.util.List;

/**
 * TDeptMapper继承基类
 */
public interface TDeptMapper extends MyBatisBaseMapper<TDept, Long, TDeptExample> {
    void changeToTop(List<String> idList);
}