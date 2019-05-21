package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Package: com.learning.spring.boot.domain.request
 * @ClassName: UserLoginBean
 * @Author: beibei.huang
 * @Description: 用户登录操作入参实体
 * @Date: 2019/4/2 9:40
 */
@Setter
@Getter
@ToString
public class UserLoginBean {

    @ApiModelProperty(value = "userName",name = "userName",dataType = "String",example = "Jack")
    private String username;

    @ApiModelProperty(value = "password",name = "password",dataType = "String",example = "abc1234")
    private String password;

}
