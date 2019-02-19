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

public class YouzanUserAddressGetResult implements APIResult {

    @JsonProperty(value = "country")
    /**
     * 国家
     */
    private String country;
    @JsonProperty(value = "city")
    /**
     * 城市
     */
    private String city;
    @JsonProperty(value = "user_name")
    /**
     * 收货人
     */
    private String userName;
    @JsonProperty(value = "area_code")
    /**
     * 区域码
     */
    private String areaCode;
    @JsonProperty(value = "county")
    /**
     * 区
     */
    private String county;
    @JsonProperty(value = "lon")
    /**
     * 经度
     */
    private String lon;
    @JsonProperty(value = "lat")
    /**
     * 纬度
     */
    private String lat;
    @JsonProperty(value = "community")
    /**
     * 社区
     */
    private String community;
    @JsonProperty(value = "is_default")
    /**
     * 默认地址
     */
    private Long isDefault;
    @JsonProperty(value = "address_detail")
    /**
     * 地址详情
     */
    private String addressDetail;
    @JsonProperty(value = "province")
    /**
     * 省份
     */
    private String province;
    @JsonProperty(value = "user_id")
    /**
     * 帐号id
     */
    private Long userId;
    @JsonProperty(value = "tel")
    /**
     * 联系人电话
     */
    private String tel;
    @JsonProperty(value = "id")
    /**
     * 地址id
     */
    private Long id;
    @JsonProperty(value = "postal_code")
    /**
     * 邮政编码
     */
    private String postalCode;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }
    public void setCounty(String county) {
        this.county = county;
    }

    public String getCounty() {
        return this.county;
    }
    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLon() {
        return this.lon;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return this.lat;
    }
    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCommunity() {
        return this.community;
    }
    public void setIsDefault(Long isDefault) {
        this.isDefault = isDefault;
    }

    public Long getIsDefault() {
        return this.isDefault;
    }
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAddressDetail() {
        return this.addressDetail;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return this.province;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return this.postalCode;
    }


}