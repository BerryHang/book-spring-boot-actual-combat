package com.learning.spring.boot.service.system.impl;

import com.learning.spring.boot.domain.entity.TMenu;
import com.learning.spring.boot.domain.entity.TMenuExample;
import com.learning.spring.boot.domain.response.Menu;
import com.learning.spring.boot.domain.response.Tree;
import com.learning.spring.boot.mapper.TMenuMapper;
import com.learning.spring.boot.service.system.MenuService;
import com.learning.spring.boot.service.system.RoleMenuServie;
import com.learning.spring.boot.util.TreeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.*;

@Slf4j
@Service("menuService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MenuServiceImpl implements MenuService {

    @Autowired
    private TMenuMapper menuMapper;

    @Autowired
    private RoleMenuServie roleMenuService;

    @Autowired
    private WebApplicationContext applicationContext;

    @Override
    public List<TMenu> findUserPermissions(String userName) {
        return menuMapper.findUserPermissions(userName);
    }

    @Override
    public List<TMenu> findUserMenus(String userName) {
        return menuMapper.findUserMenus(userName);
    }

    @Override
    public List<TMenu> findAllMenus(Menu menu) {
        TMenuExample tMenuExample = new TMenuExample();
        TMenuExample.Criteria criteria = tMenuExample.createCriteria();
        if (StringUtils.isNotBlank(menu.getMenuName())) {
            criteria.andMenuNameEqualTo( menu.getMenuName());
        }
        if (StringUtils.isNotBlank(menu.getType())) {
            criteria.andTypeEqualTo( menu.getType());
        }
        tMenuExample.setOrderByClause("menu_id");
        return menuMapper.selectByExample(tMenuExample);

    }

    @Override
    public Tree<TMenu> getMenuButtonTree() {
        List<Tree<TMenu>> trees = new ArrayList<>();
        List<TMenu> menus = this.findAllMenus(new Menu());
        buildTrees(trees, menus);
        return TreeUtils.build(trees);
    }

    @Override
    public Tree<TMenu> getMenuTree() {
        List<Tree<TMenu>> trees = new ArrayList<>();
        TMenuExample tMenuExample = new TMenuExample();
        tMenuExample.createCriteria().andTypeEqualTo("0");
        tMenuExample.setOrderByClause("create_time");
        List<TMenu> menus = menuMapper.selectByExample(tMenuExample);
        buildTrees(trees, menus);
        return TreeUtils.build(trees);
    }

    private void buildTrees(List<Tree<TMenu>> trees, List<TMenu> menus) {
        menus.forEach(menu -> {
            Tree<TMenu> tree = new Tree<>();
            tree.setId(menu.getMenuId().toString());
            tree.setParentId(menu.getParentId().toString());
            tree.setText(menu.getMenuName());
            trees.add(tree);
        });
    }

    @Override
    public Tree<TMenu> getUserMenu(String userName) {
        List<Tree<TMenu>> trees = new ArrayList<>();
        List<TMenu> menus = this.findUserMenus(userName);
        menus.forEach(menu -> {
            Tree<TMenu> tree = new Tree<>();
            tree.setId(menu.getMenuId().toString());
            tree.setParentId(menu.getParentId().toString());
            tree.setText(menu.getMenuName());
            tree.setIcon(menu.getIcon());
            tree.setUrl(menu.getUrl());
            trees.add(tree);
        });
        return TreeUtils.build(trees);
    }

    @Override
    public TMenu findByNameAndType(String menuName, String type) {
        TMenuExample tMenuExample = new TMenuExample();
        tMenuExample.createCriteria().andMenuNameEqualTo(menuName).andTypeEqualTo(type);

        List<TMenu> list = menuMapper.selectByExample(tMenuExample);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    @Transactional
    public void addMenu(Menu menu) {
        menu.setCreateTime(new Date());
        if (menu.getParentId() == null)
            menu.setParentId(0L);
        if (Menu.TYPE_BUTTON.equals(menu.getType())) {
            menu.setUrl(null);
            menu.setIcon(null);
        }
        TMenu tMenu = new TMenu();
        BeanUtils.copyProperties(menu, tMenu);
        menuMapper.insertSelective(tMenu);
    }

    @Override
    @Transactional
    public void deleteMeuns(String menuIds) {
        List<String> list = Arrays.asList(menuIds.split(","));
        for (String id : list) {
            menuMapper.deleteByPrimaryKey(Long.valueOf(id));
        }
        roleMenuService.deleteRoleMenusByMenuId(menuIds);
        menuMapper.changeToTop(list);
    }

    @Override
    public List<Map<String, String>> getAllUrl(String p1) {
        RequestMappingHandlerMapping mapping = applicationContext.getBean(RequestMappingHandlerMapping.class);
        //获取 url与类和方法的对应信息
        Map<RequestMappingInfo, HandlerMethod> map = mapping.getHandlerMethods();
        List<Map<String, String>> urlList = new ArrayList<>();
        for (Map.Entry<RequestMappingInfo, HandlerMethod> entry : map.entrySet()) {
            RequestMappingInfo info = entry.getKey();
            HandlerMethod handlerMethod = map.get(info);
            RequiresPermissions permissions = handlerMethod.getMethodAnnotation(RequiresPermissions.class);
            String perms = "";
            if (null != permissions) {
                perms = StringUtils.join(permissions.value(), ",");
            }
            Set<String> patterns = info.getPatternsCondition().getPatterns();
            for (String url : patterns) {
                Map<String, String> urlMap = new HashMap<>();
                urlMap.put("url", url.replaceFirst("\\/", ""));
                urlMap.put("perms", perms);
                urlList.add(urlMap);
            }
        }
        return urlList;

    }

    @Override
    public TMenu findById(Long menuId) {
        return menuMapper.selectByPrimaryKey(menuId);
    }

    @Override
    @Transactional
    public void updateMenu(Menu menu) {
        menu.setModifyTime(new Date());
        if (menu.getParentId() == null)
            menu.setParentId(0L);
        if (Menu.TYPE_BUTTON.equals(menu.getType())) {
            menu.setUrl(null);
            menu.setIcon(null);
        }
        TMenu tMenu = new TMenu();
        BeanUtils.copyProperties(menu, tMenu);
        menuMapper.updateByPrimaryKeyWithBLOBs(tMenu);
    }

}
