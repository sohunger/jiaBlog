package com.huang.base.exception;

public class JiaException extends RuntimeException{

    private static final long serialVersionUID = 2863009126168440751L;

    private String errorCode;

    private String errorMsg;

    public JiaException() {
        super();
    }

    public JiaException(BaseExceptionInfo baseExceptionInfo) {
        super(baseExceptionInfo.getErrCode());
        this.errorCode = baseExceptionInfo.getErrCode();
        this.errorMsg = baseExceptionInfo.getErrMsg();
    }

    public JiaException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public JiaException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public JiaException(BaseExceptionInfo baseExceptionInfo, Throwable throwable) {
        super(baseExceptionInfo.getErrCode(), throwable);
        this.errorCode = baseExceptionInfo.getErrCode();
        this.errorMsg = baseExceptionInfo.getErrMsg();
    }

    public JiaException(String errorCode, String errorMsg, Throwable throwable) {
        super(errorCode, throwable);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
