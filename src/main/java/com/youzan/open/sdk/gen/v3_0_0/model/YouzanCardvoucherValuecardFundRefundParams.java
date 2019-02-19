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

public class YouzanCardvoucherValuecardFundRefundParams implements APIParams, FileParams  {

    /**
     * 退款金额（单位：分）
     */
    private Long amount;
    /**
     * 操作人姓名。如果是商家发起退款，请填写商家操作人姓名。如果是用户发起，请填写用户姓名（长度必须小于24）
     */
    private String operator;
    /**
     * 需退款的支付请求号（长度必须小于24）
     */
    private String payRequestNo;
    /**
     * 退款请求号,唯一标识一次退款请求，请确保唯一（长度必须小于24）
     */
    private String refundRequestNo;
    /**
     * 退款描述（长度必须小于100）
     */
    private String remark;

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setPayRequestNo(String payRequestNo) {
        this.payRequestNo = payRequestNo;
    }

    public String getPayRequestNo() {
        return this.payRequestNo;
    }

    public void setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
    }

    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (amount != null) {
            params.put("amount", amount);
        }
        if (operator != null) {
            params.put("operator", operator);
        }
        if (payRequestNo != null) {
            params.put("pay_request_no", payRequestNo);
        }
        if (refundRequestNo != null) {
            params.put("refund_request_no", refundRequestNo);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}