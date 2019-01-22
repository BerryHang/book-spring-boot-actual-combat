package com.learning.spring.boot.domain.response;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 返回作者信息类
 * @Date: 2018/12/28 17:52
 */
@Component
@ConfigurationProperties(prefix="author")
public class User {
    private String name;

    private Integer age;

    private String info;

    private List<String> hobby;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getInfo() {
        return info;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "AuthorInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                ", hobby=" + hobby +
                '}';
    }
}
