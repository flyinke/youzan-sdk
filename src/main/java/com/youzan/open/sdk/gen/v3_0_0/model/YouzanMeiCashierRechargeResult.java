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

public class YouzanMeiCashierRechargeResult implements APIResult {

    @JsonProperty(value = "order_no")
    /**
     * 充值单号
     */
    private String orderNo;
    @JsonProperty(value = "pay_status")
    /**
     * 充值结果
0, "待开单"
10, "待支付"
20, "支付中"
30, "已支付"
40, "退款中"
50, "已退款"
98, "支付失败"
     */
    private Long payStatus;

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }
    public void setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
    }

    public Long getPayStatus() {
        return this.payStatus;
    }


}