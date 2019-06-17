package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TJob;
import com.learning.spring.boot.domain.entity.TJobExample;
import com.learning.spring.boot.domain.response.Job;

import java.util.List;

/**
 * TJobMapper继承基类
 */
public interface TJobMapper extends MyBatisBaseMapper<TJob, Long, TJobExample> {
    List<Job> queryList();
}