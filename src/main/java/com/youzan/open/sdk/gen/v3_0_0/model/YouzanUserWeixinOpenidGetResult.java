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

public class YouzanUserWeixinOpenidGetResult implements APIResult {

    @JsonProperty(value = "open_id")
    /**
     * 获取到的用户open_id
     */
    private String openId;
    @JsonProperty(value = "union_id")
    /**
     * 微信union_id
     */
    private String unionId;

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return this.openId;
    }
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUnionId() {
        return this.unionId;
    }


}