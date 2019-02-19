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

public class YouzanRetailOpenDeliveryorderGetParams implements APIParams, FileParams  {

    /**
     * 发货单号
     */
    private String deliveryOrderNo;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;

    public void setDeliveryOrderNo(String deliveryOrderNo) {
        this.deliveryOrderNo = deliveryOrderNo;
    }

    public String getDeliveryOrderNo() {
        return this.deliveryOrderNo;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (deliveryOrderNo != null) {
            params.put("delivery_order_no", deliveryOrderNo);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}