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

public class YouzanSalesmanAccountGetResult implements APIResult {

    @JsonProperty(value = "mobile")
    /**
     * 手机号
     */
    private String mobile;
    @JsonProperty(value = "nickname")
    /**
     * 昵称
     */
    private String nickname;
    @JsonProperty(value = "seller")
    /**
     * 标识码
     */
    private String seller;
    @JsonProperty(value = "order_num")
    /**
     * 累计成交笔数
     */
    private Long orderNum;
    @JsonProperty(value = "money")
    /**
     * 累计成交金额(元)
     */
    private String money;
    @JsonProperty(value = "created_at")
    /**
     * 创建时间
     */
    private String createdAt;
    @JsonProperty(value = "from_buyer_mobile")
    /**
     * 邀请方手机号
     */
    private String fromBuyerMobile;
    @JsonProperty(value = "fans_id")
    /**
     * 店铺自有粉丝id，绑定认证服务号的店铺才有。
     */
    private Long fansId;

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return this.nickname;
    }
    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSeller() {
        return this.seller;
    }
    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public Long getOrderNum() {
        return this.orderNum;
    }
    public void setMoney(String money) {
        this.money = money;
    }

    public String getMoney() {
        return this.money;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    public void setFromBuyerMobile(String fromBuyerMobile) {
        this.fromBuyerMobile = fromBuyerMobile;
    }

    public String getFromBuyerMobile() {
        return this.fromBuyerMobile;
    }
    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }


}