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

public class YouzanUmpCouponTakeParams implements APIParams, FileParams  {

    /**
     * 优惠券码组id
     */
    private Long couponGroupId;
    /**
     * 粉丝id，fans_id与weixin_openid存在一个即可
     */
    private Long fansId;
    /**
     * mobile，weixin_openid，fans_id，open_user_id任传一个即可。首先通过mobile查找，其次weixin_openid和fans_id，最后open_user_id
     */
    private Long mobile;
    /**
     * 三方用户id
     */
    private String openUserId;
    /**
     * 微信用户对应的openid
     */
    private String weixinOpenid;

    public void setCouponGroupId(Long couponGroupId) {
        this.couponGroupId = couponGroupId;
    }

    public Long getCouponGroupId() {
        return this.couponGroupId;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Long getMobile() {
        return this.mobile;
    }

    public void setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
    }

    public String getOpenUserId() {
        return this.openUserId;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    public String getWeixinOpenid() {
        return this.weixinOpenid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (couponGroupId != null) {
            params.put("coupon_group_id", couponGroupId);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (openUserId != null) {
            params.put("open_user_id", openUserId);
        }
        if (weixinOpenid != null) {
            params.put("weixin_openid", weixinOpenid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}