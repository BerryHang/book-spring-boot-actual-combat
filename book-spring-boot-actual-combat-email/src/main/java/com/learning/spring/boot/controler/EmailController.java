package com.learning.spring.boot.controler;

import com.learning.spring.boot.configuration.EmailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.learning.spring.boot.controler
 * @ClassName: EmailController
 * @Author: beibei.huang
 * @Description: 邮件发送控制器
 * @Date: 2019/4/26 9:33
 */
@RestController
@RequestMapping("/email")
public class EmailController {

  @Autowired
  private JavaMailSender javaMailSender;

  @Autowired
  private EmailConfig emailConfig;

  @Value("${spring.mail.from.username}")
  private String mailFrom;

  @Value("${spring.mail.to.username}")
  private String mailTo;

  @GetMapping("simple")
  public void sendEmail(){
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom(mailFrom);
    message.setTo(mailTo);
    message.setSubject("测试邮件发送");
    message.setText("测试纯文本邮件发送，此为文本内容。");
    javaMailSender.send(message);
  }

}
