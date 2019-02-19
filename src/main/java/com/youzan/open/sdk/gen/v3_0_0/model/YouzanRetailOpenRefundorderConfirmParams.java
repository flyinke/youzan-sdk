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

public class YouzanRetailOpenRefundorderConfirmParams implements APIParams, FileParams  {

    /**
     * 退款单号
     */
    private String refundOrderNo;
    /**
     * 零售调用来源（调用方和有赞约定的值）
     */
    private String retailSource;
    /**
     * 退款单版本
     */
    private Long version;

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getRefundOrderNo() {
        return this.refundOrderNo;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (refundOrderNo != null) {
            params.put("refund_order_no", refundOrderNo);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (version != null) {
            params.put("version", version);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}