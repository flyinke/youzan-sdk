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

public class YouzanItemStandardGetParams implements APIParams, FileParams  {

    /**
     * 商品条形码编码
     */
    private String code;
    /**
     * 商品类型
     */
    private Long itemType;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public Long getItemType() {
        return this.itemType;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (code != null) {
            params.put("code", code);
        }
        if (itemType != null) {
            params.put("item_type", itemType);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}