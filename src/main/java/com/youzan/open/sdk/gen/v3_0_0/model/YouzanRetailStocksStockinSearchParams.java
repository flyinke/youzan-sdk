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

public class YouzanRetailStocksStockinSearchParams implements APIParams, FileParams  {

    /**
     * 入库单单号
     */
    private String businessOrderNo;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 入库单类型（TOCK_IN(2, "采购入库单"),STOCK_RETURN(3, "退货入库单")）
     */
    private String orderTypes;
    /**
     * 查询页面
     */
    private Long pageNo;
    /**
     * 一页数量
     */
    private Long pageSize;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 供货商id
     */
    private Long vendorId;
    /**
     * 仓库id列表  注意：连锁版必填
     */
    private String warehouseIds;

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessOrderNo() {
        return this.businessOrderNo;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setOrderTypes(String orderTypes) {
        this.orderTypes = orderTypes;
    }

    public String getOrderTypes() {
        return this.orderTypes;
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

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setWarehouseIds(String warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public String getWarehouseIds() {
        return this.warehouseIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (businessOrderNo != null) {
            params.put("business_order_no", businessOrderNo);
        }
        if (endTime != null) {
            params.put("end_time", endTime);
        }
        if (orderTypes != null) {
            params.put("order_types", orderTypes);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (startTime != null) {
            params.put("start_time", startTime);
        }
        if (vendorId != null) {
            params.put("vendor_id", vendorId);
        }
        if (warehouseIds != null) {
            params.put("warehouse_ids", warehouseIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}