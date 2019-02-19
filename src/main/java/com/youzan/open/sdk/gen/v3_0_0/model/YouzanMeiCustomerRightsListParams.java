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

public class YouzanMeiCustomerRightsListParams implements APIParams, FileParams  {

    /**
     * 美业token
     */
    private String mToken;
    /**
     * 权益状态 1:可使用 2过期 3用完 -2已退款
     */
    private Long rightStatus;
    /**
     * 权益类型 1折扣 2次数
     */
    private Long rightType;
    /**
     * 过期时间类型 永久有效:0 全部:-1
     */
    private Long times;
    /**
     * 会员ID
     */
    private Long yzUid;

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setRightStatus(Long rightStatus) {
        this.rightStatus = rightStatus;
    }

    public Long getRightStatus() {
        return this.rightStatus;
    }

    public void setRightType(Long rightType) {
        this.rightType = rightType;
    }

    public Long getRightType() {
        return this.rightType;
    }

    public void setTimes(Long times) {
        this.times = times;
    }

    public Long getTimes() {
        return this.times;
    }

    public void setYzUid(Long yzUid) {
        this.yzUid = yzUid;
    }

    public Long getYzUid() {
        return this.yzUid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (rightStatus != null) {
            params.put("right_status", rightStatus);
        }
        if (rightType != null) {
            params.put("right_type", rightType);
        }
        if (times != null) {
            params.put("times", times);
        }
        if (yzUid != null) {
            params.put("yz_uid", yzUid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}