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

public class YouzanMeiGoodsProductGetParams implements APIParams, FileParams  {

    /**
     * 商品ID
     */
    private Long goodsId;
    /**
     * 美业token
     */
    private String mToken;

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() {
        return this.goodsId;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (goodsId != null) {
            params.put("goods_id", goodsId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}