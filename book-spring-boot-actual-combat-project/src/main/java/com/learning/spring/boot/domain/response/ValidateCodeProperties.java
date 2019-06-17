package com.learning.spring.boot.domain.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ValidateCodeProperties {

    // 验证码图片宽度
    private int width = 146;
    // 验证码图片高度
    private int height = 33;
    // 验证码字符位数
    private int length = 4;

}
