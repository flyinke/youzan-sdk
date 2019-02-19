package com.youzan.open.sdk.client.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.CaseFormat;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.api.APIFactory;
import com.youzan.open.sdk.client.auth.Auth;
import com.youzan.open.sdk.client.auth.Cipher;
import com.youzan.open.sdk.client.auth.Sign;
import com.youzan.open.sdk.client.auth.Token;
import com.youzan.open.sdk.client.executor.CipherExecutor;
import com.youzan.open.sdk.client.executor.ExecutionContext;
import com.youzan.open.sdk.client.executor.Executor;
import com.youzan.open.sdk.client.executor.SignExecutor;
import com.youzan.open.sdk.client.executor.TokenExecutor;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.model.ErrorResponse;
import com.youzan.open.sdk.model.HttpParams;
import com.youzan.open.sdk.model.Response;
import com.youzan.open.sdk.util.json.JsonUtils;
import com.youzan.open.sdk.util.http.HttpClient;
import com.youzan.open.sdk.util.http.DefaultHttpClient;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class DefaultYZClient implements YZClient {

    private HttpClient httpClient;

    private Auth auth;

    public DefaultYZClient() {
        this.httpClient = new DefaultHttpClient();
    }

    public DefaultYZClient(HttpParams httpParams) {
        this.httpClient = new DefaultHttpClient(httpParams);
    }

    public DefaultYZClient(Auth auth) {
        this();
        this.auth = auth;
    }

    public DefaultYZClient(Auth auth, HttpParams httpParams) {
        this(httpParams);
        this.auth = auth;
    }

    @Override
    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    @Override
    public String execute(API api) {
        Preconditions.checkArgument(auth != null, "Auth can't be null");
        Preconditions.checkArgument(api != null, "API can't be null");

        return execute(auth, api);
    }

    public String execute(Auth auth, API api) {
        Preconditions.checkArgument(auth != null, "Auth can't be null");
        Preconditions.checkArgument(api != null, "API can't be null");

        Executor executor = null;
        switch (auth.getType()) {
            case SIGN:
                if (!(auth instanceof Sign)) {
                    throw new KDTException("Auth type not match, expected sign");
                }
                executor = new SignExecutor(httpClient, (Sign) auth);
                break;
            case TOKEN:
                if (!(auth instanceof Token)) {
                    throw new KDTException("Auth type not match, expected token");
                }
                executor = new TokenExecutor(httpClient, (Token) auth);
                break;
            case CIPHER:
                if (!(auth instanceof Cipher)) {
                    throw new KDTException("Auth type not match, expected cipher");
                }
                executor = new CipherExecutor(httpClient, (Cipher) auth);
                break;
            default:
                throw new KDTException("Unknown auth type");
        }

        ExecutionContext context = new ExecutionContext();
        context.setApi(api);
        context.setUrl(api.getHttpUrl());
        return executor.execute(context, auth.getType());
    }

    @Override
    public <T> T invoke(API api) {
        Preconditions.checkArgument(api != null, "API不能为空");
        Preconditions.checkArgument(api.getAPIParams() != null, "API参数不能为空");

        String result = execute(auth, api);

        Response tempResponse = JsonUtils.toBean(result, Response.class);
        Object o = tempResponse.getResponse();

        if (o instanceof List || o instanceof Boolean || o instanceof String || o instanceof Double || o instanceof Integer || o instanceof Long) {
            Class resultModelClass = api.getResultModelClass();
            Field[] fields = resultModelClass.getDeclaredFields();
            if (fields.length != 1) {
                throw new KDTException("API return parameter number not match");
            }

            String fieldName = convert(fields[0].getName());
            Map<String, Object> map = Maps.newHashMap();
            map.put(fieldName, o);
            tempResponse.setResponse(map);
            result = JsonUtils.toJson(tempResponse);
        } else {
            handleError(result);
        }

        Response<T> response = JsonUtils.toClassBean(result, api.getResultModelClass());
        return response.getResponse();
    }

    @Override
    public String execute(String apiName, String apiVersion, String httpMethod, Map<String, Object> params, Multimap<String, ByteWrapper> fileParams) {
        API api = APIFactory.create(apiName, apiVersion, httpMethod, params, fileParams);
        return execute(api);
    }

    @Override
    public String getVersion() {
        return "2.0.0";
    }

    @Override
    public void close() throws IOException {
        httpClient.close();
    }

    private void handleError(String result) {
        Response response = JsonUtils.toBean(result, new TypeReference<Response<ErrorResponse>>() {
        });
        if (response != null && response.getErrorResponse() != null) {
            ErrorResponse errorResponse = (ErrorResponse) response.getErrorResponse();
            throw new KDTException(errorResponse.toString());
        }
    }

    private String convert(String name) {
        if (name.contains("_")) {
            return name;
        }
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
    }

}
