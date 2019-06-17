package com.learning.spring.boot.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * t_user_role
 * @author 
 */
@Setter
@Getter
public class TUserRole implements Serializable {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;

}