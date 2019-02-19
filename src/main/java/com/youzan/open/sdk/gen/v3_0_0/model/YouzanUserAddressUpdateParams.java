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

public class YouzanUserAddressUpdateParams implements APIParams, FileParams  {

    /**
     * 详细地址
     */
    private String addressDetail;
    /**
     * 区号
     */
    private String areaCode;
    /**
     * 城市
     */
    private String city;
    /**
     * 组织
     */
    private String community;
    /**
     * 区
     */
    private String county;
    /**
     * 地址ID
     */
    private Long id;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 经度
     */
    private String lon;
    /**
     * 邮政编码
     */
    private String postalCode;
    /**
     * 省份
     */
    private String province;
    /**
     * 手机号码
     */
    private String tel;
    /**
     * 用户名称
     */
    private String userName;

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAddressDetail() {
        return this.addressDetail;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCommunity() {
        return this.community;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCounty() {
        return this.county;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLon() {
        return this.lon;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return this.province;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (addressDetail != null) {
            params.put("address_detail", addressDetail);
        }
        if (areaCode != null) {
            params.put("area_code", areaCode);
        }
        if (city != null) {
            params.put("city", city);
        }
        if (community != null) {
            params.put("community", community);
        }
        if (county != null) {
            params.put("county", county);
        }
        if (id != null) {
            params.put("id", id);
        }
        if (lat != null) {
            params.put("lat", lat);
        }
        if (lon != null) {
            params.put("lon", lon);
        }
        if (postalCode != null) {
            params.put("postal_code", postalCode);
        }
        if (province != null) {
            params.put("province", province);
        }
        if (tel != null) {
            params.put("tel", tel);
        }
        if (userName != null) {
            params.put("user_name", userName);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}