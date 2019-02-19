package com.youzan.open.sdk.gen.v3_1_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanScrmCustomerGetParams implements APIParams, FileParams  {

    /**
     * 用户帐号信息（{"account_type":"Mobile", "account_id":"1385716120"}）
     */
    private String account;

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (account != null) {
            params.put("account", account);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}