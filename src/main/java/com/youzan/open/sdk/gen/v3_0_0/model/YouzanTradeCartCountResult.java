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

public class YouzanTradeCartCountResult implements APIResult {

    @JsonProperty(value = "is_success")
    /**
     * 查询是否成功，true为成功，false为失败
     */
    private Boolean isSuccess;
    @JsonProperty(value = "data")
    /**
     * 购物车中商品个数
     */
    private Long data;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }
    public void setData(Long data) {
        this.data = data;
    }

    public Long getData() {
        return this.data;
    }


}