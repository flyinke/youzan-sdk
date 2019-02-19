package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanUmpLimitdiscountDetailQueryParams implements APIParams, FileParams  {

    /**
     * 商品id，支持多个批量查询
     */
    private String goodsIds;

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
    }

    public String getGoodsIds() {
        return this.goodsIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (goodsIds != null) {
            params.put("goods_ids", goodsIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}