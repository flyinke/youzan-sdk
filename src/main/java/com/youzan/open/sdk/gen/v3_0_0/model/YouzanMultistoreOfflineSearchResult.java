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

public class YouzanMultistoreOfflineSearchResult implements APIResult {

    @JsonProperty(value = "list")
    /**
     * 网点信息列表
     */
    private AccountShopOffline[] list;
    @JsonProperty(value = "count")
    /**
     * 总数
     */
    private Long count;

    public void setList(AccountShopOffline[] list) {
        this.list = list;
    }

    public AccountShopOffline[] getList() {
        return this.list;
    }
    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }

    public static class AccountShopOffline {
            @JsonProperty(value = "image")
        /**
        * 网点图片
        */
        private Object image;
            @JsonProperty(value = "created_time")
        /**
        * 创建时间
        */
        private Date createdTime;
            @JsonProperty(value = "county_id")
        /**
        * 邮编
        */
        private String countyId;
            @JsonProperty(value = "business_hours_advanced")
        /**
        * 营业时间,按天设置
        */
        private Object businessHoursAdvanced;
            @JsonProperty(value = "lng")
        /**
        * 经度
        */
        private String lng;
            @JsonProperty(value = "id")
        /**
        * 网点编号
        */
        private Long id;
            @JsonProperty(value = "city")
        /**
        * 市
        */
        private String city;
            @JsonProperty(value = "is_store")
        /**
        * 是否是门店
        */
        private Long isStore;
            @JsonProperty(value = "area")
        /**
        * 区
        */
        private String area;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺编号（推荐使用sid）
        */
        private Long kdtId;
            @JsonProperty(value = "is_self_fetch")
        /**
        * 是否是自提点
        */
        private Long isSelfFetch;
            @JsonProperty(value = "sid")
        /**
        * 店铺编号
        */
        private Long sid;
            @JsonProperty(value = "image_thumb")
        /**
        * 网点索引图片
        */
        private Object imageThumb;
            @JsonProperty(value = "province")
        /**
        * 省
        */
        private String province;
            @JsonProperty(value = "description")
        /**
        * 描述
        */
        private String description;
            @JsonProperty(value = "phone2")
        /**
        * 电话号码
        */
        private String phone2;
            @JsonProperty(value = "phone1")
        /**
        * 区号
        */
        private String phone1;
            @JsonProperty(value = "address")
        /**
        * 地址
        */
        private String address;
            @JsonProperty(value = "lat")
        /**
        * 纬度
        */
        private String lat;
            @JsonProperty(value = "business_hours")
        /**
        * 营业时间,不推荐使用
        */
        private String businessHours;
            @JsonProperty(value = "name")
        /**
        * 网点名
        */
        private String name;
            @JsonProperty(value = "updated_time")
        /**
        * 创建时间
        */
        private Date updatedTime;
    
            public void setImage(Object image) {
            this.image = image;
        }

        public Object getImage() {
            return this.image;
        }

            public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        public Date getCreatedTime() {
            return this.createdTime;
        }

            public void setCountyId(String countyId) {
            this.countyId = countyId;
        }

        public String getCountyId() {
            return this.countyId;
        }

            public void setBusinessHoursAdvanced(Object businessHoursAdvanced) {
            this.businessHoursAdvanced = businessHoursAdvanced;
        }

        public Object getBusinessHoursAdvanced() {
            return this.businessHoursAdvanced;
        }

            public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLng() {
            return this.lng;
        }

            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

            public void setIsStore(Long isStore) {
            this.isStore = isStore;
        }

        public Long getIsStore() {
            return this.isStore;
        }

            public void setArea(String area) {
            this.area = area;
        }

        public String getArea() {
            return this.area;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setIsSelfFetch(Long isSelfFetch) {
            this.isSelfFetch = isSelfFetch;
        }

        public Long getIsSelfFetch() {
            return this.isSelfFetch;
        }

            public void setSid(Long sid) {
            this.sid = sid;
        }

        public Long getSid() {
            return this.sid;
        }

            public void setImageThumb(Object imageThumb) {
            this.imageThumb = imageThumb;
        }

        public Object getImageThumb() {
            return this.imageThumb;
        }

            public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }

            public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

            public void setPhone2(String phone2) {
            this.phone2 = phone2;
        }

        public String getPhone2() {
            return this.phone2;
        }

            public void setPhone1(String phone1) {
            this.phone1 = phone1;
        }

        public String getPhone1() {
            return this.phone1;
        }

            public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return this.address;
        }

            public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLat() {
            return this.lat;
        }

            public void setBusinessHours(String businessHours) {
            this.businessHours = businessHours;
        }

        public String getBusinessHours() {
            return this.businessHours;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setUpdatedTime(Date updatedTime) {
            this.updatedTime = updatedTime;
        }

        public Date getUpdatedTime() {
            return this.updatedTime;
        }

        }


}