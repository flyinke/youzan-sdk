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

public class YouzanRetailStockStockallotOutParams implements APIParams, FileParams  {

    /**
     * 单据编号
     */
    private String bizBillNo;
    /**
     * 出库仓库kdtId
     */
    private Long fromKdtId;
    /**
     * 具体来源
     */
    private String retailSource;
    /**
     * 具体出库商品信息
     */
    private String stockAllotOutItems;

    public void setBizBillNo(String bizBillNo) {
        this.bizBillNo = bizBillNo;
    }

    public String getBizBillNo() {
        return this.bizBillNo;
    }

    public void setFromKdtId(Long fromKdtId) {
        this.fromKdtId = fromKdtId;
    }

    public Long getFromKdtId() {
        return this.fromKdtId;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setStockAllotOutItems(String stockAllotOutItems) {
        this.stockAllotOutItems = stockAllotOutItems;
    }

    public String getStockAllotOutItems() {
        return this.stockAllotOutItems;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizBillNo != null) {
            params.put("biz_bill_no", bizBillNo);
        }
        if (fromKdtId != null) {
            params.put("from_kdt_id", fromKdtId);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (stockAllotOutItems != null) {
            params.put("stock_allot_out_items", stockAllotOutItems);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}