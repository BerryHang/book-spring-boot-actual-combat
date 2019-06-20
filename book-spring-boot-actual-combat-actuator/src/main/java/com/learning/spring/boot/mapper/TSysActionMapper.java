package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysAction;
import com.learning.spring.boot.domain.entity.TSysActionExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * TSysActionMapper继承基类
 */
@Mapper
public interface TSysActionMapper extends BaseMapper<TSysAction, Integer, TSysActionExample> {
}