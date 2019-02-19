package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanCardvoucherValuecardFundRefundResult implements APIResult {

    @JsonProperty(value = "pay_request_no")
    /**
     * 退款的支付请求号
     */
    private String payRequestNo;
    @JsonProperty(value = "refund_request_no")
    /**
     * 退款请求号
     */
    private String refundRequestNo;
    @JsonProperty(value = "status")
    /**
     * 退款状态(SUCCESS:成功，FAIL:失败，ING:退款中）
     */
    private String status;
    @JsonProperty(value = "msg")
    /**
     * 状态描述
     */
    private String msg;

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
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }


}