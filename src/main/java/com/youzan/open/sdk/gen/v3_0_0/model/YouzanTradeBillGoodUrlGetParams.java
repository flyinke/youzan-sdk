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

public class YouzanTradeBillGoodUrlGetParams implements APIParams, FileParams  {

    /**
     * 商品活动别名,如果没有该值，填''
     */
    private String activityAlias;
    /**
     * 商品营销活动id,如果没有该值，填0
     */
    private Long activityId;
    /**
     * 商品应用营销活动类型,如果没有该值，填0
     */
    private Long activityType;
    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 店铺id
     */
    private Long kdtId;
    /**
     * 商品留言，按商品设置的留言顺序将留言内容传入即可，图片留言请传入图片url。示例["文本测试", "123", "moyu@youzan.com", "2017-07-11", "16:08", "123456789012345678", "https://img.yzcdn.cn/upload_files/2017/02/22/148775750218475652.png"]
     */
    private String message;
    /**
     * 商品数量
     */
    private Long num;
    /**
     * 是否来自购物车
     */
    private String orderFrom;
    /**
     * 订单类型，0表示普通订单，还有其他类型类似赠品、酒店、拼团等类型
     */
    private Long orderType;
    /**
     * 价格，单位分
     */
    private Long price;
    /**
     * 规格id 无规格商品无需填写，多规格商品必须传
     */
    private Long skuId;
    /**
     * 订单来源：购物车，卡门等
     */
    private String source;
    /**
     * 是否支持微信支付；1 支持、0 不支持；
     */
    private Long useWxpay;

    public void setActivityAlias(String activityAlias) {
        this.activityAlias = activityAlias;
    }

    public String getActivityAlias() {
        return this.activityAlias;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public void setActivityType(Long activityType) {
        this.activityType = activityType;
    }

    public Long getActivityType() {
        return this.activityType;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return this.num;
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

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setUseWxpay(Long useWxpay) {
        this.useWxpay = useWxpay;
    }

    public Long getUseWxpay() {
        return this.useWxpay;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (activityAlias != null) {
            params.put("activity_alias", activityAlias);
        }
        if (activityId != null) {
            params.put("activity_id", activityId);
        }
        if (activityType != null) {
            params.put("activity_type", activityType);
        }
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (message != null) {
            params.put("message", message);
        }
        if (num != null) {
            params.put("num", num);
        }
        if (orderFrom != null) {
            params.put("order_from", orderFrom);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (useWxpay != null) {
            params.put("use_wxpay", useWxpay);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}