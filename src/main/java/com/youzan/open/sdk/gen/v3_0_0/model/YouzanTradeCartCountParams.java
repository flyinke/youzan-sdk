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

public class YouzanTradeCartCountParams implements APIParams, FileParams  {

    /**
     * kdt_id
     */
    private Long kdtId;
    /**
     * nobody
     */
    private String nobody;

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }

    public void setNobody(String nobody) {
        this.nobody = nobody;
    }

    public String getNobody() {
        return this.nobody;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (nobody != null) {
            params.put("nobody", nobody);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}