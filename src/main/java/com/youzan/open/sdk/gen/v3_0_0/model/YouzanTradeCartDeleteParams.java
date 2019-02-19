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

public class YouzanTradeCartDeleteParams implements APIParams, FileParams  {

    /**
     * 商品列表信息，goods_id(商品id)、sku_id(sku id)、kdt_id(店铺id)。
例如
[{"kdt_id":55,"goods_id":1103945,"sku_id":2722}]
     */
    private String itemList;
    /**
     * 会话key,如果没有该值，填
     */
    private String nobody;

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public String getItemList() {
        return this.itemList;
    }

    public void setNobody(String nobody) {
        this.nobody = nobody;
    }

    public String getNobody() {
        return this.nobody;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemList != null) {
            params.put("item_list", itemList);
        }
        if (nobody != null) {
            params.put("nobody", nobody);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}