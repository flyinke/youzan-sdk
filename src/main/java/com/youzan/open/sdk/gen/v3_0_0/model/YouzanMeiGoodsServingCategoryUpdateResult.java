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

public class YouzanMeiGoodsServingCategoryUpdateResult implements APIResult {

    @JsonProperty(value = "code")
    /**
     * 结果码
     */
    private Long code;
    @JsonProperty(value = "data")
    /**
     * 数据
     */
    private Long data;
    @JsonProperty(value = "success")
    /**
     * 是否成功
     */
    private Boolean success;
    @JsonProperty(value = "message")
    /**
     * 详细信息
     */
    private String message;

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getCode() {
        return this.code;
    }
    public void setData(Long data) {
        this.data = data;
    }

    public Long getData() {
        return this.data;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }


}