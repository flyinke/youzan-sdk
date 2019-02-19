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

public class YouzanScrmCustomerCreateParams implements APIParams, FileParams  {

    /**
     * 创建客户所需信息
     */
    private String customerCreate;
    /**
     * 注册手机号
     */
    private String mobile;

    public void setCustomerCreate(String customerCreate) {
        this.customerCreate = customerCreate;
    }

    public String getCustomerCreate() {
        return this.customerCreate;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (customerCreate != null) {
            params.put("customer_create", customerCreate);
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