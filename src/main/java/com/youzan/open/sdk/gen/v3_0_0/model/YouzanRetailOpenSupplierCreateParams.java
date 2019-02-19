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

public class YouzanRetailOpenSupplierCreateParams implements APIParams, FileParams  {

    /**
     * 地址
     */
    private String address;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系人电话
     */
    private String contactsPhone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 传真	
     */
    private String fax;
    /**
     * 公司电话	
     */
    private String phone;
    /**
     * qq号	
     */
    private String qq;
    /**
     * 备注
     */
    private String remark;
    /**
     * 零售调用来源(调用方和有赞约定的值)
     */
    private String retailSource;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 微信号	
     */
    private String weiXin;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFax() {
        return this.fax;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQq() {
        return this.qq;
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

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    public void setWeiXin(String weiXin) {
        this.weiXin = weiXin;
    }

    public String getWeiXin() {
        return this.weiXin;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (address != null) {
            params.put("address", address);
        }
        if (contacts != null) {
            params.put("contacts", contacts);
        }
        if (contactsPhone != null) {
            params.put("contacts_phone", contactsPhone);
        }
        if (email != null) {
            params.put("email", email);
        }
        if (fax != null) {
            params.put("fax", fax);
        }
        if (phone != null) {
            params.put("phone", phone);
        }
        if (qq != null) {
            params.put("qq", qq);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (supplierName != null) {
            params.put("supplier_name", supplierName);
        }
        if (weiXin != null) {
            params.put("wei_xin", weiXin);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}