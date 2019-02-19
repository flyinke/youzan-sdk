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

public class YouzanRetailProductOnlineCreateResult implements APIResult {

    @JsonProperty(value = "item_id")
    /**
     * 商品id
     */
    private Long itemId;
    @JsonProperty(value = "alias")
    /**
     * 商品别名
     */
    private String alias;
    @JsonProperty(value = "sku_id")
    /**
     * 商品规格id
     */
    private Number[] skuId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return this.alias;
    }
    public void setSkuId(Number[] skuId) {
        this.skuId = skuId;
    }

    public Number[] getSkuId() {
        return this.skuId;
    }


}