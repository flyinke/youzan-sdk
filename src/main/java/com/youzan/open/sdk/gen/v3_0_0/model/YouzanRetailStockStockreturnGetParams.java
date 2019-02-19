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

public class YouzanRetailStockStockreturnGetParams implements APIParams, FileParams  {

    /**
     * 入库单单号
     */
    private String businessOrderNo;
    /**
     * 是否显示明细
     */
    private Boolean showItem;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
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

    public void setShowItem(Boolean showItem) {
        this.showItem = showItem;
    }

    public Boolean getShowItem() {
        return this.showItem;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
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
        if (showItem != null) {
            params.put("show_item", showItem);
        }
        if (source != null) {
            params.put("source", source);
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