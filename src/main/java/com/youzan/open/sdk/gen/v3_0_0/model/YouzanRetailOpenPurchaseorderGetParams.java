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

public class YouzanRetailOpenPurchaseorderGetParams implements APIParams, FileParams  {

    /**
     * 采购单号
     */
    private String purchaseOrderNo;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;

    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (purchaseOrderNo != null) {
            params.put("purchase_order_no", purchaseOrderNo);
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