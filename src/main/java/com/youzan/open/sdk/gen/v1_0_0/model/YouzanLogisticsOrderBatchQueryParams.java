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

public class YouzanLogisticsOrderBatchQueryParams implements APIParams, FileParams  {

    /**
     * 请求参数list
     */
    private String orderDetailParams;

    public void setOrderDetailParams(String orderDetailParams) {
        this.orderDetailParams = orderDetailParams;
    }

    public String getOrderDetailParams() {
        return this.orderDetailParams;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (orderDetailParams != null) {
            params.put("order_detail_params", orderDetailParams);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}