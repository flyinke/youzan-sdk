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

public class YouzanMeiPromoterCustomerBindUpdateParams implements APIParams, FileParams  {

    /**
     * 要绑定的顾客手机号列表
     */
    private String customerMobiles;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 被绑定的推广员id
     */
    private String pid;

    public void setCustomerMobiles(String customerMobiles) {
        this.customerMobiles = customerMobiles;
    }

    public String getCustomerMobiles() {
        return this.customerMobiles;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return this.pid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (customerMobiles != null) {
            params.put("customer_mobiles", customerMobiles);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (pid != null) {
            params.put("pid", pid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}