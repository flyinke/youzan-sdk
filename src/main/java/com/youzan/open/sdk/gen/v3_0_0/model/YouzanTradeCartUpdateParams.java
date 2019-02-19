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

public class YouzanTradeCartUpdateParams implements APIParams, FileParams  {

    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 店铺id
     */
    private Long kdtId;
    /**
     * 会话key,如果没有该值填
     */
    private String nobody;
    /**
     * 数量
     */
    private Long num;
    /**
     * 商品sku id
     */
    private Long skuId;
    /**
     * 门店id,多门店时才会涉及到，不是多门店的情况填0
     */
    private Long storeId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }

    public void setNobody(String nobody) {
        this.nobody = nobody;
    }

    public String getNobody() {
        return this.nobody;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return this.num;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return this.storeId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (nobody != null) {
            params.put("nobody", nobody);
        }
        if (num != null) {
            params.put("num", num);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (storeId != null) {
            params.put("store_id", storeId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}