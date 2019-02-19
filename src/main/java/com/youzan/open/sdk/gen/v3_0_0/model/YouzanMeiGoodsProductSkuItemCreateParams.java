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

public class YouzanMeiGoodsProductSkuItemCreateParams implements APIParams, FileParams  {

    /**
     * 美业token
     */
    private String mToken;
    /**
     * 规格项名称
     */
    private String name;
    /**
     * 规格ID
     */
    private Long parentDictId;

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setParentDictId(Long parentDictId) {
        this.parentDictId = parentDictId;
    }

    public Long getParentDictId() {
        return this.parentDictId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (parentDictId != null) {
            params.put("parent_dict_id", parentDictId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}