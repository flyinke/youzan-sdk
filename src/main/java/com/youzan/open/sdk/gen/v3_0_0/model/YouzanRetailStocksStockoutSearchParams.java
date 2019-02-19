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

public class YouzanRetailStocksStockoutSearchParams implements APIParams, FileParams  {

    /**
     * 业务操作人id
     */
    private Long bizOperatorId;
    /**
     * 出库单单号
     */
    private String businessOrderNo;
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
     * 是否展示子信息
     */
    private Boolean showItem;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 出库单类型（41, "网店销售出库",
42, "门店销售出库",  43, "其他出库-报损",44, "其他出库-领用",49, "其他出库-其他"）
     */
    private String stockOutTypes;
    /**
     * 仓库id列表  注意：连锁版必填
     */
    private String warehouseIds;

    public void setBizOperatorId(Long bizOperatorId) {
        this.bizOperatorId = bizOperatorId;
    }

    public Long getBizOperatorId() {
        return this.bizOperatorId;
    }

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

    public void setShowItem(Boolean showItem) {
        this.showItem = showItem;
    }

    public Boolean getShowItem() {
        return this.showItem;
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

    public void setStockOutTypes(String stockOutTypes) {
        this.stockOutTypes = stockOutTypes;
    }

    public String getStockOutTypes() {
        return this.stockOutTypes;
    }

    public void setWarehouseIds(String warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public String getWarehouseIds() {
        return this.warehouseIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (bizOperatorId != null) {
            params.put("biz_operator_id", bizOperatorId);
        }
        if (businessOrderNo != null) {
            params.put("business_order_no", businessOrderNo);
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
        if (showItem != null) {
            params.put("show_item", showItem);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (startTime != null) {
            params.put("start_time", startTime);
        }
        if (stockOutTypes != null) {
            params.put("stock_out_types", stockOutTypes);
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