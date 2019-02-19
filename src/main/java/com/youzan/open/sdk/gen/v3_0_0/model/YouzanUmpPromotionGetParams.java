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

public class YouzanUmpPromotionGetParams implements APIParams, FileParams  {

    /**
     * 有赞手机注册账号id
     */
    private String buyerId;
    /**
     * 粉丝id
     */
    private String fansId;
    /**
     * 粉丝类型
     */
    private String fansType;
    /**
     * 商品别名。item_id和item_alias两者必须传一个
     */
    private String itemAlias;
    /**
     * 商品id。item_id和item_alias两者必须传一个
     */
    private Long itemId;

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerId() {
        return this.buyerId;
    }

    public void setFansId(String fansId) {
        this.fansId = fansId;
    }

    public String getFansId() {
        return this.fansId;
    }

    public void setFansType(String fansType) {
        this.fansType = fansType;
    }

    public String getFansType() {
        return this.fansType;
    }

    public void setItemAlias(String itemAlias) {
        this.itemAlias = itemAlias;
    }

    public String getItemAlias() {
        return this.itemAlias;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (fansType != null) {
            params.put("fans_type", fansType);
        }
        if (itemAlias != null) {
            params.put("item_alias", itemAlias);
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