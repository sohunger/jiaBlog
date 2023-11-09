package com.huang.base.handler;

import com.huang.base.exception.JiaException;
import com.huang.base.result.JiaResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(JiaException.class)
    public JiaResult jiaExceptionHandler(HttpServletRequest request, JiaException e) {
        return JiaResult.fail(e.getErrorCode(), e.getErrorMsg());
    }
}
