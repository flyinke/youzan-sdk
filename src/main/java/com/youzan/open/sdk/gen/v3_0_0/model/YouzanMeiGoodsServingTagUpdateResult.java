package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanMeiGoodsServingTagUpdateResult implements APIResult {

    @JsonProperty(value = "data")
    /**
     * 更新结果  0代表成功 否则失败
     */
    private Long data;
    @JsonProperty(value = "message")
    /**
     * 失败提示信息
     */
    private String message;

    public void setData(Long data) {
        this.data = data;
    }

    public Long getData() {
        return this.data;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }


}