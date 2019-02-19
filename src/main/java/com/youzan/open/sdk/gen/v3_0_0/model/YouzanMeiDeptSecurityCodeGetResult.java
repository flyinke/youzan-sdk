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

public class YouzanMeiDeptSecurityCodeGetResult implements APIResult {

    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "code")
    /**
     * 安全码
     */
    private String code;
    @JsonProperty(value = "rules")
    /**
     * 规则列表
1 顾客的私密档案
2 顾客的手机号
3 顾客的微信号
     */
    private Number[] rules;
    @JsonProperty(value = "code_id")
    /**
     * 安全码id
     */
    private Long codeId;
    @JsonProperty(value = "status")
    /**
     * 状态
1 开启
2 关闭
     */
    private Long status;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
    public void setRules(Number[] rules) {
        this.rules = rules;
    }

    public Number[] getRules() {
        return this.rules;
    }
    public void setCodeId(Long codeId) {
        this.codeId = codeId;
    }

    public Long getCodeId() {
        return this.codeId;
    }
    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }


}