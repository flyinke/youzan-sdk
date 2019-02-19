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

public class YouzanRetailStockCostchangeCreateParams implements APIParams, FileParams  {

    /**
     * 成本调价明细
     */
    private String costChangeOrderItems;
    /**
     * 幂等单号（请求唯一标识）
     */
    private String idempotentNo;
    /**
     * 备注 max=200
     */
    private String remark;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String retailSource;
    /**
     * 门店或独立仓id   注意：连锁版必填
     */
    private Long warehouseId;

    public void setCostChangeOrderItems(String costChangeOrderItems) {
        this.costChangeOrderItems = costChangeOrderItems;
    }

    public String getCostChangeOrderItems() {
        return this.costChangeOrderItems;
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

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (costChangeOrderItems != null) {
            params.put("cost_change_order_items", costChangeOrderItems);
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