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

public class YouzanRetailStockStockoutCreateResult implements APIResult {

    @JsonProperty(value = "business_order_no")
    /**
     * 出库单编号
     */
    private String businessOrderNo;

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessOrderNo() {
        return this.businessOrderNo;
    }


}