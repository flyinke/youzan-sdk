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

public class YouzanTradePriceUpdateParams implements APIParams, FileParams  {

    /**
     * 改价后允许是否允许买家再使用其他优惠，0 表示不允许，1 表示允许
     */
    private Long isAllowPreference;
    /**
     * 邮费价格(单位:元）
     */
    private String postFee;
    /**
     * 价格增减(单位:元）
     */
    private String priceChange;
    /**
     * 交易编号
     */
    private String tid;

    public void setIsAllowPreference(Long isAllowPreference) {
        this.isAllowPreference = isAllowPreference;
    }

    public Long getIsAllowPreference() {
        return this.isAllowPreference;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getPostFee() {
        return this.postFee;
    }

    public void setPriceChange(String priceChange) {
        this.priceChange = priceChange;
    }

    public String getPriceChange() {
        return this.priceChange;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (isAllowPreference != null) {
            params.put("is_allow_preference", isAllowPreference);
        }
        if (postFee != null) {
            params.put("post_fee", postFee);
        }
        if (priceChange != null) {
            params.put("price_change", priceChange);
        }
        if (tid != null) {
            params.put("tid", tid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}