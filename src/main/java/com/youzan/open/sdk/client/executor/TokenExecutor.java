package com.youzan.open.sdk.client.executor;

import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.client.auth.Token;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.util.http.HttpClient;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

public class TokenExecutor extends AbstractExecutor implements Executor {

    private Token token;

    public TokenExecutor(HttpClient httpClient, Token token) {
        this.token = token;
        this.httpClient = httpClient;
    }

    @Override
    protected void prepare(ExecutionContext context) {
        API api = context.getApi();

        APIParams apiParams = api.getAPIParams();

        Map<String, Object> params = apiParams.toParams();

        Map<String, String> finalParams = transfer(params);

        finalParams.put("access_token", token.getAccessToken());

        context.setParams(finalParams);
        context.setUrl(api.getHttpUrl() + "/oauthentry");
    }

    @Override
    protected String dealWith(HttpResponse httpResponse) {
        try {
            return EntityUtils.toString(httpResponse.getEntity());
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }
}
