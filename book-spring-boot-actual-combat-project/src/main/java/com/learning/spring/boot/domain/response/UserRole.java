package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class UserRole implements Serializable{
	
	private static final long serialVersionUID = -3166012934498268403L;

	private Long userId;

	private Long roleId;

}