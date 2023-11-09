package com.huang.base.annotation;

import com.huang.base.constant.Message;

import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
public @interface NotBlank {

    boolean required() default true;
    // 内容
    String value() default "";
    // 错误是返回信息
    String message() default Message.CK_NOT_BLANK_MESSAGE;
    // 分组，区分注解生效场景
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
