package com.huang.base.constaint;

import cn.hutool.core.util.StrUtil;
import com.huang.base.annotation.NotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringValidator implements ConstraintValidator<NotBlank, String> {
    // 初始化传入注解
    @Override
    public void initialize(NotBlank constraintAnnotation) {

    }
    // 进行注解的逻辑判断
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        // 字符串为空返回false
        if (StrUtil.isBlank(s)) {
            return false;
        }
        return true;
    }
}
