package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.QrtzCronTriggers;
import com.learning.spring.boot.domain.entity.QrtzCronTriggersExample;
import com.learning.spring.boot.domain.entity.QrtzCronTriggersKey;

/**
 * QrtzCronTriggersMapper继承基类
 */
public interface QrtzCronTriggersMapper extends MyBatisBaseMapper<QrtzCronTriggers, QrtzCronTriggersKey, QrtzCronTriggersExample> {
}