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

public class YouzanTradeQrcodeHasoutidGetResult implements APIResult {

    @JsonProperty(value = "pay_state")
    /**
     * 0未支付，1已支付
     */
    private Long payState;
    @JsonProperty(value = "pay_time")
    /**
     * 支付时间
     */
    private Long payTime;
    @JsonProperty(value = "pay_way")
    /**
     * 支付方式
     */
    private String payWay;
    @JsonProperty(value = "tid")
    /**
     * 交易单号
     */
    private String tid;

    public void setPayState(Long payState) {
        this.payState = payState;
    }

    public Long getPayState() {
        return this.payState;
    }
    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public Long getPayTime() {
        return this.payTime;
    }
    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPayWay() {
        return this.payWay;
    }
    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


}