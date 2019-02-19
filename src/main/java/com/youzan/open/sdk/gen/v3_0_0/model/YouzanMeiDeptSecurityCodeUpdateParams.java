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

public class YouzanMeiDeptSecurityCodeUpdateParams implements APIParams, FileParams  {

    /**
     * 更新后的安全码
     */
    private String code;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 更新的安全规则。传入值代表开启，不传入代表去掉。比如要开启顾客手机号保护，则传入2；如果要全部开启，则传入 1，2，3
1 顾客的私密档案
2 顾客的手机号
3 顾客的微信号
     */
    private String rules;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getRules() {
        return this.rules;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (code != null) {
            params.put("code", code);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (rules != null) {
            params.put("rules", rules);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}