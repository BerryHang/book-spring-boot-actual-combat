package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

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

    @ApiModelProperty(value = "userName",name = "用户名",dataType = "String",example = "Jack")
    @NotBlank
    private String userName;

    @ApiModelProperty(value = "password",name = "密码",dataType = "String",example = "Abcd12345")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$")
    @NotEmpty
    private String password;

}
