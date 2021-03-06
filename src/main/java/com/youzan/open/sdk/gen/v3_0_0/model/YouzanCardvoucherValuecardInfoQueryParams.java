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

public class YouzanCardvoucherValuecardInfoQueryParams implements APIParams, FileParams  {

    /**
     * 用户buyer_id（mobile、 buyer_id 不能同时为空）
     */
    private Long buyerId;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 用户mobile（mobile、 buyer_id 不能同时为空）
     */
    private String mobile;

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (cardNo != null) {
            params.put("card_no", cardNo);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}