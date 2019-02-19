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

public class YouzanRetailStockGoodsapplySearchParams implements APIParams, FileParams  {

    /**
     * 单据号
     */
    private String bizBillNo;
    /**
     * 制单人
     */
    private Long bizOperatorId;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 名称或条码
     */
    private String nameOrNo;
    /**
     * 单据状态
     */
    private Long orderStatus;
    /**
     * 分页号
     */
    private Long pageNo;
    /**
     * 分页大小
     */
    private Long pageSize;
    /**
     * 系统来源
     */
    private String retailSource;
    /**
     * 是否显示明细
     */
    private Boolean showItem;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品编码
     */
    private String skuNo;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 收货门店
     */
    private Long warehouseId;

    public void setBizBillNo(String bizBillNo) {
        this.bizBillNo = bizBillNo;
    }

    public String getBizBillNo() {
        return this.bizBillNo;
    }

    public void setBizOperatorId(Long bizOperatorId) {
        this.bizOperatorId = bizOperatorId;
    }

    public Long getBizOperatorId() {
        return this.bizOperatorId;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setNameOrNo(String nameOrNo) {
        this.nameOrNo = nameOrNo;
    }

    public String getNameOrNo() {
        return this.nameOrNo;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
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

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuName() {
        return this.skuName;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public String getSkuNo() {
        return this.skuNo;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizBillNo != null) {
            params.put("biz_bill_no", bizBillNo);
        }
        if (bizOperatorId != null) {
            params.put("biz_operator_id", bizOperatorId);
        }
        if (endTime != null) {
            params.put("end_time", endTime);
        }
        if (nameOrNo != null) {
            params.put("name_or_no", nameOrNo);
        }
        if (orderStatus != null) {
            params.put("order_status", orderStatus);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (showItem != null) {
            params.put("show_item", showItem);
        }
        if (skuName != null) {
            params.put("sku_name", skuName);
        }
        if (skuNo != null) {
            params.put("sku_no", skuNo);
        }
        if (startTime != null) {
            params.put("start_time", startTime);
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