package com.learning.spring.boot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @Package: com.learning.spring.boot.configuration
 * @ClassName: EmailConfig
 * @Author: beibei.huang
 * @Description: 邮箱配置类
 * @Date: 2019/4/26 10:43
 */
@Component
@Configuration
public class EmailConfig {

  @Autowired
  private EmailProperties emailProperties;

  @Bean
  public JavaMailSender javaMailSender(){
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

    mailSender.setHost(emailProperties.getHost());
    mailSender.setPort(Integer.valueOf(emailProperties.getPort()));
    mailSender.setUsername(emailProperties.getUsername());
    mailSender.setPassword(emailProperties.getPassword());

    Properties javaMailProperties = new Properties();
    javaMailProperties.put("mail.smtp.starttls.enable", "true");
    javaMailProperties.put("mail.smtp.auth", "true");
    javaMailProperties.put("mail.transport.protocol", "smtp");
    javaMailProperties.put("mail.debug", "true");

    mailSender.setJavaMailProperties(javaMailProperties);
    return mailSender;
  }

}
