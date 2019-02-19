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

public class YouzanRetailOpenStockinorderQueryParams implements APIParams, FileParams  {

    /**
     * 创建截止时间
     */
    private String createTimeEnd;
    /**
     * 创建开始时间
     */
    private String createTimeStart;
    /**
     * 入库单据类型：
BYRK=报溢入库
PYRK=盘盈入库
CGRK=采购入库
THRK=退货入库
DBRK=调拨入库
     */
    private String orderType;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页条数
     */
    private Long pageSize;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;
    /**
     * 仓库编码
     */
    private String warehouseCode;

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
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

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseCode() {
        return this.warehouseCode;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (createTimeEnd != null) {
            params.put("create_time_end", createTimeEnd);
        }
        if (createTimeStart != null) {
            params.put("create_time_start", createTimeStart);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
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