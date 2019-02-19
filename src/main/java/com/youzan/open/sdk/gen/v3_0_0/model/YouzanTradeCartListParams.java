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

public class YouzanTradeCartListParams implements APIParams, FileParams  {

    /**
     * 店铺id
     */
    private Long kdtId;
    /**
     * 会话key,如果没有该值填
     */
    private String nobody;
    /**
     * 门店id,多门店时才会涉及到，不是多门店的情况填0
     */
    private Long storeId;

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

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return this.storeId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (nobody != null) {
            params.put("nobody", nobody);
        }
        if (storeId != null) {
            params.put("store_id", storeId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}