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

public class YouzanMultistoreGoodsSingleskuUpdateParams implements APIParams, FileParams  {

    /**
     * 商品编码
     */
    private String code;
    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 网点id
     */
    private Long offlineId;
    /**
     * 商品价格 单位：元
     */
    private Float price;
    /**
     * 商品无sku的时候，这个值不填
商品有sku的时候，需要填写sku_id
     */
    private Long skuId;
    /**
     * 库存
     */
    private Long stockNum;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setOfflineId(Long offlineId) {
        this.offlineId = offlineId;
    }

    public Long getOfflineId() {
        return this.offlineId;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public Long getStockNum() {
        return this.stockNum;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (code != null) {
            params.put("code", code);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (offlineId != null) {
            params.put("offline_id", offlineId);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (stockNum != null) {
            params.put("stock_num", stockNum);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}