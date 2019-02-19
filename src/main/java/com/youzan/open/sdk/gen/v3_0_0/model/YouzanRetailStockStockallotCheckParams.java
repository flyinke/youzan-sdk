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

public class YouzanRetailStockStockallotCheckParams implements APIParams, FileParams  {

    /**
     * 单据号列表
     */
    private String bizBillNos;
    /**
     * 是否通过
     */
    private Boolean isOk;
    /**
     * 驳回理由
     */
    private String refusedReason;
    /**
     * 来源
     */
    private String retailSource;

    public void setBizBillNos(String bizBillNos) {
        this.bizBillNos = bizBillNos;
    }

    public String getBizBillNos() {
        return this.bizBillNos;
    }

    public void setIsOk(Boolean isOk) {
        this.isOk = isOk;
    }

    public Boolean getIsOk() {
        return this.isOk;
    }

    public void setRefusedReason(String refusedReason) {
        this.refusedReason = refusedReason;
    }

    public String getRefusedReason() {
        return this.refusedReason;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizBillNos != null) {
            params.put("biz_bill_nos", bizBillNos);
        }
        if (isOk != null) {
            params.put("is_ok", isOk);
        }
        if (refusedReason != null) {
            params.put("refused_reason", refusedReason);
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