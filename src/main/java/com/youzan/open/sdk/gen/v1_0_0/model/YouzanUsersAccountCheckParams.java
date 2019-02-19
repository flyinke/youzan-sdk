package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanUsersAccountCheckParams implements APIParams, FileParams  {

    /**
     * 帐号ID
     */
    private String accountId;
    /**
     * 帐号类型，支持Mobile和UnionId
     */
    private String accountType;

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (accountId != null) {
            params.put("account_id", accountId);
        }
        if (accountType != null) {
            params.put("account_type", accountType);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}