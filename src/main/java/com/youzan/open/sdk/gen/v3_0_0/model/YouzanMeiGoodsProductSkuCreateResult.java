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

public class YouzanMeiGoodsProductSkuCreateResult implements APIResult {

    @JsonProperty(value = "sku_id")
    /**
     * 规格ID，成功时会返回
     */
    private Long skuId;
    @JsonProperty(value = "msg")
    /**
     * 错误提示信息
     */
    private String msg;

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }


}