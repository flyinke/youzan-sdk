package com.youzan.open.sdk.util.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.model.HttpParams;
import com.youzan.open.sdk.util.json.JsonUtils;
import org.apache.commons.codec.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;

public class DefaultHttpClient implements HttpClient {

    private Integer maxRouteCount = 10;

    private Integer maxConnectionCount = 1000;

    private Integer socketTimeout = 10000;

    private Integer connectionTimeout = 2000;

    private CloseableHttpClient client = null;

    public DefaultHttpClient() {
        init();
    }

    public DefaultHttpClient(HttpParams httpParams) {
        this.maxRouteCount = httpParams.getMaxRouteCount();
        this.maxConnectionCount = httpParams.getConnectionTimeout();
        this.socketTimeout = httpParams.getSocketTimeout();
        this.connectionTimeout = httpParams.getConnectionTimeout();
        init();
    }

    public void init() {
        SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
        SSLContext sslContext = null;
        try {
            sslContextBuilder.loadTrustMaterial(null, new TrustStrategy() {
                @Override
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            });
            sslContext = sslContextBuilder.build();
        } catch (Exception e) {
            throw new KDTException(e);
        }

        // JRE6不支持TLSV1.2 @see https://blogs.oracle.com/java-platform-group/entry/diagnosing_tls_ssl_and_https
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, new String[]{ "TLSv1" }, null, NoopHostnameVerifier.INSTANCE);

        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", new PlainConnectionSocketFactory())
                .register("https", sslConnectionSocketFactory)
                .build();

        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(registry);

        this.client = HttpClients.custom().
                setMaxConnPerRoute(maxRouteCount).
                setMaxConnTotal(maxConnectionCount).
                setConnectionManager(poolingHttpClientConnectionManager).
                setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(connectionTimeout).setSocketTimeout(socketTimeout).build())
                .build();

    }

    public String get(String uri) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        HttpGet httpGet = new HttpGet(uri);
        try {
            CloseableHttpResponse response = this.client.execute(httpGet);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public String get(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpGet httpGet = getGet(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpGet);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public String post(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpPost httpPost = getPost(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public String put(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpPut httpPut = getPut(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpPut);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public String delete(String uri) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        HttpDelete httpDelete = new HttpDelete(uri);

        try {
            CloseableHttpResponse response = this.client.execute(httpDelete);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public String delete(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpDelete httpDelete = getDelete(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpDelete);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public HttpResponse getWithHttp(String uri) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        HttpGet httpGet = new HttpGet(uri);
        try {
            CloseableHttpResponse response = this.client.execute(httpGet);
            return response;
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public HttpResponse getWithHttp(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpGet httpGet = getGet(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpGet);
            return response;
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public HttpResponse postWithHttp(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpPost httpPost = getPost(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpPost);
            return response;
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public HttpResponse putWithHttp(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpPut httpPut = getPut(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpPut);
            return response;
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public HttpResponse deleteWithHttp(String uri) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        HttpDelete httpDelete = new HttpDelete(uri);

        try {
            CloseableHttpResponse response = this.client.execute(httpDelete);
            return response;
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public HttpResponse deleteWithHttp(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpDelete httpDelete = getDelete(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpDelete);
            return response;
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }

    public <T> T get(String uri, Params params, TypeReference<T> ref) {
        String resp = this.get(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T get(String uri, TypeReference<T> ref) {
        String resp = this.get(uri);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T post(String uri, Params params, TypeReference<T> ref) {
        String resp = this.post(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T put(String uri, Params params, TypeReference<T> ref) {
        String resp = this.put(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T delete(String uri, Params params, TypeReference<T> ref) {
        String resp = this.delete(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T delete(String uri, TypeReference<T> ref) {
        String resp = this.delete(uri);
        return JsonUtils.toBean(resp, ref);
    }

    private HttpGet getGet(String uri, Params params) {
        HttpGet httpGet = new HttpGet(uri);
        for (Header header : params.getHeaders()) {
            httpGet.setHeader(header);
        }
        String query = URI.create(uri).getQuery();
        List<NameValuePair> pairs = Lists.newArrayList();
        if (query != null) {
            pairs = URLEncodedUtils.parse(query, Charsets.UTF_8);
        }

        if (pairs.size() == 0) {
            uri += "?";
        } else {
            uri += "&";
        }
        String data = params.toString();
        if (data.length() > 0) {
            uri += data;
        }
        httpGet.setURI(URI.create(uri));
        return httpGet;
    }

    private HttpPost getPost(String uri, Params params) {
        HttpPost httpPost = new HttpPost(uri);
        for (Header header : params.getHeaders()) {
            httpPost.setHeader(header);
        }
        if (params.getContentType() == null || (
                params.getContentType() != null && params.getContentType().equals(ContentType.DEFAULT_TEXT)
                )) {
            params.setContentType(ContentType.create("application/x-www-form-urlencoded", Charsets.UTF_8));
        }
        httpPost.setEntity(params.toEntity());

        return httpPost;
    }

    private HttpPut getPut(String uri, Params params) {
        HttpPut httpPut = new HttpPut(uri);
        for (Header header : params.getHeaders()) {
            httpPut.setHeader(header);
        }
        if (params.getContentType() == null || (
                params.getContentType() != null && params.getContentType().equals(ContentType.DEFAULT_TEXT)
        )) {
            params.setContentType(ContentType.create("application/x-www-form-urlencoded", Charsets.UTF_8));
        }
        httpPut.setEntity(params.toEntity());
        return httpPut;
    }

    private HttpDelete getDelete(String uri, Params params) {
        HttpDelete httpDelete = new HttpDelete(uri);
        for (Header header : params.getHeaders()) {
            httpDelete.setHeader(header);
        }
        String query = URI.create(uri).getQuery();
        List<NameValuePair> pairs = Lists.newArrayList();
        if (query != null) {
            pairs = URLEncodedUtils.parse(query, Charsets.UTF_8);
        }

        if (pairs.size() == 0) {
            uri += "?";
        } else {
            uri += "&";
        }
        String data = params.toString();
        if (data.length() > 0) {
            uri += data;
        }
        httpDelete.setURI(URI.create(uri));
        return httpDelete;
    }

    public void close() {
        try {
            this.client.close();
        } catch (IOException e) {
            throw new KDTException(e);
        }
    }
}
