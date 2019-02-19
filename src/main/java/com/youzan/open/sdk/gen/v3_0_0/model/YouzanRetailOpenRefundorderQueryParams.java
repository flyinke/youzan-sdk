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

public class YouzanRetailOpenRefundorderQueryParams implements APIParams, FileParams  {

    /**
     * 结束创建时间（至少需要一种时间范围）
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
     * 退款状态
REFUND_WAIT_SELLER_AGREE：买家已经申请退款，等待卖家同意
REFUND_SELLER_REFUSE_BUYER：卖家拒绝退款
REFUND_WAIT_BUYER_RETURN_GOODS：卖家已经同意退货，等待买家退货
REFUND_WAIT_SELLER_CONFIRM_GOODS：买家已经退货，等待卖家确认收货
REFUND_SELLER_REFUSE_RETURN_GOODS：卖家未收到货,拒绝退款
REFUND_CLOSED：退款关闭
REFUND_SUCCESS：退款成功
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