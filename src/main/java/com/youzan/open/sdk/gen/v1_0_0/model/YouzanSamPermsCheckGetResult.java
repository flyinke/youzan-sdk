package com.youzan.open.sdk.gen.v1_0_0.model;

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

public class YouzanSamPermsCheckGetResult implements APIResult {

    @JsonProperty(value = "has_permission")
    /**
     * true: 有权限
false: 无权限
     */
    private Boolean hasPermission;

    public void setHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    public Boolean getHasPermission() {
        return this.hasPermission;
    }


}