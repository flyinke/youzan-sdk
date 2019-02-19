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

import java.awt.*;
import java.net.URI;


/**
 * @link https://open.youzan.com/docs/guide/3399/3417
 */
public class AuthorizationCode extends AbstractOAuth {

    private String redirectUrl;
    private String state;
    private String code;

    public AuthorizationCode(String clientId, String clientSecret, String redirectUrl, String state) {
        super(clientId, clientSecret);
        this.redirectUrl = redirectUrl;
        this.state = state;
    }

    public AuthorizationCode(String clientId, String clientSecret, String redirectUrl, String state, String code) {
        super(clientId, clientSecret);
        this.redirectUrl = redirectUrl;
        this.state = state;
        this.code = code;
    }

    /**
     * 该方法将跳转到浏览器，code将传入回调地址的queryString上
     * @return
     */
    public void getCode() {
        if (!Desktop.isDesktopSupported()) {
            throw new KDTException("无桌面情况下不支持获取code，请手工获取code，详情参见：https://www.youzanyun.com/docs/guide/common/680");
        }
        try {
            Desktop.getDesktop().browse(new URI(APIFactory.SERVICE_HOST + "/oauth/authorize?client_id=" + clientId + "&response_type=code&state=" + state +"&redirect_uri=" + redirectUrl));
        } catch (Exception e) {
            throw new KDTException(e);
        }
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 根据用户获取的授权code，获取token
     * @return
     */
    public OAuthToken getToken() {
        if (StringUtils.isBlank(code)) {
            throw new KDTException("授权码不能为空，详见https://open.youzan.com/docs/guide/3399/3417");
        }
        HttpClient httpClient = new DefaultHttpClient();
        HttpClient.Params params = HttpClient.Params.custom()
            .add("client_id", clientId)
            .add("client_secret", clientSecret)
            .add("grant_type", "authorization_code")
            .add("code", code)
            .add("redirect_uri", redirectUrl)
            .setContentType(ContentType.APPLICATION_FORM_URLENCODED).build();
        String resp = httpClient.post(OAuthFactory.SERVICE_HOST + "/oauth/token", params);
        if (StringUtils.isBlank(resp) || !resp.contains("access_token")) {
            throw new KDTException(resp);
        }
        return JsonUtils.toBean(resp, new TypeReference<OAuthToken>() {
        });
    }

}
