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

public class YouzanRetailStockWarehouseUpdateParams implements APIParams, FileParams  {

    /**
     * 详细地址
     */
    private String address;
    /**
     * 城市
     */
    private String city;
    /**
     * 客服联系人姓名
     */
    private String contactName;
    /**
     * 客服联系人电话区号
     */
    private String contactPhoneCode;
    /**
     * 客服联系人电话
     */
    private String contactPhoneNum;
    /**
     * 区
     */
    private String county;
    /**
     * 区id
     */
    private Long countyId;
    /**
     * 经度
     */
    private String lat;
    /**
     * 纬度
     */
    private String lng;
    /**
     * 仓库名称
     */
    private String name;
    /**
     * 省份
     */
    private String province;
    /**
     * 备注
     */
    private String remark;
    /**
     * 来源
     */
    private String retailSource;
    /**
     * 要修改的仓库id
     */
    private Long warehouseId;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactPhoneCode(String contactPhoneCode) {
        this.contactPhoneCode = contactPhoneCode;
    }

    public String getContactPhoneCode() {
        return this.contactPhoneCode;
    }

    public void setContactPhoneNum(String contactPhoneNum) {
        this.contactPhoneNum = contactPhoneNum;
    }

    public String getContactPhoneNum() {
        return this.contactPhoneNum;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCounty() {
        return this.county;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public Long getCountyId() {
        return this.countyId;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLng() {
        return this.lng;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return this.province;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (address != null) {
            params.put("address", address);
        }
        if (city != null) {
            params.put("city", city);
        }
        if (contactName != null) {
            params.put("contact_name", contactName);
        }
        if (contactPhoneCode != null) {
            params.put("contact_phone_code", contactPhoneCode);
        }
        if (contactPhoneNum != null) {
            params.put("contact_phone_num", contactPhoneNum);
        }
        if (county != null) {
            params.put("county", county);
        }
        if (countyId != null) {
            params.put("county_id", countyId);
        }
        if (lat != null) {
            params.put("lat", lat);
        }
        if (lng != null) {
            params.put("lng", lng);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (province != null) {
            params.put("province", province);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (warehouseId != null) {
            params.put("warehouse_id", warehouseId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}