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

public class YouzanRetailStockStockcheckCreateParams implements APIParams, FileParams  {

    /**
     * 盘点时间
     */
    private String businessTime;
    /**
     * 幂等单号（请求唯一标识）
     */
    private String idempotentNo;
    /**
     * 是否完成盘点（默认false）
     */
    private Boolean isFinish;
    /**
     * 操作人名称
     */
    private String operatorName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 盘点明细
     */
    private String stockCheckCreateItems;
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

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Boolean getIsFinish() {
        return this.isFinish;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return this.operatorName;
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

    public void setStockCheckCreateItems(String stockCheckCreateItems) {
        this.stockCheckCreateItems = stockCheckCreateItems;
    }

    public String getStockCheckCreateItems() {
        return this.stockCheckCreateItems;
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
        if (isFinish != null) {
            params.put("is_finish", isFinish);
        }
        if (operatorName != null) {
            params.put("operator_name", operatorName);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (stockCheckCreateItems != null) {
            params.put("stock_check_create_items", stockCheckCreateItems);
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