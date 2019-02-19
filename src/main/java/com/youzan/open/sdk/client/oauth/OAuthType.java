package com.youzan.open.sdk.client.oauth;

public enum OAuthType {

    SELF("自用型"),
    TOOL_TOKEN("工具型-获取token"),
    TOOL_REFRESH_TOKEN("工具型-获取refresh token"),
    PLATFORM("平台型");

    private String value;

    OAuthType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
