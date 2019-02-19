package com.youzan.open.sdk.client.oauth;

public class OAuthContext {

    private String clientId;
    private String clientSecret;
    private Long kdtId;
    private String state;
    private String code;
    private String redirectUrl;
    private String refreshToken;

    public OAuthContext() {

    }

    public OAuthContext(String clientId, String clientSecret, Long kdtId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.kdtId = kdtId;
    }

    public OAuthContext(String clientId, String clientSecret, String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }

    public OAuthContext(String clientId, String clientSecret, String redirectUrl, String state, String code) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.state = state;
        this.code = code;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Long getKdtId() {
        return kdtId;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
