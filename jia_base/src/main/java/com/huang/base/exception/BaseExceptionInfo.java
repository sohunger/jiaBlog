package com.huang.base.exception;

/**
 * 基础异常接口
 */
public interface BaseExceptionInfo {

    // 获取错误码
    String getErrCode();
    // 获取错误信息
    String getErrMsg();
}
