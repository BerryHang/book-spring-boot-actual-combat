package com.learning.spring.boot.domain.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package: com.learning.spring.boot.domain.request
 * @ClassName: UserUpdateRequest
 * @Author: beibei.huang
 * @Description: 用户更新请求入参
 * @Date: 2019/1/21 14:47
 */
@Setter
@Getter
public class UserUpdateRequest {

    private Integer userId;

    private String userName;

    private String password;

    private Integer age;

}
