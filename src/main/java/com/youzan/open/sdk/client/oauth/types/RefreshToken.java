package com.youzan.open.sdk.client.oauth.types;

import com.fasterxml.jackson.core.type.TypeReference;
import com.youzan.open.sdk.api.APIFactory;
import com.youzan.open.sdk.client.oauth.OAuthFactory;
import com.youzan.open.sdk.client.oauth.model.OAuthToken;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.util.http.DefaultHttpClient;
import com.youzan.open.sdk.util.http.HttpClient;
import com.youzan.open.sdk.util.json.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

/**
 * @link https://open.youzan.com/docs/guide/3399/3417
 */
public class RefreshToken extends AbstractOAuth {

    private String refreshToken;

    public RefreshToken(String clientId, String clientSecret, String refreshToken) {
        super(clientId, clientSecret);
        this.refreshToken = refreshToken;
        if (StringUtils.isBlank(refreshToken)) {
            throw new KDTException("refresh token不能为空");
        }
    }

    public OAuthToken getToken() {
        HttpClient httpClient = new DefaultHttpClient();
        HttpClient.Params params = HttpClient.Params.custom()
            .add("client_id", clientId)
            .add("client_secret", clientSecret)
            .add("grant_type", "refresh_token")
            .add("refresh_token", refreshToken)
            .setContentType(ContentType.APPLICATION_FORM_URLENCODED).build();
        String resp = httpClient.post(OAuthFactory.SERVICE_HOST + "/oauth/token", params);
        if (StringUtils.isBlank(resp) || !resp.contains("access_token")) {
            throw new KDTException(resp);
        }
        return JsonUtils.toBean(resp, new TypeReference<OAuthToken>() {
        });
    }

}
