package com.youzan.open.sdk.client.executor;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.AuthType;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.util.http.HttpClient;
import com.youzan.open.sdk.util.misc.TimeUtil;

import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public abstract class AbstractExecutor implements Executor {

    protected HttpClient httpClient;

    protected abstract void prepare(ExecutionContext context);
    protected abstract String dealWith(HttpResponse httpResponse);

    @Override
    public String execute(ExecutionContext context, AuthType authType) {
        prepare(context);
        if(authType.isNeedHttpRep()) {
            HttpResponse httpResponse = doExecuteInternalWithHeader(context);
            return dealWith(httpResponse);
        }
        String result = doExecuteInternal(context);
        return result;
    }

    protected HttpResponse doExecuteInternalWithHeader(ExecutionContext context) {
        Preconditions.checkArgument(httpClient != null, "Http client can't be null");
        API api = context.getApi();
        String method = api.getHttpMethod();

        String url = buildUrl(context);
        HttpClient.Params params = buildParams(context);

        if ("GET".equalsIgnoreCase(method)) {
            return httpClient.getWithHttp(url, params);
        } else if ("POST".equalsIgnoreCase(method)) {
            return httpClient.postWithHttp(url, params);
        } else if ("PUT".equalsIgnoreCase(method)) {
            return httpClient.putWithHttp(url, params);
        } else if ("DELETE".equalsIgnoreCase(method)) {
            return httpClient.deleteWithHttp(url, params);
        }
        throw new KDTException("Unknown http method, known(GET, POST, PUT, DELETE)");
    }

    protected String doExecuteInternal(ExecutionContext context) {
        Preconditions.checkArgument(httpClient != null, "Http client can't be null");
        API api = context.getApi();
        String method = api.getHttpMethod();

        String url = buildUrl(context);
        HttpClient.Params params = buildParams(context);

        if ("GET".equalsIgnoreCase(method)) {
            return httpClient.get(url, params);
        } else if ("POST".equalsIgnoreCase(method)) {
            return httpClient.post(url, params);
        } else if ("PUT".equalsIgnoreCase(method)) {
            return httpClient.put(url, params);
        } else if ("DELETE".equalsIgnoreCase(method)) {
            return httpClient.delete(url, params);
        }
        throw new KDTException("Unknown http method, known(GET, POST, PUT, DELETE)");
    }

    private String buildUrl(ExecutionContext context) {
        API api = context.getApi();

        String apiName = api.getName();
        String service = apiName.substring(0, apiName.lastIndexOf("."));
        String action = apiName.substring(apiName.lastIndexOf(".") + 1, apiName.length());
        String version = api.getVersion();

        String url = String.format("%s/%s/%s/%s", context.getUrl(), service, version, action);

        return url;
    }

    private HttpClient.Params buildParams(ExecutionContext context) {
        API api = context.getApi();
        // 处理普通数据
        HttpClient.Params.Builder builder = new HttpClient.Params.Builder();
        Map<String, String> plainParams = context.getParams();
        for (String key : plainParams.keySet()) {
            Object value = plainParams.get(key);
            builder.add(key, value.toString());
        }

        // 处理文件数据
        APIParams apiParams = api.getAPIParams();
        if (apiParams != null) {
            if (apiParams instanceof FileParams) {
                Multimap<String, ByteWrapper> fileItemMultimap = ((FileParams) apiParams).toFileParams();
                context.setFileParams(fileItemMultimap);
            }
        }

        Multimap<String, ByteWrapper> val = context.getFileParams();
        if (val != null) {
            Map<String, Collection<ByteWrapper>> fileParams = val.asMap();
            for (String key : fileParams.keySet()) {
                Collection<ByteWrapper> byteWrappers = fileParams.get(key);
                for (ByteWrapper byteWrapper : byteWrappers) {
                    builder.add(key, byteWrapper.getData());
                }
            }
        }
        if (api.getHeaders() != null && api.getHeaders().size() > 0) {
            Map<String, String> headers = api.getHeaders();
            for (String key : headers.keySet()) {
                builder.header(key, headers.get(key));
            }
        }

        builder.header("User-Agent", "X-YZ-Client 2.0.0 - Java");
        HttpClient.Params params = builder.build();
        if (api.hasFiles() && val != null && val.size() > 0) {
            params.setContentType(ContentType.MULTIPART_FORM_DATA);
        }

        return params;
    }

    protected Map<String, String> transfer( Map<String, Object> params) {
        Map<String, String> finalParams = Maps.newHashMap();

        for (String key : params.keySet()) {
            Object value = params.get(key);
            String newValue = value.toString();
            if (value instanceof Date) {
                Date tmp = (Date)value;
                newValue = TimeUtil.formatTime(tmp);
            }
            finalParams.put(key, newValue);
        }
        return finalParams;
    }

}
