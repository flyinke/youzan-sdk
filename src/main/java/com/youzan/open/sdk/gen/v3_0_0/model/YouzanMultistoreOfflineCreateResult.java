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

public class YouzanMultistoreOfflineCreateResult implements APIResult {

    @JsonProperty(value = "id")
    /**
     * 成功时返回新增的网点id
     */
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


}