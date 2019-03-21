package com.learning.spring.boot.configuration;

import com.learning.spring.boot.domain.entity.*;
import com.learning.spring.boot.mapper.TComUserRoleRelationMapper;
import com.learning.spring.boot.mapper.TSysRoleMapper;
import com.learning.spring.boot.mapper.TSysUserMapper;
import com.learning.spring.boot.service.CommonService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: ShiroRealm
 * @Author: beibei.huang
 * @Description: shiro验证用户权限
 * @Date: 2019/3/21 10:12
 */
@Slf4j
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private CommonService commonService;

    @Autowired
    private TSysUserMapper tSysUserMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("---------------- 执行 Shiro 权限获取 ---------------------");
        Object principal = principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        if (principal instanceof TSysUser) {
            TSysUser userLogin = (TSysUser) principal;
            Set<String> roles = commonService.getRolesByUserId(userLogin.getUserId());
            authorizationInfo.addRoles(roles);
            Set<String> permissions = commonService.getPermissionsByUserId(userLogin.getUserId());
            authorizationInfo.addStringPermissions(permissions);
        }
        log.info("---- 获取到以下权限 ----");
        log.info(authorizationInfo.getStringPermissions().toString());
        log.info("---------------- Shiro 权限获取成功 ----------------------");
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("---------------- 执行 Shiro 凭证认证 ----------------------");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = String.valueOf(token.getPassword());
        TSysUserExample user = new TSysUserExample();
        user.createCriteria().andUserNameEqualTo(username).andPasswordEqualTo(password).andFlagEqualTo(false);

        // 从数据库获取对应用户名密码的用户
        List<TSysUser> tSysUsers = tSysUserMapper.selectByExample(user);
        if (tSysUsers != null) {
            // 用户为禁用状态
            log.info("---------------- Shiro 凭证认证成功 ----------------------");
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    tSysUsers.get(0), //用户
                    tSysUsers.get(0).getPassword(), //密码
                    getName()  //realm name
            );
            return authenticationInfo;
        }
        throw new UnknownAccountException();
    }
}
