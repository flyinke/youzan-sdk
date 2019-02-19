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

public class YouzanRetailStockWarehouseSingleCreateResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 创建仓库的kdtid
     */
    private Long response;

    public void setResponse(Long response) {
        this.response = response;
    }

    public Long getResponse() {
        return this.response;
    }


}