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

public class YouzanLogisticsFeeGetParams implements APIParams, FileParams  {

    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 区县名称
     */
    private String countyName;
    /**
     * 交易商品列表
     */
    private String itemParamList;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 省份名称
     */
    private String provinceName;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return this.countyName;
    }

    public void setItemParamList(String itemParamList) {
        this.itemParamList = itemParamList;
    }

    public String getItemParamList() {
        return this.itemParamList;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return this.provinceName;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (cityName != null) {
            params.put("city_name", cityName);
        }
        if (countyName != null) {
            params.put("county_name", countyName);
        }
        if (itemParamList != null) {
            params.put("item_param_list", itemParamList);
        }
        if (orderNo != null) {
            params.put("order_no", orderNo);
        }
        if (provinceName != null) {
            params.put("province_name", provinceName);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}