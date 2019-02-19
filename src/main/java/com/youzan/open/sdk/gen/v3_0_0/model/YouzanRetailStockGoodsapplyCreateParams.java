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

public class YouzanRetailStockGoodsapplyCreateParams implements APIParams, FileParams  {

    /**
     * 单据明细
     */
    private String businessOrderItems;
    /**
     * 幂等单号
     */
    private String idempotentNo;
    /**
     * 备注
     */
    private String remark;
    /**
     * 请求来源
     */
    private String retailSource;

    public void setBusinessOrderItems(String businessOrderItems) {
        this.businessOrderItems = businessOrderItems;
    }

    public String getBusinessOrderItems() {
        return this.businessOrderItems;
    }

    public void setIdempotentNo(String idempotentNo) {
        this.idempotentNo = idempotentNo;
    }

    public String getIdempotentNo() {
        return this.idempotentNo;
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
        if (businessOrderItems != null) {
            params.put("business_order_items", businessOrderItems);
        }
        if (idempotentNo != null) {
            params.put("idempotent_no", idempotentNo);
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