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

public class YouzanRetailProductsOnlineDisplayParams implements APIParams, FileParams  {

    /**
     * 上下架状态（0为下架， 1为上架）
     */
    private Long display;
    /**
     * 批量更新的网店商品id列表
     */
    private String itemIds;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String source;

    public void setDisplay(Long display) {
        this.display = display;
    }

    public Long getDisplay() {
        return this.display;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (display != null) {
            params.put("display", display);
        }
        if (itemIds != null) {
            params.put("item_ids", itemIds);
        }
        if (source != null) {
            params.put("source", source);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}