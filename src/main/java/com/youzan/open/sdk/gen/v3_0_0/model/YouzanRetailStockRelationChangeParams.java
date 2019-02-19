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

public class YouzanRetailStockRelationChangeParams implements APIParams, FileParams  {

    /**
     * 来源
     */
    private String retailSource;
    /**
     * 欲修改的状态，1:绑定 0:解绑
     */
    private Long status;
    /**
     * 对应关系的店铺kdtId
     */
    private Long storeId;
    /**
     * 仓库id
     */
    private Long warehouseId;

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (storeId != null) {
            params.put("store_id", storeId);
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