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

public class YouzanRetailStockStockinCreateParams implements APIParams, FileParams  {

    /**
     * 采购入库时间
     */
    private String businessTime;
    /**
     * 幂等单号（请求唯一标示）
     */
    private String idempotentNo;
    /**
     * 入库备注
     */
    private String remark;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 入库明细
     */
    private String stockInOrderItems;
    /**
     * 供应商id
     */
    private Long vendorId;
    /**
     * 供应商名称
     */
    private String vendorName;
    /**
     * 门店或独立仓id   注意：连锁版必填
     */
    private Long warehouseId;

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public String getBusinessTime() {
        return this.businessTime;
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

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStockInOrderItems(String stockInOrderItems) {
        this.stockInOrderItems = stockInOrderItems;
    }

    public String getStockInOrderItems() {
        return this.stockInOrderItems;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (businessTime != null) {
            params.put("business_time", businessTime);
        }
        if (idempotentNo != null) {
            params.put("idempotent_no", idempotentNo);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (stockInOrderItems != null) {
            params.put("stock_in_order_items", stockInOrderItems);
        }
        if (vendorId != null) {
            params.put("vendor_id", vendorId);
        }
        if (vendorName != null) {
            params.put("vendor_name", vendorName);
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