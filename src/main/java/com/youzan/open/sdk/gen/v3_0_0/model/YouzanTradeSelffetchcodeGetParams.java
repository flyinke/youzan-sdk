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

public class YouzanTradeSelffetchcodeGetParams implements APIParams, FileParams  {

    /**
     * 提货码
     */
    private String code;
    /**
     * 需要返回的交易对象字段，如tid,title,receiver_city等。可选值：TradeDetail交易结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
     */
    private String fields;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (code != null) {
            params.put("code", code);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}