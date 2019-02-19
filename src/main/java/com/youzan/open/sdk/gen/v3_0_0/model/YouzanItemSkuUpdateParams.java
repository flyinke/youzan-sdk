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

public class YouzanItemSkuUpdateParams implements APIParams, FileParams  {

    /**
     * 商品数字编号
     */
    private Long itemId;
    /**
     * 商品编码
     */
    private String itemNo;
    /**
     * sku销售价格，精确到小数点2位；单位:元
     */
    private Float price;
    /**
     * sku库存数量
     */
    private String quantity;
    /**
     * sku id
     */
    private Long skuId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemNo() {
        return this.itemNo;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return this.quantity;
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
        if (itemNo != null) {
            params.put("item_no", itemNo);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (quantity != null) {
            params.put("quantity", quantity);
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