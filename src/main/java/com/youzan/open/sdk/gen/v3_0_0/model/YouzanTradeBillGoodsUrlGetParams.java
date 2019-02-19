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

public class YouzanTradeBillGoodsUrlGetParams implements APIParams, FileParams  {

    /**
     * 商品信息,item_id，sku_id,num,price都为必填项 item_message为选填。[{"item_id":"413325328","sku_id":"36203790","num"：“12132414”}]
     */
    private String itemList;
    /**
     * 店铺id
     */
    private Long kdtId;
    /**
     * 是否来自购物车
如果是来自购物车 填cart
如果非购物车则不需要填写
     */
    private String orderFrom;
    /**
     * 订单类型，0表示普通订单，还有其他类型类似赠品、酒店、拼团等类型
赠品：1
拼团：10
酒店：35
     */
    private Long orderType;
    /**
     * 订单来源：购物车，卡门等
购物车：cart
卡门：open
     */
    private String source;

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public String getItemList() {
        return this.itemList;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getOrderFrom() {
        return this.orderFrom;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemList != null) {
            params.put("item_list", itemList);
        }
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (orderFrom != null) {
            params.put("order_from", orderFrom);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
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