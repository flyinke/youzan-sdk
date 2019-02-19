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

public class YouzanScrmCustomerUpdateParams implements APIParams, FileParams  {

    /**
     * 用户帐号信息
     */
    private String account;
    /**
     * 更新客户所需信息
     */
    private String customerUpdate;

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }

    public void setCustomerUpdate(String customerUpdate) {
        this.customerUpdate = customerUpdate;
    }

    public String getCustomerUpdate() {
        return this.customerUpdate;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (account != null) {
            params.put("account", account);
        }
        if (customerUpdate != null) {
            params.put("customer_update", customerUpdate);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}