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

public class YouzanMeiCashierPayParams implements APIParams, FileParams  {

    /**
     * 支付方式
120, "会员余额"
130, "刷卡"
201, "现金"
204, "刷卡"
微信和支付宝支付该字段不用传

     */
    private Long channelType;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 要支付的订单号
     */
    private String orderNo;
    /**
     * 如果是微信支付或者支付宝支付，则该字段必须要填写，填写内容为付款吗
     */
    private String payCode;
    /**
     * 如果是现金支付，则该字段必须要写，填写内容为顾客实际支付金额
     */
    private Long receivePay;

    public void setChannelType(Long channelType) {
        this.channelType = channelType;
    }

    public Long getChannelType() {
        return this.channelType;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPayCode() {
        return this.payCode;
    }

    public void setReceivePay(Long receivePay) {
        this.receivePay = receivePay;
    }

    public Long getReceivePay() {
        return this.receivePay;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (channelType != null) {
            params.put("channel_type", channelType);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (orderNo != null) {
            params.put("order_no", orderNo);
        }
        if (payCode != null) {
            params.put("pay_code", payCode);
        }
        if (receivePay != null) {
            params.put("receive_pay", receivePay);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}