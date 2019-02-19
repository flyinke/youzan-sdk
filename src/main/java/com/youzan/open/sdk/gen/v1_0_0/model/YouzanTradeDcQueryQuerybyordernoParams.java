package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanTradeDcQueryQuerybyordernoParams implements APIParams, FileParams  {

    /**
     * 是否包含配送单信息 不包含具体的物流信息（默认false）
     */
    private Boolean includeDistOrder;
    /**
     * 是否包含物流详情 （默认false）
     */
    private Boolean includeDistOrderAndDetail;
    /**
     * 是否包含操作记录（默认false）
     */
    private Boolean includeOperationLog;
    /**
     * 店铺号
     */
    private Long kdtId;
    /**
     * 订单号
     */
    private String orderNo;

    public void setIncludeDistOrder(Boolean includeDistOrder) {
        this.includeDistOrder = includeDistOrder;
    }

    public Boolean getIncludeDistOrder() {
        return this.includeDistOrder;
    }

    public void setIncludeDistOrderAndDetail(Boolean includeDistOrderAndDetail) {
        this.includeDistOrderAndDetail = includeDistOrderAndDetail;
    }

    public Boolean getIncludeDistOrderAndDetail() {
        return this.includeDistOrderAndDetail;
    }

    public void setIncludeOperationLog(Boolean includeOperationLog) {
        this.includeOperationLog = includeOperationLog;
    }

    public Boolean getIncludeOperationLog() {
        return this.includeOperationLog;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (includeDistOrder != null) {
            params.put("include_dist_order", includeDistOrder);
        }
        if (includeDistOrderAndDetail != null) {
            params.put("include_dist_order_and_detail", includeDistOrderAndDetail);
        }
        if (includeOperationLog != null) {
            params.put("include_operation_log", includeOperationLog);
        }
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (orderNo != null) {
            params.put("order_no", orderNo);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}