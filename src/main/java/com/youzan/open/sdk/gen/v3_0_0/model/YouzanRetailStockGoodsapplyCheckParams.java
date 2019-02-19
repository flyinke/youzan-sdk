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

public class YouzanRetailStockGoodsapplyCheckParams implements APIParams, FileParams  {

    /**
     * 单据号
     */
    private String bizBillNos;
    /**
     * 审核明细
     */
    private String businessOrderItems;
    /**
     * 出库仓库
     */
    private Long fromKdtId;
    /**
     * 是否通过
     */
    private Boolean isOk;
    /**
     * 驳回理由
     */
    private String refusedReason;
    /**
     * 系统来源
     */
    private String retailSource;

    public void setBizBillNos(String bizBillNos) {
        this.bizBillNos = bizBillNos;
    }

    public String getBizBillNos() {
        return this.bizBillNos;
    }

    public void setBusinessOrderItems(String businessOrderItems) {
        this.businessOrderItems = businessOrderItems;
    }

    public String getBusinessOrderItems() {
        return this.businessOrderItems;
    }

    public void setFromKdtId(Long fromKdtId) {
        this.fromKdtId = fromKdtId;
    }

    public Long getFromKdtId() {
        return this.fromKdtId;
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
        if (businessOrderItems != null) {
            params.put("business_order_items", businessOrderItems);
        }
        if (fromKdtId != null) {
            params.put("from_kdt_id", fromKdtId);
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