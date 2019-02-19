package com.youzan.open.sdk.model;

public enum AuthType {

    SIGN("sign", false),
    TOKEN("token", false),
    CIPHER("cipher", true),
    ;

    private String value;

    private boolean needHttpRep;

    AuthType(String value, boolean needHttpRep) {
        this.value = value;
        this.needHttpRep = needHttpRep;
    }

    public String getValue() {
        return value;
    }

    public boolean isNeedHttpRep() {
        return needHttpRep;
    }
}
