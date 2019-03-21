package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 用户信息查询入参对象
 * @date 2018/10/29    19:58
 */
@Setter
@Getter
public class UserBean {

    @ApiModelProperty(value = "userName",name = "用户名",dataType = "String",example = "admin")
    private String userName;

}
