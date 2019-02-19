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

public class YouzanMeiDeptStatusGetResult implements APIResult {

    @JsonProperty(value = "expire_time")
    /**
     * 过期时间
     */
    private Long expireTime;
    @JsonProperty(value = "remain_time")
    /**
     * 剩余时间
     */
    private Long remainTime;
    @JsonProperty(value = "valid_status")
    /**
     * 店铺状态
10, "试用期"
20, "保护期"
20, "保护期"
40, "试用期打烊"
50, "服务期打烊"
     */
    private Long validStatus;

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public Long getExpireTime() {
        return this.expireTime;
    }
    public void setRemainTime(Long remainTime) {
        this.remainTime = remainTime;
    }

    public Long getRemainTime() {
        return this.remainTime;
    }
    public void setValidStatus(Long validStatus) {
        this.validStatus = validStatus;
    }

    public Long getValidStatus() {
        return this.validStatus;
    }


}