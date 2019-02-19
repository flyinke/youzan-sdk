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

public class YouzanRetailOpenApplyorderGetParams implements APIParams, FileParams  {

    /**
     * 要货单编号
     */
    private String applyOrderNo;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;

    public void setApplyOrderNo(String applyOrderNo) {
        this.applyOrderNo = applyOrderNo;
    }

    public String getApplyOrderNo() {
        return this.applyOrderNo;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (applyOrderNo != null) {
            params.put("apply_order_no", applyOrderNo);
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