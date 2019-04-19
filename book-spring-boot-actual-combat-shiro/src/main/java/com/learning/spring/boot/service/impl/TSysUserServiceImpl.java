package com.learning.spring.boot.service.impl;

import com.learning.spring.boot.domain.entity.TSysUser;
import com.learning.spring.boot.domain.entity.TSysUserExample;
import com.learning.spring.boot.domain.request.UserBean;
import com.learning.spring.boot.mapper.TSysUserMapper;
import com.learning.spring.boot.service.TSysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.learning.spring.boot.service.impl
 * @ClassName: TSysUserServiceImpl
 * @Author: beibei.huang
 * @Description: 用户相关业务接口实现
 * @Date: 2019/3/20 11:38
 */
@Service
public class TSysUserServiceImpl implements TSysUserService {

    @Autowired
    private TSysUserMapper tSysUserMapper;

    @Override
    public TSysUser findUser(Integer userId) {
        return tSysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<TSysUser> findUserPage(UserBean userBean) {
        TSysUserExample tSysUserExample = new TSysUserExample();
        if (StringUtils.isNotEmpty(userBean.getUsername())){
            tSysUserExample.createCriteria().andUserNameLike(userBean.getUsername());
        }
        return tSysUserMapper.selectByExample(tSysUserExample);
    }
}
