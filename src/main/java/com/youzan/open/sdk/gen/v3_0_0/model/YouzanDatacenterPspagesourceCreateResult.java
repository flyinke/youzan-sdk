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

public class YouzanDatacenterPspagesourceCreateResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 是否创建成功，true成功 false 失败
     */
    private Boolean response;

    public void setResponse(Boolean response) {
        this.response = response;
    }

    public Boolean getResponse() {
        return this.response;
    }


}