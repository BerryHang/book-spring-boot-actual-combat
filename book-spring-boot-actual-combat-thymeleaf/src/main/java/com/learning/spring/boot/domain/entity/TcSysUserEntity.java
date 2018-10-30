package com.learning.spring.boot.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author beibei.huang
 * @Title: TcSysUserEntity
 * @ProjectName spring-boot-learning
 * @Description: 与数据库表对应给用户实体
 * @date 2018/10/26    10:34
 */
@Entity
@Getter
@Setter
@Table(name = "tc_sys_user")
public class TcSysUserEntity implements Serializable {

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
