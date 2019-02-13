package com.learning.spring.boot.jpa;

import com.learning.spring.boot.domain.entity.TcSysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author beibei.huang
 * @Title: TcSysUserJPA
 * @ProjectName spring-boot-learning
 * @Description: 系统用户的JPA
 * @date 2018/10/26    10:53
 */
public interface TcSysUserJPA extends JpaRepository<TcSysUserEntity, Long> , JpaSpecificationExecutor<TcSysUserEntity> , Serializable {
}
