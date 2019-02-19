package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanRetailProductSellSkuUpdateParams implements APIParams, FileParams  {

    /**
     * 网店商品id
     */
    private Long itemId;
    /**
     * 网店商品规格id
     */
    private Long itemSkuId;
    /**
     * 规格价格，单位：分
（价格最小0.01元，最大值9999999元）
     */
    private Long price;
    /**
     * 请求来源（用于标识请求来源）
     */
    private String retailSource;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemSkuId(Long itemSkuId) {
        this.itemSkuId = itemSkuId;
    }

    public Long getItemSkuId() {
        return this.itemSkuId;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (itemSkuId != null) {
            params.put("item_sku_id", itemSkuId);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}