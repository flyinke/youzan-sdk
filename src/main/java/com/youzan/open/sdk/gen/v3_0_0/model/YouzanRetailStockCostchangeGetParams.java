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

public class YouzanRetailStockCostchangeGetParams implements APIParams, FileParams  {

    /**
     * 调价单单号
     */
    private String businessOrderNo;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String retailSource;
    /**
     * 是否显示明细
     */
    private Boolean showItem;
    /**
     * 门店或独立仓id   注意：连锁版必填
     */
    private Long warehouseId;

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessOrderNo() {
        return this.businessOrderNo;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setShowItem(Boolean showItem) {
        this.showItem = showItem;
    }

    public Boolean getShowItem() {
        return this.showItem;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (businessOrderNo != null) {
            params.put("business_order_no", businessOrderNo);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (showItem != null) {
            params.put("show_item", showItem);
        }
        if (warehouseId != null) {
            params.put("warehouse_id", warehouseId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}