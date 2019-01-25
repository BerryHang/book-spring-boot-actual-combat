package com.learning.spring.boot.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Package: com.learning.spring.boot.domain.entity
 * @ClassName: TcSysUserEntity
 * @Author: beibei.huang
 * @Description: 与用户表对应的实体类
 * @Date: 2019/1/25 15:08
 */
@Entity
@Getter
@Setter
@Table(name = "tc_sys_user")
public class TcSysUserEntity {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "address")
    private String address;

    @Column(name = "qq")
    private String qq;

    @Column(name = "sex")
    private Byte sex;

}
