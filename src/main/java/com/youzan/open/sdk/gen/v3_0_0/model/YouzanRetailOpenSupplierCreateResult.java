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

public class YouzanRetailOpenSupplierCreateResult implements APIResult {

    @JsonProperty(value = "supplier_name")
    /**
     * 供应商名称	
     */
    private String supplierName;
    @JsonProperty(value = "supplier_code")
    /**
     * 供应商编码	
     */
    private String supplierCode;
    @JsonProperty(value = "phone")
    /**
     * 公司电话	
     */
    private String phone;
    @JsonProperty(value = "contacts")
    /**
     * 联系人	
     */
    private String contacts;
    @JsonProperty(value = "contacts_phone")
    /**
     * 联系人电话	
     */
    private String contactsPhone;
    @JsonProperty(value = "address")
    /**
     * 地址
     */
    private String address;
    @JsonProperty(value = "remark")
    /**
     * 备注
     */
    private String remark;
    @JsonProperty(value = "qq")
    /**
     * qq号	
     */
    private String qq;
    @JsonProperty(value = "wei_xin")
    /**
     * 微信号	
     */
    private String weiXin;
    @JsonProperty(value = "fax")
    /**
     * 传真	
     */
    private String fax;
    @JsonProperty(value = "email")
    /**
     * 邮箱
     */
    private String email;

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return this.supplierName;
    }
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierCode() {
        return this.supplierCode;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContacts() {
        return this.contacts;
    }
    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsPhone() {
        return this.contactsPhone;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQq() {
        return this.qq;
    }
    public void setWeiXin(String weiXin) {
        this.weiXin = weiXin;
    }

    public String getWeiXin() {
        return this.weiXin;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFax() {
        return this.fax;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }


}