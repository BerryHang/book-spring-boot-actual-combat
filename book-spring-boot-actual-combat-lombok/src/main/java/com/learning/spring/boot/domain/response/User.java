package com.learning.spring.boot.domain.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 返回作者信息类
 * @Date: 2018/12/28 17:52
 */
@Component
@ConfigurationProperties(prefix="author")
@Setter
@Getter
@ToString
@Data
public class User {
    private String name;

    private Integer age;

    private String info;

    private List<String> hobby;
}
