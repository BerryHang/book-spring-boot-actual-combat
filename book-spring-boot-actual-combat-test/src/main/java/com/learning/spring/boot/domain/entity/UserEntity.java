package com.learning.spring.boot.domain.entity;

/**
 * @Package: com.learning.spring.boot.domain.entity
 * @ClassName: UserEntity
 * @Author: beibei.huang
 * @Description: 用户实体
 * @Date: 2019/1/21 10:58
 */
public class UserEntity {

    private Integer userId;

    private String userName;

    private String password;

    private Integer age;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public UserEntity(Integer userId, String userName, String password, Integer age) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public UserEntity() { }
}
