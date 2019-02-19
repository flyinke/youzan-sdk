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

public class YouzanMeiCustomerTradeinfoGetResult implements APIResult {

    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "average_amount")
    /**
     * 平均消费金额
     */
    private Long averageAmount;
    @JsonProperty(value = "trade_count")
    /**
     * 消费次数
     */
    private Long tradeCount;
    @JsonProperty(value = "total_trade_amount")
    /**
     * 总消费金额
     */
    private Long totalTradeAmount;
    @JsonProperty(value = "yz_uid")
    /**
     * 用户id
     */
    private Long yzUid;
    @JsonProperty(value = "last_trade_time")
    /**
     * 最近消费时间
     */
    private Long lastTradeTime;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setAverageAmount(Long averageAmount) {
        this.averageAmount = averageAmount;
    }

    public Long getAverageAmount() {
        return this.averageAmount;
    }
    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Long getTradeCount() {
        return this.tradeCount;
    }
    public void setTotalTradeAmount(Long totalTradeAmount) {
        this.totalTradeAmount = totalTradeAmount;
    }

    public Long getTotalTradeAmount() {
        return this.totalTradeAmount;
    }
    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }
    public void setLastTradeTime(Long lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public Long getLastTradeTime() {
        return this.lastTradeTime;
    }


}