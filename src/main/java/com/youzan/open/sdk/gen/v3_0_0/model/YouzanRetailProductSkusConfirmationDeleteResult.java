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

public class YouzanRetailProductSkusConfirmationDeleteResult implements APIResult {

    @JsonProperty(value = "offlineTotalCount")
    /**
     * 关联门店商品数量
     */
    private Long offlineTotalCount;
    @JsonProperty(value = "onlineTotalCount")
    /**
     * 关联网店商品数量
     */
    private Long onlineTotalCount;

    public void setOfflineTotalCount(Long offlineTotalCount) {
        this.offlineTotalCount = offlineTotalCount;
    }

    public Long getOfflineTotalCount() {
        return this.offlineTotalCount;
    }
    public void setOnlineTotalCount(Long onlineTotalCount) {
        this.onlineTotalCount = onlineTotalCount;
    }

    public Long getOnlineTotalCount() {
        return this.onlineTotalCount;
    }


}