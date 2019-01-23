package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Package: com.learning.spring.boot.domain.request
 * @ClassName: UserCreateRequest
 * @Author: beibei.huang
 * @Description: 创建用户时的入参对象
 * @Date: 2019/1/21 14:21
 */
public class UserCreateRequest {

    @ApiModelProperty(value = "userName",name = "userName",dataType = "String",example = "Jack")
    private String userName;

    @ApiModelProperty(value = "password",name = "password",dataType = "String",example = "abc1234")
    private String password;

    @ApiModelProperty(value = "age",name = "age",dataType = "int",example = "20")
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
