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

}
