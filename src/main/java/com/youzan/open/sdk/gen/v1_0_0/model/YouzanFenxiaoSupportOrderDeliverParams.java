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

public class YouzanFenxiaoSupportOrderDeliverParams implements APIParams, FileParams  {

    /**
     * 操作人id
     */
    private Long adminId;
    /**
     * 物流公司id
     */
    private Long expressId;
    /**
     * 物流公司名称
     */
    private String expressName;
    /**
     * 物流单号
     */
    private String expressNo;
    /**
     * 店铺kdtid
     */
    private Long kdtId;
    /**
     * 操作人姓名
     */
    private String operatorName;
    /**
     * 操作人角色(seller| buyer | admin)
     */
    private String operatorRole;
    /**
     * 订单发货商品id列表（不填则订单所有商品发货）
     */
    private String orderItemIds;
    /**
     * 精选订单号
     */
    private String orderNo;
    /**
     * 请求来源ip
     */
    private String requestIp;
    /**
     * 请求来源
     */
    private String sourceFrom;
    /**
     * 请求来源说明
     */
    private String sourceRemark;

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getAdminId() {
        return this.adminId;
    }

    public void setExpressId(Long expressId) {
        this.expressId = expressId;
    }

    public Long getExpressId() {
        return this.expressId;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getExpressName() {
        return this.expressName;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getExpressNo() {
        return this.expressNo;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return this.operatorName;
    }

    public void setOperatorRole(String operatorRole) {
        this.operatorRole = operatorRole;
    }

    public String getOperatorRole() {
        return this.operatorRole;
    }

    public void setOrderItemIds(String orderItemIds) {
        this.orderItemIds = orderItemIds;
    }

    public String getOrderItemIds() {
        return this.orderItemIds;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getRequestIp() {
        return this.requestIp;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public void setSourceRemark(String sourceRemark) {
        this.sourceRemark = sourceRemark;
    }

    public String getSourceRemark() {
        return this.sourceRemark;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (adminId != null) {
            params.put("admin_id", adminId);
        }
        if (expressId != null) {
            params.put("express_id", expressId);
        }
        if (expressName != null) {
            params.put("express_name", expressName);
        }
        if (expressNo != null) {
            params.put("express_no", expressNo);
        }
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (operatorName != null) {
            params.put("operator_name", operatorName);
        }
        if (operatorRole != null) {
            params.put("operator_role", operatorRole);
        }
        if (orderItemIds != null) {
            params.put("order_item_ids", orderItemIds);
        }
        if (orderNo != null) {
            params.put("order_no", orderNo);
        }
        if (requestIp != null) {
            params.put("request_ip", requestIp);
        }
        if (sourceFrom != null) {
            params.put("source_from", sourceFrom);
        }
        if (sourceRemark != null) {
            params.put("source_remark", sourceRemark);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}