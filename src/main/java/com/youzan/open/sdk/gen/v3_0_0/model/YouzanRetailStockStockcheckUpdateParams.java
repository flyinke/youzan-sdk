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

public class YouzanRetailStockStockcheckUpdateParams implements APIParams, FileParams  {

    /**
     * 盘点单单号
     */
    private String businessOrderNo;
    /**
     * 是否完成盘点
     */
    private Boolean isFinish;
    /**
     * 备注
     */
    private String remark;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 列表
     */
    private String updateItems;
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

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Boolean getIsFinish() {
        return this.isFinish;
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

    public void setUpdateItems(String updateItems) {
        this.updateItems = updateItems;
    }

    public String getUpdateItems() {
        return this.updateItems;
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
        if (isFinish != null) {
            params.put("is_finish", isFinish);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (updateItems != null) {
            params.put("update_items", updateItems);
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