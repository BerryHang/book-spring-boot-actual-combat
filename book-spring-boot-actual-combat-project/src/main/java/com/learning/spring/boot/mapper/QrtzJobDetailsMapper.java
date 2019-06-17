package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.QrtzJobDetails;
import com.learning.spring.boot.domain.entity.QrtzJobDetailsExample;
import com.learning.spring.boot.domain.entity.QrtzJobDetailsKey;

/**
 * QrtzJobDetailsMapper继承基类
 */
public interface QrtzJobDetailsMapper extends MyBatisBaseMapper<QrtzJobDetails, QrtzJobDetailsKey, QrtzJobDetailsExample> {
}