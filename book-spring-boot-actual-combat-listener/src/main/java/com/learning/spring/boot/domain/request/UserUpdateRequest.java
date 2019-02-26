package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Package: com.learning.spring.boot.domain.request
 * @ClassName: UserUpdateRequest
 * @Author: beibei.huang
 * @Description: 用户更新请求入参
 * @Date: 2019/1/21 14:47
 */
@Setter
@Getter
public class UserUpdateRequest {

    @ApiModelProperty(value = "userId",name = "userId",dataType = "Long",example = "1")
    private Long userId;

    @ApiModelProperty(value = "userName",name = "userName",dataType = "String",example = "Jack")
    private String userName;

    @ApiModelProperty(value = "password",name = "password",dataType = "String",example = "abc1234")
    private String password;

    @ApiModelProperty(value = "sex",name = "sex",dataType = "int",example = "1")
    private Integer sex;

    @ApiModelProperty(value = "email",name = "email",dataType = "String",example = "123@qq.com")
    private String email;

    @ApiModelProperty(value = "address",name = "address",dataType = "String",example = "上海市普陀区")
    private String address;

    @ApiModelProperty(value = "qq",name = "qq",dataType = "String",example = "15452")
    private String qq;

}
