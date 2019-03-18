package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysMenu;
import com.learning.spring.boot.domain.entity.TSysMenuExample;
import org.springframework.stereotype.Repository;

/**
 * TSysMenuMapper继承基类
 */
@Repository
public interface TSysMenuMapper extends BaseMapper<TSysMenu, Integer, TSysMenuExample> {
}