package com.learning.spring.boot.service;

import java.util.Set;

/**
 * @Package: com.learning.spring.boot.service
 * @ClassName: CommonService
 * @Author: beibei.huang
 * @Description: 公共功能模块业务接口
 * @Date: 2019/3/21 14:52
 */
public interface CommonService {
    Set<String> getRolesByUserId(Integer userId);

    Set<String> getPermissionsByUserId(Integer userId);
}
