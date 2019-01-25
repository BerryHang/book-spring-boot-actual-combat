package com.learning.spring.boot.jpa;

import com.learning.spring.boot.domain.entity.TcSysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @Package: com.learning.spring.boot.jpa
 * @ClassName: TcSysUserJPA
 * @Author: beibei.huang
 * @Description: 用户相关数据库操作接口
 * @Date: 2019/1/25 14:50
 */
public interface TcSysUserJPA extends JpaRepository<TcSysUserEntity, Long>, JpaSpecificationExecutor<TcSysUserEntity>, Serializable {
}
