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

public class YouzanTradeQrcodeHasoutidGetParams implements APIParams, FileParams  {

    /**
     * 外部订单号
     */
    private String outId;
    /**
     * 外部来源（由有赞分配）
     */
    private String outSource;

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public String getOutId() {
        return this.outId;
    }

    public void setOutSource(String outSource) {
        this.outSource = outSource;
    }

    public String getOutSource() {
        return this.outSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (outId != null) {
            params.put("out_id", outId);
        }
        if (outSource != null) {
            params.put("out_source", outSource);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}