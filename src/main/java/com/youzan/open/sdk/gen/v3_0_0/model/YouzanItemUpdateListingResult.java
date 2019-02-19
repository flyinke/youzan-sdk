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

public class YouzanItemUpdateListingResult implements APIResult {

    @JsonProperty(value = "item_id")
    /**
     * 操作上架的商品id
     */
    private Long itemId;
    @JsonProperty(value = "is_success")
    /**
     * 操作是否成功，成功为true
     */
    private Boolean isSuccess;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }


}