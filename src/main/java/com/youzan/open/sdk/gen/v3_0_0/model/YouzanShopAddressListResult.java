package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanShopAddressListResult implements APIResult {

    @JsonProperty(value = "total")
    /**
     * 地址总数
     */
    private Long total;
    @JsonProperty(value = "list")
    /**
     * 地址列表
     */
    private ShopAddress[] list;

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
    }
    public void setList(ShopAddress[] list) {
        this.list = list;
    }

    public ShopAddress[] getList() {
        return this.list;
    }

    public static class ShopAddress {
            @JsonProperty(value = "areaCode")
        /**
        * 地区id
        */
        private String areaCode;
            @JsonProperty(value = "province")
        /**
        * 省份
        */
        private String province;
            @JsonProperty(value = "city")
        /**
        * 城市
        */
        private String city;
            @JsonProperty(value = "district")
        /**
        * 街道
        */
        private String district;
            @JsonProperty(value = "detailedAddress")
        /**
        * 详细地址
        */
        private String detailedAddress;
            @JsonProperty(value = "latitude")
        /**
        * 改地址在地图上的维度
        */
        private Long latitude;
            @JsonProperty(value = "longitude")
        /**
        * 改地址在地图上的精度精度
        */
        private Long longitude;
    
            public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getAreaCode() {
            return this.areaCode;
        }

            public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }

            public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

            public void setDistrict(String district) {
            this.district = district;
        }

        public String getDistrict() {
            return this.district;
        }

            public void setDetailedAddress(String detailedAddress) {
            this.detailedAddress = detailedAddress;
        }

        public String getDetailedAddress() {
            return this.detailedAddress;
        }

            public void setLatitude(Long latitude) {
            this.latitude = latitude;
        }

        public Long getLatitude() {
            return this.latitude;
        }

            public void setLongitude(Long longitude) {
            this.longitude = longitude;
        }

        public Long getLongitude() {
            return this.longitude;
        }

        }


}