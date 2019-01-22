package com.learning.spring.boot.domain.request;

/**
 * @Package: com.learning.spring.boot.domain.request
 * @ClassName: UserUpdateRequest
 * @Author: beibei.huang
 * @Description: 用户更新请求入参
 * @Date: 2019/1/21 14:47
 */
public class UserUpdateRequest {

    private Integer userId;

    private String userName;

    private String password;

    private Integer age;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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
