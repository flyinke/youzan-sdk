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

public class YouzanScrmCustomerCreateResult implements APIResult {

    @JsonProperty(value = "account_id")
    /**
     * 帐号ID
     */
    private String accountId;
    @JsonProperty(value = "account_type")
    /**
     * 帐号类型。目前支持以下选项（只支持传一种）： FansID：自有粉丝ID， Mobile：手机号， YouZanAccount：有赞账号
     */
    private String accountType;

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return this.accountId;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }


}