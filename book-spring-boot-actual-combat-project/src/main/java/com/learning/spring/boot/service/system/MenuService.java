package com.learning.spring.boot.service.system;

import com.learning.spring.boot.domain.entity.TMenu;
import com.learning.spring.boot.domain.response.Menu;
import com.learning.spring.boot.domain.response.Tree;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

@CacheConfig(cacheNames = "MenuService")
public interface MenuService {

    List<TMenu> findUserPermissions(String userName);

    List<TMenu> findUserMenus(String userName);

    List<TMenu> findAllMenus(Menu menu);

    Tree<TMenu> getMenuButtonTree();

    Tree<TMenu> getMenuTree();

    Tree<TMenu> getUserMenu(String userName);

    TMenu findById(Long menuId);

    TMenu findByNameAndType(String menuName, String type);

    void addMenu(Menu menu);

    void updateMenu(Menu menu);

    void deleteMeuns(String menuIds);

    @Cacheable(key = "'url_'+ #p0")
    List<Map<String, String>> getAllUrl(String p1);
}
