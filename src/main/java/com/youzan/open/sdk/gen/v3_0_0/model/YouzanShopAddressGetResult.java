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

public class YouzanShopAddressGetResult implements APIResult {

    @JsonProperty(value = "id")
    /**
     * 地址id
     */
    private Long id;
    @JsonProperty(value = "contact_name")
    /**
     * 联系人
     */
    private String contactName;
    @JsonProperty(value = "mobile")
    /**
     * 联系手机号
     */
    private String mobile;
    @JsonProperty(value = "region_type")
    /**
     * 地区类型
     */
    private String regionType;
    @JsonProperty(value = "region_id")
    /**
     * 地区id
     */
    private Long regionId;
    @JsonProperty(value = "area")
    /**
     * 省市区
     */
    private String area;
    @JsonProperty(value = "address")
    /**
     * 详细地址
     */
    private String address;
    @JsonProperty(value = "is_return")
    /**
     * 是否是退货地址
     */
    private Long isReturn;
    @JsonProperty(value = "is_invoice")
    /**
     * 是否是发票地址
     */
    private Long isInvoice;
    @JsonProperty(value = "is_return_default")
    /**
     * 是否是默认退货地址
     */
    private Long isReturnDefault;
    @JsonProperty(value = "is_invoice_default")
    /**
     * 是否是默认发票地址
     */
    private Long isInvoiceDefault;
    @JsonProperty(value = "country_code")
    /**
     * 手机区号
     */
    private String countryCode;
    @JsonProperty(value = "created_at")
    /**
     * 创建时间
     */
    private String createdAt;
    @JsonProperty(value = "updated_at")
    /**
     * 更新时间
     */
    private String updatedAt;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return this.contactName;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getRegionType() {
        return this.regionType;
    }
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getRegionId() {
        return this.regionId;
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
    public void setIsReturn(Long isReturn) {
        this.isReturn = isReturn;
    }

    public Long getIsReturn() {
        return this.isReturn;
    }
    public void setIsInvoice(Long isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Long getIsInvoice() {
        return this.isInvoice;
    }
    public void setIsReturnDefault(Long isReturnDefault) {
        this.isReturnDefault = isReturnDefault;
    }

    public Long getIsReturnDefault() {
        return this.isReturnDefault;
    }
    public void setIsInvoiceDefault(Long isInvoiceDefault) {
        this.isInvoiceDefault = isInvoiceDefault;
    }

    public Long getIsInvoiceDefault() {
        return this.isInvoiceDefault;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return this.countryCode;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }


}