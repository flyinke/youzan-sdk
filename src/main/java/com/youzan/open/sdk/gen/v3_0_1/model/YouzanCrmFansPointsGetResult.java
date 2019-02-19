package com.youzan.open.sdk.gen.v3_0_1.model;

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

public class YouzanCrmFansPointsGetResult implements APIResult {

    @JsonProperty(value = "point")
    /**
     * 积分
     */
    private String point;

    public void setPoint(String point) {
        this.point = point;
    }

    public String getPoint() {
        return this.point;
    }


}