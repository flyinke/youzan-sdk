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

public class YouzanRetailStockDeliveryInParams implements APIParams, FileParams  {

    /**
     * 单据号
     */
    private String bizBillNo;
    /**
     * 业务时间
     */
    private String businessTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 来源
     */
    private String retailSource;

    public void setBizBillNo(String bizBillNo) {
        this.bizBillNo = bizBillNo;
    }

    public String getBizBillNo() {
        return this.bizBillNo;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public String getBusinessTime() {
        return this.businessTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizBillNo != null) {
            params.put("biz_bill_no", bizBillNo);
        }
        if (businessTime != null) {
            params.put("business_time", businessTime);
        }
        if (remark != null) {
            params.put("remark", remark);
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