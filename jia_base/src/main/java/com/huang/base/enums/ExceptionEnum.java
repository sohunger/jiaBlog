package com.huang.base.enums;

import com.huang.base.exception.BaseExceptionInfo;

/**
 * 异常枚举类
 */
public enum ExceptionEnum implements BaseExceptionInfo {
    ex1("100", "")
    ;

    ExceptionEnum(String resultCode, String resultMsg) {
        this.errCode = resultCode;
        this.errMsg = resultMsg;
    }
    // 错误码
    private final String errCode;
    // 错误信息
    private final String errMsg;


    @Override
    public String getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }
}
