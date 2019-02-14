package com.learning.spring.boot.domain.entity;

import lombok.*;
import lombok.experimental.FieldNameConstants;

/**
 * @Package: com.learning.spring.boot.domain.entity
 * @ClassName: UserEntity
 * @Author: beibei.huang
 * @Description: 用户实体
 * @Date: 2019/1/21 10:58
 */
@Builder
public class UserEntity {

    private Integer userId;

    private String userName;

    private String password;

    private Integer age;

    private boolean gender;
}





