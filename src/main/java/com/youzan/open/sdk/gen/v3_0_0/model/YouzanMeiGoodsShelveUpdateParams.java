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

public class YouzanMeiGoodsShelveUpdateParams implements APIParams, FileParams  {

    /**
     * 店铺ID列表
     */
    private String deptIds;
    /**
     * 商品ID列表
     */
    private String goodsIds;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 1上架 2下架
     */
    private Long shelveType;

    public void setDeptIds(String deptIds) {
        this.deptIds = deptIds;
    }

    public String getDeptIds() {
        return this.deptIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
    }

    public String getGoodsIds() {
        return this.goodsIds;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setShelveType(Long shelveType) {
        this.shelveType = shelveType;
    }

    public Long getShelveType() {
        return this.shelveType;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (deptIds != null) {
            params.put("dept_ids", deptIds);
        }
        if (goodsIds != null) {
            params.put("goods_ids", goodsIds);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (shelveType != null) {
            params.put("shelve_type", shelveType);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}