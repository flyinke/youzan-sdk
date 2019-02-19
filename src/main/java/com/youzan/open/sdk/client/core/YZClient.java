package com.youzan.open.sdk.client.core;

import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.client.auth.Auth;
import com.youzan.open.sdk.model.ByteWrapper;

import java.io.Closeable;
import java.util.Map;

public interface YZClient extends Closeable {

    /**
     * 设置client auth
     * @param auth
     */
    void setAuth(Auth auth);

    /**
     * 调用指定API，返回结果为API#getResultModelClass()指定的类型对象
     * @param api
     * @return
     */
    <T> T invoke(API api);

    /**
     * 执行指定API，返回结果并不做处理
     * 用户根据API文档来具体解析返回值
     * 该接口主要是兼容目前开放平台存在的不规范的接口，无法使用固定的数据模型来表达
     * @param api
     * @return
     */
    String execute(API api);

    /**
     * 非模型化调用API
     * @param apiName api名称，如: youzan.item.create
     * @param apiVersion api版本，如: 3.0.0
     * @param httpMethod 调用该api使用的http方法，如: POST、GET
     * @param params 非文件参数，如果没有，则传null
     * @param fileParams 文件参数，如果没有，则传null
     * @return 返回结果的json字符串
     */
    String execute(String apiName, String apiVersion, String httpMethod, Map<String, Object> params, Multimap<String, ByteWrapper> fileParams);

    /**
     * 获取SDK版本号
     * @return
     */
    String getVersion();
}
