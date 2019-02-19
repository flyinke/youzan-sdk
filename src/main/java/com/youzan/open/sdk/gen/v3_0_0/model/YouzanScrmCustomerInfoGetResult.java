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

public class YouzanScrmCustomerInfoGetResult implements APIResult {

    @JsonProperty(value = "card_name")
    /**
     * 会员卡名称
     */
    private String cardName;
    @JsonProperty(value = "name")
    /**
     * 姓名
     */
    private String name;
    @JsonProperty(value = "mobile")
    /**
     * 手机号码
     */
    private String mobile;
    @JsonProperty(value = "fans_id")
    /**
     * 粉丝id
     */
    private Long fansId;
    @JsonProperty(value = "fans_type")
    /**
     * 粉丝类型
     */
    private Long fansType;
    @JsonProperty(value = "card_alias")
    /**
     * 会员卡别名
     */
    private String cardAlias;

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return this.cardName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }
    public void setFansType(Long fansType) {
        this.fansType = fansType;
    }

    public Long getFansType() {
        return this.fansType;
    }
    public void setCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
    }

    public String getCardAlias() {
        return this.cardAlias;
    }


}