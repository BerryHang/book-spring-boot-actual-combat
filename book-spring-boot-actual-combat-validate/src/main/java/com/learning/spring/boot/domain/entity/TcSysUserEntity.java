package com.learning.spring.boot.domain.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Package: com.learning.spring.boot.domain.entity
 * @ClassName: TcSysUserEntity
 * @Author: beibei.huang
 * @Description: 用户实体 与数据库对应
 * @Date: 2019/1/30 15:32
 */
@Setter
@Getter
public class TcSysUserEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 性别
     */
    private Integer sex;

}
