package com.learning.spring.boot.controler;

import com.learning.spring.boot.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
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
  private EmailService emailService;

    @GetMapping("simple")
    public void sendSimpleEmail() {
        emailService.sendSimpleEmail();
    }

    @GetMapping("enclosure")
    public void sendEnclosureEmail() {
        emailService.sendEnclosureEmail();
    }

    @GetMapping("html")
    public void sendHtmlEmail() {
        emailService.sendHtmlEmail();
    }

}
