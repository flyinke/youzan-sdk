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

public class YouzanRetailProductOfflineCreateResult implements APIResult {

    @JsonProperty(value = "item_id")
    /**
     * 门店商品id
     */
    private Long itemId;
    @JsonProperty(value = "sku_ids")
    /**
     * 门店规格id列表
     */
    private Number[] skuIds;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }
    public void setSkuIds(Number[] skuIds) {
        this.skuIds = skuIds;
    }

    public Number[] getSkuIds() {
        return this.skuIds;
    }


}