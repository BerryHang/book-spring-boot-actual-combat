package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class RoleMenu implements Serializable {
	
	private static final long serialVersionUID = -7573904024872252113L;

    private Long roleId;

    private Long menuId;

}