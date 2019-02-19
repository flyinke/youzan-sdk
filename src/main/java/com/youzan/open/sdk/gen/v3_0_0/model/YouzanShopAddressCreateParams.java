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

public class YouzanShopAddressCreateParams implements APIParams, FileParams  {

    /**
     * 详细地址
     */
    private String address;
    /**
     * 区
     */
    private String area;
    /**
     * 市
     */
    private String city;
    /**
     * 联系人
     */
    private String contactName;
    /**
     * 是否发票地址
     */
    private Long isInvoice;
    /**
     * 是否默认发票地址
     */
    private Long isInvoiceDefault;
    /**
     * 是否退货地址
     */
    private Long isReturn;
    /**
     * 是否默认退货地址
     */
    private Long isReturnDefault;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 省
     */
    private String province;
    /**
     * 地区id
     */
    private Long regionId;

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

    public void setIsInvoice(Long isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Long getIsInvoice() {
        return this.isInvoice;
    }

    public void setIsInvoiceDefault(Long isInvoiceDefault) {
        this.isInvoiceDefault = isInvoiceDefault;
    }

    public Long getIsInvoiceDefault() {
        return this.isInvoiceDefault;
    }

    public void setIsReturn(Long isReturn) {
        this.isReturn = isReturn;
    }

    public Long getIsReturn() {
        return this.isReturn;
    }

    public void setIsReturnDefault(Long isReturnDefault) {
        this.isReturnDefault = isReturnDefault;
    }

    public Long getIsReturnDefault() {
        return this.isReturnDefault;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return this.province;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getRegionId() {
        return this.regionId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (address != null) {
            params.put("address", address);
        }
        if (area != null) {
            params.put("area", area);
        }
        if (city != null) {
            params.put("city", city);
        }
        if (contactName != null) {
            params.put("contact_name", contactName);
        }
        if (isInvoice != null) {
            params.put("is_invoice", isInvoice);
        }
        if (isInvoiceDefault != null) {
            params.put("is_invoice_default", isInvoiceDefault);
        }
        if (isReturn != null) {
            params.put("is_return", isReturn);
        }
        if (isReturnDefault != null) {
            params.put("is_return_default", isReturnDefault);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (province != null) {
            params.put("province", province);
        }
        if (regionId != null) {
            params.put("region_id", regionId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}