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

public class YouzanUmpPromocodeBuyerSearchParams implements APIParams, FileParams  {

    /**
     * fans_id
     */
    private Long fansId;
    /**
     * fans_type
     */
    private Long fansType;
    /**
     * 手机号
     */
    private Long mobile;
    /**
     * open_user_id
     */
    private String openUserId;
    /**
     * VALID 有效（未使用） USED 已使用 INVALID 已失效
     */
    private String status;

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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
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
        if (status != null) {
            params.put("status", status);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}