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

public class YouzanRetailStockStockallotInParams implements APIParams, FileParams  {

    /**
     * 业务单据编号
     */
    private String bizBillNo;
    /**
     * 来源请求
     */
    private String retailSource;
    /**
     * 选择的入库仓库
     */
    private Long toKdtId;

    public void setBizBillNo(String bizBillNo) {
        this.bizBillNo = bizBillNo;
    }

    public String getBizBillNo() {
        return this.bizBillNo;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setToKdtId(Long toKdtId) {
        this.toKdtId = toKdtId;
    }

    public Long getToKdtId() {
        return this.toKdtId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizBillNo != null) {
            params.put("biz_bill_no", bizBillNo);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (toKdtId != null) {
            params.put("to_kdt_id", toKdtId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}