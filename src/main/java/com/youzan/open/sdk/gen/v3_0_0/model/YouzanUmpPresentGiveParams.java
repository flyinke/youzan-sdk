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

public class YouzanUmpPresentGiveParams implements APIParams, FileParams  {

    /**
     * 赠品活动ID
     */
    private Long activityId;
    /**
     * 有赞手机注册用户ID，fans_id和buyer_id至少要传一个
     */
    private Long buyerId;
    /**
     * 微信粉丝ID，fans_id和buyer_id至少要传一个
     */
    private Long fansId;

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getActivityId() {
        return this.activityId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (activityId != null) {
            params.put("activity_id", activityId);
        }
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}