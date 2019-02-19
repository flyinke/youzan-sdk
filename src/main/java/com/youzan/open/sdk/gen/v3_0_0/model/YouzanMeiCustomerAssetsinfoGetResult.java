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

public class YouzanMeiCustomerAssetsinfoGetResult implements APIResult {

    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "member_card_count")
    /**
     * 会员卡数量
     */
    private Long memberCardCount;
    @JsonProperty(value = "yz_uid")
    /**
     * 会员id
     */
    private Long yzUid;
    @JsonProperty(value = "points")
    /**
     * 积分
     */
    private Long points;
    @JsonProperty(value = "account_balance")
    /**
     * 储值账户余额。它的值等于储值赠送金额+储值本金金额
     */
    private Long accountBalance;
    @JsonProperty(value = "present_balance")
    /**
     * 储值赠送金额
     */
    private Long presentBalance;
    @JsonProperty(value = "capital_balance")
    /**
     * 储值本金金额
     */
    private Long capitalBalance;
    @JsonProperty(value = "coupon_count")
    /**
     * 优惠券数量
     */
    private Long couponCount;
    @JsonProperty(value = "total_rights")
    /**
     * 权益数量
     */
    private Long totalRights;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setMemberCardCount(Long memberCardCount) {
        this.memberCardCount = memberCardCount;
    }

    public Long getMemberCardCount() {
        return this.memberCardCount;
    }
    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }
    public void setPoints(Long points) {
        this.points = points;
    }

    public Long getPoints() {
        return this.points;
    }
    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Long getAccountBalance() {
        return this.accountBalance;
    }
    public void setPresentBalance(Long presentBalance) {
        this.presentBalance = presentBalance;
    }

    public Long getPresentBalance() {
        return this.presentBalance;
    }
    public void setCapitalBalance(Long capitalBalance) {
        this.capitalBalance = capitalBalance;
    }

    public Long getCapitalBalance() {
        return this.capitalBalance;
    }
    public void setCouponCount(Long couponCount) {
        this.couponCount = couponCount;
    }

    public Long getCouponCount() {
        return this.couponCount;
    }
    public void setTotalRights(Long totalRights) {
        this.totalRights = totalRights;
    }

    public Long getTotalRights() {
        return this.totalRights;
    }


}