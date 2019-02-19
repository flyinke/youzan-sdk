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

public class YouzanMeiCashierRechargeGetResult implements APIResult {

    @JsonProperty(value = "order_no")
    /**
     * 充值单号
     */
    private String orderNo;
    @JsonProperty(value = "channel_name")
    /**
     * 充值支付通道名称
微信、支付宝、刷卡、现金

     */
    private String channelName;
    @JsonProperty(value = "pay_status")
    /**
     * 充值结果
10, "准备充值"
20, "支付中"
30, "已支付"
33, "已充值"
35, "发放权益"
98, "支付失败"
     */
    private Long payStatus;
    @JsonProperty(value = "channel_type")
    /**
     * 充值支付通道类型
1,"微信"
3，“支付宝”
201, "现金"
204, "刷卡"
     */
    private Long channelType;

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return this.channelName;
    }
    public void setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
    }

    public Long getPayStatus() {
        return this.payStatus;
    }
    public void setChannelType(Long channelType) {
        this.channelType = channelType;
    }

    public Long getChannelType() {
        return this.channelType;
    }


}