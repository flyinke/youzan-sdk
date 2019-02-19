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

public class YouzanRetailProductSkuGetParams implements APIParams, FileParams  {

    /**
     * 商品 skuId
     */
    private String skuId;
    /**
     * 商品编码
     */
    private String skuNo;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public String getSkuNo() {
        return this.skuNo;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (skuNo != null) {
            params.put("sku_no", skuNo);
        }
        if (source != null) {
            params.put("source", source);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}