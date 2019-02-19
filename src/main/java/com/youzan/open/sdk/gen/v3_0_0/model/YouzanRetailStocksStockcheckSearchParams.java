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

public class YouzanRetailStocksStockcheckSearchParams implements APIParams, FileParams  {

    /**
     * 盘点单单号
     */
    private String businessOrderNo;
    /**
     * 盘点单状态（CHECKING(1, "盘点中"), DONE(2, "已完成"), CANCEL(3, "已作废")）
     */
    private String checkOrderStatus;
    /**
     * 结束时间
     */
    private String endTime;
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
     * 仓库id列表  注意：连锁版必填
     */
    private String warehouseIds;

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessOrderNo() {
        return this.businessOrderNo;
    }

    public void setCheckOrderStatus(String checkOrderStatus) {
        this.checkOrderStatus = checkOrderStatus;
    }

    public String getCheckOrderStatus() {
        return this.checkOrderStatus;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
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
        if (checkOrderStatus != null) {
            params.put("check_order_status", checkOrderStatus);
        }
        if (endTime != null) {
            params.put("end_time", endTime);
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