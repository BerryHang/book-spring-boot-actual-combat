package com.learning.spring.boot.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: EmailProperties
 * @Author: beibei.huang
 * @Description: 邮箱相关配置属性
 * @Date: 2019/5/24 9:13
 */
@Component
@Setter
@Getter
@ConfigurationProperties(prefix = "spring.mail.from")
public class EmailProperties {

  private String host;

  private String port;

  private String username;

  private String password;

}
