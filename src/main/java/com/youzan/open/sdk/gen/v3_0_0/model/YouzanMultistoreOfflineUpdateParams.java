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

public class YouzanMultistoreOfflineUpdateParams implements APIParams, FileParams  {

    /**
     * 详细地址
     */
    private String address;
    /**
     * 区
     */
    private String area;
    /**
     * 营业时间,按天设置。示例[{"open_time":"00:10","close_time":"16:00","weekdays":["周一","周二","周三","周四","周五"]},{"open_time":"00:10","close_time":"20:00","weekdays":["周六","周日"]}]
     */
    private String businessHoursAdvanced;
    /**
     * 市
     */
    private String city;
    /**
     * 行政区划代码。参考高德城市编码表 http://lbs.amap.com/api/webservice/download
     */
    private String countyId;
    /**
     * 描述
     */
    private String description;
    /**
     * id
     */
    private Long id;
    /**
     * 图片地址，逗号分隔
     */
    private String image;
    /**
     * 是否需要买家选择自提时间。1表示需要，0表示不需要
     */
    private Long isOptionalSelfFetchTime;
    /**
     * 是否是自提点。1表示是，0表示否
     */
    private Long isSelfFetch;
    /**
     * 是否是门店。1表示是，0表示否
     */
    private Long isStore;
    /**
     * 纬度（百度坐标系）
     */
    private String lat;
    /**
     * 经度（百度坐标系）
     */
    private String lng;
    /**
     * 配送费，单位分
     */
    private Long localDeliveryFee;
    /**
     * 同城配送范围多边形,只有当local_delivery_scope_type=2时生效。格式如：点1经度,点1纬度|点2经度,点2纬度|点3经度，点3纬度|点4经度，点4纬度...（百度坐标系）
     */
    private String localDeliveryPolygon;
    /**
     * 配送范围
     */
    private Long localDeliveryScope;
    /**
     * 同城配送范围划分方式：1半径 2多边形
     */
    private Long localDeliveryScopeType;
    /**
     * 起送金额
     */
    private Long localDeliveryStartAmount;
    /**
     * 网点名称
     */
    private String name;
    /**
     * 线下自提时间。格式同business_hours_advanced
     */
    private String offlineBusinessHours;
    /**
     * 区号
     */
    private String phone1;
    /**
     * 电话号码
     */
    private String phone2;
    /**
     * 省
     */
    private String province;
    /**
     * 是否支持本地配送。1表示支持，0表示不支持
     */
    private Long supportLocalDelivery;
    /**
     * 标签id列表，逗号分隔。需要先创建网点分组
     */
    private String tagIds;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setBusinessHoursAdvanced(String businessHoursAdvanced) {
        this.businessHoursAdvanced = businessHoursAdvanced;
    }

    public String getBusinessHoursAdvanced() {
        return this.businessHoursAdvanced;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    public String getCountyId() {
        return this.countyId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }

    public void setIsOptionalSelfFetchTime(Long isOptionalSelfFetchTime) {
        this.isOptionalSelfFetchTime = isOptionalSelfFetchTime;
    }

    public Long getIsOptionalSelfFetchTime() {
        return this.isOptionalSelfFetchTime;
    }

    public void setIsSelfFetch(Long isSelfFetch) {
        this.isSelfFetch = isSelfFetch;
    }

    public Long getIsSelfFetch() {
        return this.isSelfFetch;
    }

    public void setIsStore(Long isStore) {
        this.isStore = isStore;
    }

    public Long getIsStore() {
        return this.isStore;
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

    public void setLocalDeliveryFee(Long localDeliveryFee) {
        this.localDeliveryFee = localDeliveryFee;
    }

    public Long getLocalDeliveryFee() {
        return this.localDeliveryFee;
    }

    public void setLocalDeliveryPolygon(String localDeliveryPolygon) {
        this.localDeliveryPolygon = localDeliveryPolygon;
    }

    public String getLocalDeliveryPolygon() {
        return this.localDeliveryPolygon;
    }

    public void setLocalDeliveryScope(Long localDeliveryScope) {
        this.localDeliveryScope = localDeliveryScope;
    }

    public Long getLocalDeliveryScope() {
        return this.localDeliveryScope;
    }

    public void setLocalDeliveryScopeType(Long localDeliveryScopeType) {
        this.localDeliveryScopeType = localDeliveryScopeType;
    }

    public Long getLocalDeliveryScopeType() {
        return this.localDeliveryScopeType;
    }

    public void setLocalDeliveryStartAmount(Long localDeliveryStartAmount) {
        this.localDeliveryStartAmount = localDeliveryStartAmount;
    }

    public Long getLocalDeliveryStartAmount() {
        return this.localDeliveryStartAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOfflineBusinessHours(String offlineBusinessHours) {
        this.offlineBusinessHours = offlineBusinessHours;
    }

    public String getOfflineBusinessHours() {
        return this.offlineBusinessHours;
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

    public void setSupportLocalDelivery(Long supportLocalDelivery) {
        this.supportLocalDelivery = supportLocalDelivery;
    }

    public Long getSupportLocalDelivery() {
        return this.supportLocalDelivery;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getTagIds() {
        return this.tagIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (address != null) {
            params.put("address", address);
        }
        if (area != null) {
            params.put("area", area);
        }
        if (businessHoursAdvanced != null) {
            params.put("business_hours_advanced", businessHoursAdvanced);
        }
        if (city != null) {
            params.put("city", city);
        }
        if (countyId != null) {
            params.put("county_id", countyId);
        }
        if (description != null) {
            params.put("description", description);
        }
        if (id != null) {
            params.put("id", id);
        }
        if (image != null) {
            params.put("image", image);
        }
        if (isOptionalSelfFetchTime != null) {
            params.put("is_optional_self_fetch_time", isOptionalSelfFetchTime);
        }
        if (isSelfFetch != null) {
            params.put("is_self_fetch", isSelfFetch);
        }
        if (isStore != null) {
            params.put("is_store", isStore);
        }
        if (lat != null) {
            params.put("lat", lat);
        }
        if (lng != null) {
            params.put("lng", lng);
        }
        if (localDeliveryFee != null) {
            params.put("local_delivery_fee", localDeliveryFee);
        }
        if (localDeliveryPolygon != null) {
            params.put("local_delivery_polygon", localDeliveryPolygon);
        }
        if (localDeliveryScope != null) {
            params.put("local_delivery_scope", localDeliveryScope);
        }
        if (localDeliveryScopeType != null) {
            params.put("local_delivery_scope_type", localDeliveryScopeType);
        }
        if (localDeliveryStartAmount != null) {
            params.put("local_delivery_start_amount", localDeliveryStartAmount);
        }
        if (name != null) {
            params.put("name", name);
        }
        if (offlineBusinessHours != null) {
            params.put("offline_business_hours", offlineBusinessHours);
        }
        if (phone1 != null) {
            params.put("phone1", phone1);
        }
        if (phone2 != null) {
            params.put("phone2", phone2);
        }
        if (province != null) {
            params.put("province", province);
        }
        if (supportLocalDelivery != null) {
            params.put("support_local_delivery", supportLocalDelivery);
        }
        if (tagIds != null) {
            params.put("tag_ids", tagIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}