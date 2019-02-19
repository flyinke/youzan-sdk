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

public class YouzanMultistoreGoodsDeliveryGetResult implements APIResult {

    @JsonProperty(value = "express")
    /**
     * 是否支持快递
     */
    private Long express;
    @JsonProperty(value = "local_delivery")
    /**
     * 是否支持同城配送
     */
    private Long localDelivery;
    @JsonProperty(value = "self_fetch")
    /**
     * 是否支持到店自提
     */
    private Long selfFetch;

    public void setExpress(Long express) {
        this.express = express;
    }

    public Long getExpress() {
        return this.express;
    }
    public void setLocalDelivery(Long localDelivery) {
        this.localDelivery = localDelivery;
    }

    public Long getLocalDelivery() {
        return this.localDelivery;
    }
    public void setSelfFetch(Long selfFetch) {
        this.selfFetch = selfFetch;
    }

    public Long getSelfFetch() {
        return this.selfFetch;
    }


}