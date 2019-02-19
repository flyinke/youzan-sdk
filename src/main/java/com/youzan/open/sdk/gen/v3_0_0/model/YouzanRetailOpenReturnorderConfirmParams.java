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

public class YouzanRetailOpenReturnorderConfirmParams implements APIParams, FileParams  {

    /**
     * 零售调用来源（调用方和有赞约定的值）
     */
    private String retailSource;
    /**
     * 退货单号
     */
    private String returnOrderNo;
    /**
     * 退货单版本
     */
    private Long version;
    /**
     * 仓库编码
     */
    private String warehouseCode;

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setReturnOrderNo(String returnOrderNo) {
        this.returnOrderNo = returnOrderNo;
    }

    public String getReturnOrderNo() {
        return this.returnOrderNo;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseCode() {
        return this.warehouseCode;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (returnOrderNo != null) {
            params.put("return_order_no", returnOrderNo);
        }
        if (version != null) {
            params.put("version", version);
        }
        if (warehouseCode != null) {
            params.put("warehouse_code", warehouseCode);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}