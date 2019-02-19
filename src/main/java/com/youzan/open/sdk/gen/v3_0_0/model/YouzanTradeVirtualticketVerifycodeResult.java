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

public class YouzanTradeVirtualticketVerifycodeResult implements APIResult {

    @JsonProperty(value = "code")
    /**
     * 结果码
     */
    private Long code;
    @JsonProperty(value = "successful")
    /**
     * 是否成功
     */
    private Boolean successful;
    @JsonProperty(value = "msg")
    /**
     * 结果信息
     */
    private String msg;

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getCode() {
        return this.code;
    }
    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public Boolean getSuccessful() {
        return this.successful;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }


}