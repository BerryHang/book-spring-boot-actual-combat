package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TSysMenu;
import com.learning.spring.boot.domain.entity.TSysMenuExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * TSysMenuMapper继承基类
 */
@Mapper
public interface TSysMenuMapper extends BaseMapper<TSysMenu, Integer, TSysMenuExample> {
    List<TSysMenu> getMenuPermissionsByIds(Set<Integer> menus);
}