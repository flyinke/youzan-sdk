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

public class YouzanItemGetParams implements APIParams, FileParams  {

    /**
     * 商品别名，可以通过列表接口如youzan.items.onsale.get （查询出售中商品）和 youzan.items.inventory.get （查询仓库中商品）获取到
     */
    private String alias;
    /**
     * 商品ID，可以通过列表接口如youzan.items.onsale.get （查询出售中商品）和 youzan.items.inventory.get （查询仓库中商品）获取到
     */
    private Long itemId;

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (alias != null) {
            params.put("alias", alias);
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