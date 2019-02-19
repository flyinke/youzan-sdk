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

public class YouzanRetailStockStockoutCreateParams implements APIParams, FileParams  {

    /**
     * 出库时间
     */
    private String businessTime;
    /**
     * 幂等单号（请求唯一标识）
     */
    private String idempotentNo;
    /**
     * 入库备注
     */
    private String remark;
    /**
     * 来源
     */
    private String source;
    /**
     * 出库单明细
     */
    private String stockOutOrderItems;
    /**
     * 出库单类型（  OTHER_OUT_LOSS(43, "其他出库-报损"),
  OTHER_OUT_USE(44, "其他出库-领用"),
  OTHER_OUT_OTHER(49, "其他出库-其他"),）
     */
    private Long stockOutType;
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

    public void setStockOutOrderItems(String stockOutOrderItems) {
        this.stockOutOrderItems = stockOutOrderItems;
    }

    public String getStockOutOrderItems() {
        return this.stockOutOrderItems;
    }

    public void setStockOutType(Long stockOutType) {
        this.stockOutType = stockOutType;
    }

    public Long getStockOutType() {
        return this.stockOutType;
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
        if (stockOutOrderItems != null) {
            params.put("stock_out_order_items", stockOutOrderItems);
        }
        if (stockOutType != null) {
            params.put("stock_out_type", stockOutType);
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