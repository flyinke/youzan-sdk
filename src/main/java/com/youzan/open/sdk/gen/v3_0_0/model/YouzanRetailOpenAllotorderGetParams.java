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

public class YouzanRetailOpenAllotorderGetParams implements APIParams, FileParams  {

    /**
     * 调拨单号
     */
    private String allotOrderNo;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;

    public void setAllotOrderNo(String allotOrderNo) {
        this.allotOrderNo = allotOrderNo;
    }

    public String getAllotOrderNo() {
        return this.allotOrderNo;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (allotOrderNo != null) {
            params.put("allot_order_no", allotOrderNo);
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