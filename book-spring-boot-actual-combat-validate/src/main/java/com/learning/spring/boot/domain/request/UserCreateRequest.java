package com.learning.spring.boot.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.Date;

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

    @ApiModelProperty(value = "qq",name = "QQ号",dataType = "String",example = "1234")
    private String qq;

    @ApiModelProperty(value = "sex",name = "性别",dataType = "int",example = "1")
    private Integer sex;

    @ApiModelProperty(value = "email",name = "E-mail地址",dataType = "String",example = "123@qq.com")
    @Email
    private String email;

    @ApiModelProperty(value = "address",name = "家庭住址",dataType = "String",example = "上海市普陀区")
    private String address;

    @ApiModelProperty(value = "age",name = "年龄",dataType = "int",example = "20")
    @NotNull
    @Min(0)
    @Max(150)
    private Integer age;

    @ApiModelProperty(value = "salary",name = "薪水",dataType = "double",example = "12545.2")
    private Double salary;

    @ApiModelProperty(value = "birthday",name = "出生日期",dataType = "Date",example = "1900-00-00")
    @Past
    private Date birthday;

}
