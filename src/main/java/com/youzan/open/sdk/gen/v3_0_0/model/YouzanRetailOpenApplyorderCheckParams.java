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

public class YouzanRetailOpenApplyorderCheckParams implements APIParams, FileParams  {

    /**
     * 要货申请单号
     */
    private String applyOrderNo;
    /**
     * 调出仓仓库编码
     */
    private String fromWarehouseCode;
    /**
     * 要货商品明细
     */
    private String items;
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

    public void setFromWarehouseCode(String fromWarehouseCode) {
        this.fromWarehouseCode = fromWarehouseCode;
    }

    public String getFromWarehouseCode() {
        return this.fromWarehouseCode;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return this.items;
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
        if (fromWarehouseCode != null) {
            params.put("from_warehouse_code", fromWarehouseCode);
        }
        if (items != null) {
            params.put("items", items);
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