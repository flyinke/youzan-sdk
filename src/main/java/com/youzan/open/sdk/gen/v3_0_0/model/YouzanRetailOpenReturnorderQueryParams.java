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

public class YouzanRetailOpenReturnorderQueryParams implements APIParams, FileParams  {

    /**
     * 开始创建时间（至少需要一种时间范围）
     */
    private String createTimeEnd;
    /**
     * 开始创建时间（至少需要一种时间范围）
     */
    private String createTimeStart;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页数量
     */
    private Long pageSize;
    /**
     * 零售调用来源（调用方和有赞约定的值）
     */
    private String retailSource;
    /**
     * 退货单状态
WAIT_RECEIVED：卖家待收货
RECEIVED：卖家已收货
SELLER_REFUSE：卖家未收到货，拒绝退款
RETURN_STOCK_SUCCESS：已入库
     */
    private String status;
    /**
     * 结束更新时间（至少需要一种时间范围）
     */
    private String updateTimeEnd;
    /**
     * 开始更新时间（至少需要一种时间范围）
     */
    private String updateTimeStart;

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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setUpdateTimeEnd(String updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public String getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public void setUpdateTimeStart(String updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
    }

    public String getUpdateTimeStart() {
        return this.updateTimeStart;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (createTimeEnd != null) {
            params.put("create_time_end", createTimeEnd);
        }
        if (createTimeStart != null) {
            params.put("create_time_start", createTimeStart);
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
        if (status != null) {
            params.put("status", status);
        }
        if (updateTimeEnd != null) {
            params.put("update_time_end", updateTimeEnd);
        }
        if (updateTimeStart != null) {
            params.put("update_time_start", updateTimeStart);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}