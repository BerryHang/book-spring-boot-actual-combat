package com.learning.spring.boot.validation.validator;

import com.learning.spring.boot.enums.GenderEnum;
import com.learning.spring.boot.validation.annotation.Gender;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Package: com.learning.spring.boot.validation
 * @ClassName: GenderValidator
 * @Author: beibei.huang
 * @Description: 性别枚举类验证
 * @Date: 2019/2/14 10:13
 */
public class GenderValidator implements ConstraintValidator <Gender,Integer>{

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        if (null==value){
            return true;
        }
        return GenderEnum.containsValue(value);
    }
}
