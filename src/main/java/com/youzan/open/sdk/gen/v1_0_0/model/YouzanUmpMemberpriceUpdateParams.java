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

public class YouzanUmpMemberpriceUpdateParams implements APIParams, FileParams  {

    /**
     * 会员折扣定义
     */
    private String discounts;
    /**
     * 商品 ID
     */
    private Long itemId;

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public String getDiscounts() {
        return this.discounts;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (discounts != null) {
            params.put("discounts", discounts);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}