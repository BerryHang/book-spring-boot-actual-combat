package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Dict implements Serializable{

	private static final long serialVersionUID = 7780820231535870010L;

	private Long dictId;

	private String keyy;

	private String valuee;

	private String tableName;

	private String fieldName;

}