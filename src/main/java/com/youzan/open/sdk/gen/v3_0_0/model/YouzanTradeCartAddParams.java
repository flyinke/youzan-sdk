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

public class YouzanTradeCartAddParams implements APIParams, FileParams  {

    /**
     * 商品活动别名
     */
    private String activityAlias;
    /**
     * 商品营销活动id
     */
    private Long activityId;
    /**
     * 商品营销活动类型
     */
    private Long activityType;
    /**
     * 扩展字段
     */
    private String bizTracePointExt;
    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 店铺id
     */
    private Long kdtId;
    /**
     * 商品留言
     */
    private String message;
    /**
     * 商品数量
     */
    private Long num;
    /**
     * 商品skuid
     */
    private Long skuId;
    /**
     * 门店id,多门店时才会涉及到，不是多门店的情况填0
     */
    private Long storeId;

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

    public void setBizTracePointExt(String bizTracePointExt) {
        this.bizTracePointExt = bizTracePointExt;
    }

    public String getBizTracePointExt() {
        return this.bizTracePointExt;
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

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return this.storeId;
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
        if (bizTracePointExt != null) {
            params.put("biz_trace_point_ext", bizTracePointExt);
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
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (storeId != null) {
            params.put("store_id", storeId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}