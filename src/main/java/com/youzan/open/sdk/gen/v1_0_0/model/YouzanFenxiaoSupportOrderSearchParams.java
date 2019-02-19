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

public class YouzanFenxiaoSupportOrderSearchParams implements APIParams, FileParams  {

    /**
     * 关闭时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String closeTimeBegin;
    /**
     * 关闭时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String closeTimeEnd;
    /**
     * 是否加星
     */
    private Boolean isStar;
    /**
     * 供货商店铺id
     */
    private Long kdtId;
    /**
     * 排序key（默认按下单时间排序）
     */
    private String orderByKey;
    /**
     * desc: 降序，asc: 升序
     */
    private String orderByOrder;
    /**
     * 查询的订单号
     */
    private String orderNo;
    /**
     * 下单时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String orderTimeBegin;
    /**
     * 下单时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String orderTimeEnd;
    /**
     * 页码
     */
    private Long page;
    /**
     * 每页大小
     */
    private Long pageSize;
    /**
     * 支付时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String payTimeBegin;
    /**
     * 支付时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String payTimeEnd;
    /**
     * 收货人姓名
     */
    private String receiverName;
    /**
     * 收货人手机号
     */
    private String receiverPhone;
    /**
     * 维权状态
0:没有维权, 1:维权申请中,2:等待精选供货商收货中,3:退货退款完成,4:仅退款完成
     */
    private Long refundStatus;
    /**
     * 订单状态
10:待支付, 50:待发货, 60:已发货, 80:已收货, 99:已关闭,100:已完成
     */
    private Long status;
    /**
     * 完成时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String successTimeBegin;
    /**
     * 完成时间范围（yyyy-MM-dd HH:dd:ss）
     */
    private String successTimeEnd;

    public void setCloseTimeBegin(String closeTimeBegin) {
        this.closeTimeBegin = closeTimeBegin;
    }

    public String getCloseTimeBegin() {
        return this.closeTimeBegin;
    }

    public void setCloseTimeEnd(String closeTimeEnd) {
        this.closeTimeEnd = closeTimeEnd;
    }

    public String getCloseTimeEnd() {
        return this.closeTimeEnd;
    }

    public void setIsStar(Boolean isStar) {
        this.isStar = isStar;
    }

    public Boolean getIsStar() {
        return this.isStar;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }

    public void setOrderByKey(String orderByKey) {
        this.orderByKey = orderByKey;
    }

    public String getOrderByKey() {
        return this.orderByKey;
    }

    public void setOrderByOrder(String orderByOrder) {
        this.orderByOrder = orderByOrder;
    }

    public String getOrderByOrder() {
        return this.orderByOrder;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderTimeBegin(String orderTimeBegin) {
        this.orderTimeBegin = orderTimeBegin;
    }

    public String getOrderTimeBegin() {
        return this.orderTimeBegin;
    }

    public void setOrderTimeEnd(String orderTimeEnd) {
        this.orderTimeEnd = orderTimeEnd;
    }

    public String getOrderTimeEnd() {
        return this.orderTimeEnd;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPayTimeBegin(String payTimeBegin) {
        this.payTimeBegin = payTimeBegin;
    }

    public String getPayTimeBegin() {
        return this.payTimeBegin;
    }

    public void setPayTimeEnd(String payTimeEnd) {
        this.payTimeEnd = payTimeEnd;
    }

    public String getPayTimeEnd() {
        return this.payTimeEnd;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public void setRefundStatus(Long refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Long getRefundStatus() {
        return this.refundStatus;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setSuccessTimeBegin(String successTimeBegin) {
        this.successTimeBegin = successTimeBegin;
    }

    public String getSuccessTimeBegin() {
        return this.successTimeBegin;
    }

    public void setSuccessTimeEnd(String successTimeEnd) {
        this.successTimeEnd = successTimeEnd;
    }

    public String getSuccessTimeEnd() {
        return this.successTimeEnd;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (closeTimeBegin != null) {
            params.put("close_time_begin", closeTimeBegin);
        }
        if (closeTimeEnd != null) {
            params.put("close_time_end", closeTimeEnd);
        }
        if (isStar != null) {
            params.put("is_star", isStar);
        }
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (orderByKey != null) {
            params.put("order_by_key", orderByKey);
        }
        if (orderByOrder != null) {
            params.put("order_by_order", orderByOrder);
        }
        if (orderNo != null) {
            params.put("order_no", orderNo);
        }
        if (orderTimeBegin != null) {
            params.put("order_time_begin", orderTimeBegin);
        }
        if (orderTimeEnd != null) {
            params.put("order_time_end", orderTimeEnd);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (payTimeBegin != null) {
            params.put("pay_time_begin", payTimeBegin);
        }
        if (payTimeEnd != null) {
            params.put("pay_time_end", payTimeEnd);
        }
        if (receiverName != null) {
            params.put("receiver_name", receiverName);
        }
        if (receiverPhone != null) {
            params.put("receiver_phone", receiverPhone);
        }
        if (refundStatus != null) {
            params.put("refund_status", refundStatus);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (successTimeBegin != null) {
            params.put("success_time_begin", successTimeBegin);
        }
        if (successTimeEnd != null) {
            params.put("success_time_end", successTimeEnd);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}