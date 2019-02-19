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

public class YouzanSalesmanItemShareGetParams implements APIParams, FileParams  {

    /**
     * 粉丝id （mobile或fans_id选其一，另者置为0，都填以mobile为准）
     */
    private Long fansId;
    /**
     * 粉丝类型（自有粉丝: fans_type = 1）
     */
    private Long fansType;
    /**
     * 商品别名（item_id或item_alias选其一，另者置为0，都填以item_alias为准）
     */
    private String itemAlias;
    /**
     * 商品id（item_id或item_alias选其一，另者置为0，都填以item_alias为准）
     */
    private Long itemId;
    /**
     * 手机号（mobile或fans_id选其一，另者置为0，都填以mobile为准）
     */
    private String mobile;

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }

    public void setFansType(Long fansType) {
        this.fansType = fansType;
    }

    public Long getFansType() {
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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
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
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}