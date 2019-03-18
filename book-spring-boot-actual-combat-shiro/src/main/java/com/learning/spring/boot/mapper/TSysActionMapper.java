package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysAction;
import com.learning.spring.boot.domain.entity.TSysActionExample;
import org.springframework.stereotype.Repository;

/**
 * TSysActionMapper继承基类
 */
@Repository
public interface TSysActionMapper extends BaseMapper<TSysAction, Integer, TSysActionExample> {
}