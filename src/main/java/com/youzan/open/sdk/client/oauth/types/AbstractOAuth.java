package com.youzan.open.sdk.client.oauth.types;

import com.youzan.open.sdk.client.oauth.OAuth;

public abstract class AbstractOAuth implements OAuth {

    protected String clientId;
    protected String clientSecret;

    public AbstractOAuth(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
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
}
