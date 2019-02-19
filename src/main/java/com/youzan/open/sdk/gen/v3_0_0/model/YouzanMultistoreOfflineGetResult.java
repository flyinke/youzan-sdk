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

public class YouzanMultistoreOfflineGetResult implements APIResult {

    @JsonProperty(value = "id")
    /**
     * 网点id
     */
    private Long id;
    @JsonProperty(value = "name")
    /**
     * 网点名称
     */
    private String name;
    @JsonProperty(value = "is_store")
    /**
     * 是否是门店。只有是门店才能设置同城配送
     */
    private Long isStore;
    @JsonProperty(value = "is_self_fetch")
    /**
     * 是否是自提点。只有是自提点才能设置到店自提
     */
    private Long isSelfFetch;
    @JsonProperty(value = "support_local_delivery")
    /**
     * 是否支持同城配送
     */
    private Long supportLocalDelivery;
    @JsonProperty(value = "local_delivery_scope")
    /**
     * 同城配送范围，单位米。
     */
    private Long localDeliveryScope;
    @JsonProperty(value = "local_delivery_start_amount")
    /**
     * 同城配送起送金额，单位分
     */
    private Long localDeliveryStartAmount;
    @JsonProperty(value = "local_delivery_fee")
    /**
     * 同城配送费，单位分
     */
    private Long localDeliveryFee;
    @JsonProperty(value = "phone1")
    /**
     * 电话区号
     */
    private String phone1;
    @JsonProperty(value = "phone2")
    /**
     * 电话号码
     */
    private String phone2;
    @JsonProperty(value = "province")
    /**
     * 省
     */
    private String province;
    @JsonProperty(value = "city")
    /**
     * 市
     */
    private String city;
    @JsonProperty(value = "area")
    /**
     * 区
     */
    private String area;
    @JsonProperty(value = "address")
    /**
     * 详细地址
     */
    private String address;
    @JsonProperty(value = "county_id")
    /**
     * 省市区编码
     */
    private Long countyId;
    @JsonProperty(value = "lng")
    /**
     * 经度
     */
    private String lng;
    @JsonProperty(value = "lat")
    /**
     * 纬度
     */
    private String lat;
    @JsonProperty(value = "business_hours_advanced")
    /**
     * 营业时间设置数组
     */
    private String businessHoursAdvanced;
    @JsonProperty(value = "image")
    /**
     * 图片链接数组
     */
    private String[] image;
    @JsonProperty(value = "description")
    /**
     * 网点描述
     */
    private String description;
    @JsonProperty(value = "tag_ids")
    /**
     * 网点标签集合
     */
    private OfflineTagIdAndNameDTO[] tagIds;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setIsStore(Long isStore) {
        this.isStore = isStore;
    }

    public Long getIsStore() {
        return this.isStore;
    }
    public void setIsSelfFetch(Long isSelfFetch) {
        this.isSelfFetch = isSelfFetch;
    }

    public Long getIsSelfFetch() {
        return this.isSelfFetch;
    }
    public void setSupportLocalDelivery(Long supportLocalDelivery) {
        this.supportLocalDelivery = supportLocalDelivery;
    }

    public Long getSupportLocalDelivery() {
        return this.supportLocalDelivery;
    }
    public void setLocalDeliveryScope(Long localDeliveryScope) {
        this.localDeliveryScope = localDeliveryScope;
    }

    public Long getLocalDeliveryScope() {
        return this.localDeliveryScope;
    }
    public void setLocalDeliveryStartAmount(Long localDeliveryStartAmount) {
        this.localDeliveryStartAmount = localDeliveryStartAmount;
    }

    public Long getLocalDeliveryStartAmount() {
        return this.localDeliveryStartAmount;
    }
    public void setLocalDeliveryFee(Long localDeliveryFee) {
        this.localDeliveryFee = localDeliveryFee;
    }

    public Long getLocalDeliveryFee() {
        return this.localDeliveryFee;
    }
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone1() {
        return this.phone1;
    }
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone2() {
        return this.phone2;
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
    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public Long getCountyId() {
        return this.countyId;
    }
    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLng() {
        return this.lng;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return this.lat;
    }
    public void setBusinessHoursAdvanced(String businessHoursAdvanced) {
        this.businessHoursAdvanced = businessHoursAdvanced;
    }

    public String getBusinessHoursAdvanced() {
        return this.businessHoursAdvanced;
    }
    public void setImage(String[] image) {
        this.image = image;
    }

    public String[] getImage() {
        return this.image;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public void setTagIds(OfflineTagIdAndNameDTO[] tagIds) {
        this.tagIds = tagIds;
    }

    public OfflineTagIdAndNameDTO[] getTagIds() {
        return this.tagIds;
    }

    public static class OfflineTagIdAndNameDTO {
            @JsonProperty(value = "id")
        /**
        * 标签id
        */
        private Long id;
            @JsonProperty(value = "name")
        /**
        * 标签名称
        */
        private String name;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        }


}