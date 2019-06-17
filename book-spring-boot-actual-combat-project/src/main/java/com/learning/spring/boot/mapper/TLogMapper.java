package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TLog;
import com.learning.spring.boot.domain.entity.TLogExample;

/**
 * TLogMapper继承基类
 */
public interface TLogMapper extends MyBatisBaseMapper<TLog, Long, TLogExample> {
}