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

public class YouzanItemHotelRoomUpdateParams implements APIParams, FileParams  {

    /**
     * 商品Id
     */
    private Long itemId;
    /**
     * 房态详情列表，一次最多30条数据
[{stock_date:"2017-10-31",status:1,price:322.01,stock_num:65}]
     */
    private String roomStock;
    /**
     * 规格Id，无规格商品不用填写
     */
    private Long skuId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setRoomStock(String roomStock) {
        this.roomStock = roomStock;
    }

    public String getRoomStock() {
        return this.roomStock;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (roomStock != null) {
            params.put("room_stock", roomStock);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}