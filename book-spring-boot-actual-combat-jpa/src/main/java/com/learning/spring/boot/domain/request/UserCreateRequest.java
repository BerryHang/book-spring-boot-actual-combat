package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Package: com.learning.spring.boot.domain.request
 * @ClassName: UserCreateRequest
 * @Author: beibei.huang
 * @Description: 创建用户时的入参对象
 * @Date: 2019/1/21 14:21
 */
@Setter
@Getter
public class UserCreateRequest {

    @ApiModelProperty(value = "userName",name = "userName",dataType = "String",example = "Jack")
    private String userName;

    @ApiModelProperty(value = "password",name = "password",dataType = "String",example = "abc1234")
    private String password;

    @ApiModelProperty(value = "age",name = "age",dataType = "int",example = "20")
    private Integer age;

}
