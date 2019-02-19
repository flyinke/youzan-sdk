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

public class YouzanItemStandardSearchParams implements APIParams, FileParams  {

    /**
     * 商品编码列表
     */
    private String codes;
    /**
     * 商品类型
     */
    private Long itemType;

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public String getCodes() {
        return this.codes;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public Long getItemType() {
        return this.itemType;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (codes != null) {
            params.put("codes", codes);
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