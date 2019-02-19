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

public class YouzanScrmCustomerCardGrantParams implements APIParams, FileParams  {

    /**
     * 商家会员卡的唯一标识
     */
    private String cardAlias;
    /**
     * 粉丝ID，与 fans_type 同时出现，如果没有写0
mobile/fans_id/open_user_id 三选一传入
     */
    private Long fansId;
    /**
     * 粉丝类型（自有粉丝: fans_type = 1）   
     */
    private Long fansType;
    /**
     * 手机号，如果没有则传空字符串
mobile/fans_id/open_user_id 三选一传入
     */
    private String mobile;
    /**
     * 三方用户ID，如果没有则传空字符串
mobile/fans_id/open_user_id 三选一传入
     */
    private String openUserId;

    public void setCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
    }

    public String getCardAlias() {
        return this.cardAlias;
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


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (cardAlias != null) {
            params.put("card_alias", cardAlias);
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
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}