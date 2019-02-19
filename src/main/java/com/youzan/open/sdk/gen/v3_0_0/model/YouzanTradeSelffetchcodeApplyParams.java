package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanTradeSelffetchcodeApplyParams implements APIParams, FileParams  {

    /**
     * 消费者端的到店自提订单提货码
     */
    private String code;
    /**
     * 核销人（开发者根据自己业务规则传，一般为网点号或手机号）
     */
    private String extraInfo;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (code != null) {
            params.put("code", code);
        }
        if (extraInfo != null) {
            params.put("extra_info", extraInfo);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}