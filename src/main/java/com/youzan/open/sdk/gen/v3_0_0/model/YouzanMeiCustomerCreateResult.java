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

public class YouzanMeiCustomerCreateResult implements APIResult {

    @JsonProperty(value = "yz_uid")
    /**
     * 会员id
     */
    private Long yzUid;

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


}