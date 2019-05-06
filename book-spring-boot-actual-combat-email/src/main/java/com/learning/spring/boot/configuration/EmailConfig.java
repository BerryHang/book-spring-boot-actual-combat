package com.learning.spring.boot.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: EmailConfig
 * @Author: beibei.huang
 * @Description: 邮箱配置类
 * @Date: 2019/4/26 10:43
 */
@Configuration
@Setter
@Getter
public class EmailConfig {

  @Value("spring.mail.from.username")
  private String mailFrom;

  @Value("spring.mail.to.username")
  private String mailTo;

  @Value("spring.mail.from.password")
  private String password;

}
