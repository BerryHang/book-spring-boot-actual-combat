package com.learning.spring.boot.configuration;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: ShiroConfiguration
 * @Author: beibei.huang
 * @Description: shiro配置
 * @Date: 2019/3/21 10:37
 */
@Configuration
public class ShiroConfiguration {

    // 1、创建ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);

        // 设置登录跳转页面
        shiroFilterFactoryBean.setLoginUrl("/login");

        /**
         * Shiro内置过滤器：实现权限相关的拦截
         *      常用过滤器：
         *          anon（认证用）：无需认证（登录）即可访问
         *          authc（认证用）：必须认证才可访问
         *          user（少用）：使用rememberMe功能可以访问
         *          perms（授权用）：必须得到资源权限才可访问
         *          role（授权用）：必须得到角色权限才可访问
         */
        Map<String, String> filterMap = new LinkedHashMap<>();

        // 放行登录请求
        filterMap.put("/login", "anon");

        // 配置退出过滤器，退出代码Shiro已经实现
        filterMap.put("/logout", "logout");

        // 配置授权过滤器

        // 过滤链定义，从上向下顺序执行，一般将/*放在最下边
        filterMap.put("/*", "authc");

        // 设置未授权界面
        shiroFilterFactoryBean.setUnauthorizedUrl("/error/401");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

        return shiroFilterFactoryBean;
    }

    // 2、创建DefaultWebSecurityManager
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("shiroRealm") ShiroRealm shiroRealm) {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();

        // 关联Realm
        defaultWebSecurityManager.setRealm(shiroRealm);

        return defaultWebSecurityManager;
    }

    // 3、创建Realm
    @Bean(name = "shiroRealm")
    public ShiroRealm getRealm() {
        return new ShiroRealm();
    }

    // 4、配置ShiroDialect后，可以在页面使用Shiro标签
    @Bean(name = "shiroDialect")
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }
}
