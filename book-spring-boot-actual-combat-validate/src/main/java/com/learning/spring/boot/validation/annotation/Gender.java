package com.learning.spring.boot.validation.annotation;

/**
 * @Package: com.learning.spring.boot.validation.annotation
 * @ClassName: Gender
 * @Author: beibei.huang
 * @Description: 性别自定义校验
 * @Date: 2019/2/14 10:15
 */

import com.learning.spring.boot.validation.validator.GenderValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = GenderValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Gender {

    String message() default "性别参数非法";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
