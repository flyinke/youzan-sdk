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

public class YouzanMeiGoodsServingSkuItemCreateResult implements APIResult {

    @JsonProperty(value = "data")
    /**
     * 规格项ID
     */
    private Long data;
    @JsonProperty(value = "msg")
    /**
     * 错误描述信息
     */
    private String msg;

    public void setData(Long data) {
        this.data = data;
    }

    public Long getData() {
        return this.data;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }


}