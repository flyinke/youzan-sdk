package com.youzan.open.sdk.gen.v3_0_1.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanCrmCustomerPointsDecreaseParams implements APIParams, FileParams  {

    /**
     * 商家签名模式调用接口时的app_id, 若无则无需填写。
     */
    private String appId;
    /**
     * 粉丝id
mobile/fans_id/open_user_id 三选一传入
     */
    private Long fansId;
    /**
     * 粉丝类型（自有粉丝: fans_type = 1）
     */
    private Long fansType;
    /**
     * 用户手机号
mobile/fans_id/open_user_id 三选一传入
     */
    private String mobile;
    /**
     * 三方用户ID
mobile/fans_id/open_user_id 三选一传入
     */
    private String openUserId;
    /**
     * 积分数
     */
    private Long points;
    /**
     * 减少理由
     */
    private String reason;

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }

    public void setFansType(Long fansType) {
        this.fansType = fansType;
    }

    public Long getFansType() {
        return this.fansType;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
    }

    public String getOpenUserId() {
        return this.openUserId;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public Long getPoints() {
        return this.points;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return this.reason;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (appId != null) {
            params.put("app_id", appId);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (fansType != null) {
            params.put("fans_type", fansType);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (openUserId != null) {
            params.put("open_user_id", openUserId);
        }
        if (points != null) {
            params.put("points", points);
        }
        if (reason != null) {
            params.put("reason", reason);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}