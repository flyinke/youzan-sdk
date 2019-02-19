package com.youzan.open.sdk.model;

public class ErrorResponse {

    private String code;
    private String msg;

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

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

}
