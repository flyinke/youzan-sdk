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

public class YouzanItemQuantityUpdateParams implements APIParams, FileParams  {

    /**
     * 商品数字编号
     */
    private Long itemId;
    /**
     * sku库存数量
     */
    private Long quantity;
    /**
     * sku id如果商品为无规格商品是可以不传，否则必传
     */
    private Long skuId;
    /**
     * 库存更新方式：0为全量更新，1为增量更新(默认为0)
     */
    private Long type;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (quantity != null) {
            params.put("quantity", quantity);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (type != null) {
            params.put("type", type);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}