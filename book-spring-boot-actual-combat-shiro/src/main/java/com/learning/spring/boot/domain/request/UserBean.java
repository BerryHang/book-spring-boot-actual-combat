package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Package: com.learning.spring.boot.domain.request
 * @ClassName: UserBean
 * @Author: beibei.huang
 * @Description: 用户查询入参对象
 * @Date: 2019/4/19 15:24
 */
@Setter
@Getter
public class UserBean {

    @ApiModelProperty(value = "userName",name = "userName",dataType = "String",example = "Jack")
    private String username;

}
