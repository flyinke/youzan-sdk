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

public class YouzanTradesSoldOuterGetParams implements APIParams, FileParams  {

    /**
     * 交易创建结束时间
     */
    private Date endCreated;
    /**
     * 交易状态更新的结束时间
     */
    private Date endUpdate;
    /**
     * 需要返回的交易对象字段
     */
    private String fields;
    /**
     * 三方用户ua
     */
    private String outerType;
    /**
     * 三方用户user_id
     */
    private String outerUserId;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页条数
     */
    private Long pageSize;
    /**
     * 交易创建开始时间
     */
    private Date startCreated;
    /**
     * 交易状态更新的开始时间
     */
    private Date startUpdate;
    /**
     * 交易状态 ，默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。 可选值： TRADE_NO_CREATE_PAY（没有创建支付交易） WAIT_BUYER_PAY（等待买家付款） WAIT_GROUP（等待成团，即：买家已付款，等待成团） WAIT_SELLER_SEND_GOODS（等待卖家发货，即：买家已付款） WAIT_BUYER_CONFIRM_GOODS（等待买家确认收货，即：卖家已发货） TRADE_BUYER_SIGNED（买家已签收） TRADE_CLOSED（付款以后用户退款成功，交易自动关闭） ALL_WAIT_PAY（包含：WAIT_BUYER_PAY、TRADE_NO_CREATE_PAY） ALL_CLOSED（所有关闭订单）
     */
    private String status;
    /**
     * 订单类型 ，默认查询所有交易状态的数据，除了默认值外每次只能查询一种状态。 可选值： FIXED （一口价） GIFT （送礼） BULK_PURCHASE（来自分销商的采购） PRESENT （赠品领取） GROUP （拼团订单） COD （货到付款） PEER （代付） QRCODE（扫码商家二维码直接支付的交易）
     */
    private String type;
    /**
     * 是否启用has_next的分页方式
     */
    private Boolean useHasNext;

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }

    public void setEndUpdate(Date endUpdate) {
        this.endUpdate = endUpdate;
    }

    public Date getEndUpdate() {
        return this.endUpdate;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setOuterType(String outerType) {
        this.outerType = outerType;
    }

    public String getOuterType() {
        return this.outerType;
    }

    public void setOuterUserId(String outerUserId) {
        this.outerUserId = outerUserId;
    }

    public String getOuterUserId() {
        return this.outerUserId;
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

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public void setStartUpdate(Date startUpdate) {
        this.startUpdate = startUpdate;
    }

    public Date getStartUpdate() {
        return this.startUpdate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }

    public Boolean getUseHasNext() {
        return this.useHasNext;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (endCreated != null) {
            params.put("end_created", endCreated);
        }
        if (endUpdate != null) {
            params.put("end_update", endUpdate);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (outerType != null) {
            params.put("outer_type", outerType);
        }
        if (outerUserId != null) {
            params.put("outer_user_id", outerUserId);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (startCreated != null) {
            params.put("start_created", startCreated);
        }
        if (startUpdate != null) {
            params.put("start_update", startUpdate);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (type != null) {
            params.put("type", type);
        }
        if (useHasNext != null) {
            params.put("use_has_next", useHasNext);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}