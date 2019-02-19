package com.youzan.open.sdk.model;

public class HttpParams {

    // 分配给同一个route(路由)最大的并发连接数
    private Integer maxRouteCount = 10;

    // 连接池中最大连接数
    private Integer maxConnectionCount = 1000;

    // socket读数据超时时间：从服务器获取响应数据的超时时间
    private Integer socketTimeout = 10000;

    // 与服务器连接超时时间：httpclient会创建一个异步线程用以创建socket连接，此处设置该socket的连接超时时间
    private Integer connectionTimeout = 2000;

    public Integer getMaxRouteCount() {
        return maxRouteCount;
    }

    public void setMaxRouteCount(Integer maxRouteCount) {
        this.maxRouteCount = maxRouteCount;
    }

    public Integer getMaxConnectionCount() {
        return maxConnectionCount;
    }

    public void setMaxConnectionCount(Integer maxConnectionCount) {
        this.maxConnectionCount = maxConnectionCount;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

}
