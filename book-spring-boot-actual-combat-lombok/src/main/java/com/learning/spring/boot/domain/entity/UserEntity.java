package com.learning.spring.boot.domain.entity;

import lombok.*;

/**
 * @Package: com.learning.spring.boot.domain.entity
 * @ClassName: UserEntity
 * @Author: beibei.huang
 * @Description: 用户实体
 * @Date: 2019/1/21 10:58
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    private Integer userId;

    private String userName;

    private String password;

    private Integer age;
}
