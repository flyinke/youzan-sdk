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

public class YouzanRetailProductSpuGetParams implements APIParams, FileParams  {

    /**
     * 查询参数
1：库存信息
     */
    private String attributes;
    /**
     * 请求来源
例如：OPEN—XXX
     */
    private String retailSource;
    /**
     * 商品 spuId（与spu_no必须传一个）
     */
    private String spuId;
    /**
     * 商品编码（与spu_id必须传一个）
     */
    private String spuNo;

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAttributes() {
        return this.attributes;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getSpuId() {
        return this.spuId;
    }

    public void setSpuNo(String spuNo) {
        this.spuNo = spuNo;
    }

    public String getSpuNo() {
        return this.spuNo;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (attributes != null) {
            params.put("attributes", attributes);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (spuId != null) {
            params.put("spu_id", spuId);
        }
        if (spuNo != null) {
            params.put("spu_no", spuNo);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}