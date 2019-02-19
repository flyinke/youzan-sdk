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

public class YouzanRetailStockWarehouseGetParams implements APIParams, FileParams  {

    /**
     * 查询类型，1:只查询内部简单信息，不包含仓库名称地址等。2:包含仓库名称地址信息。
     */
    private Long queryType;
    /**
     * 来源
     */
    private String retailSource;
    /**
     * 仓库kdtId
     */
    private Long warehouseId;

    public void setQueryType(Long queryType) {
        this.queryType = queryType;
    }

    public Long getQueryType() {
        return this.queryType;
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
        if (queryType != null) {
            params.put("query_type", queryType);
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