package com.learning.spring.boot.mapper;

import com.learning.spring.boot.domain.entity.TMenu;
import com.learning.spring.boot.domain.entity.TMenuExample;

import java.util.List;

/**
 * TMenuMapper继承基类
 */
public interface TMenuMapper extends MyBatisBaseMapper<TMenu, Long, TMenuExample> {
    List<TMenu> findUserPermissions(String userName);

    List<TMenu> findUserMenus(String userName);

    void changeToTop(List<String> list);
}