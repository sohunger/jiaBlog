package com.huang.base.result;


public class JiaResult {

    // 返回码
    private String code;
    // 返回信息
    private String msg;
    // 返回数据
    private Object data;

    public JiaResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功
     * @return
     */
    public static JiaResult success() {
        return success(null);
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static JiaResult success(Object data) {
        return new JiaResult("200", "成功", data);
    }

    public static JiaResult fail(String code, String msg) {
        return new JiaResult(code, msg, null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
