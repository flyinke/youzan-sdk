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

public class YouzanCardvoucherValuecardInfoQueryResult implements APIResult {

    @JsonProperty(value = "buyer_id")
    /**
     * buyer_id
     */
    private Long buyerId;
    @JsonProperty(value = "card_no")
    /**
     * 卡号
     */
    private String cardNo;
    @JsonProperty(value = "bonus_denomination")
    /**
     * 赠送金余额
     */
    private Long bonusDenomination;
    @JsonProperty(value = "mobile")
    /**
     * 手机号码
     */
    private String mobile;
    @JsonProperty(value = "principal_denomination")
    /**
     * 本金余额
     */
    private Long principalDenomination;
    @JsonProperty(value = "denomination")
    /**
     * 余额
     */
    private Long denomination;
    @JsonProperty(value = "kdt_id")
    /**
     * 发卡店铺号
     */
    private Long kdtId;

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return this.cardNo;
    }
    public void setBonusDenomination(Long bonusDenomination) {
        this.bonusDenomination = bonusDenomination;
    }

    public Long getBonusDenomination() {
        return this.bonusDenomination;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setPrincipalDenomination(Long principalDenomination) {
        this.principalDenomination = principalDenomination;
    }

    public Long getPrincipalDenomination() {
        return this.principalDenomination;
    }
    public void setDenomination(Long denomination) {
        this.denomination = denomination;
    }

    public Long getDenomination() {
        return this.denomination;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }


}