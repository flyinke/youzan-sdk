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

public class YouzanRetailStockVendorCreateParams implements APIParams, FileParams  {

    /**
     * 地址
     */
    private String address;
    /**
     * 联系人名称
     */
    private String contacts;
    /**
     * 联系人电话
     */
    private String contactsPhone;
    /**
     * 邮件
     */
    private String email;
    /**
     * 传真
     */
    private String fax;
    /**
     * 供应商名称
     */
    private String name;
    /**
     * 公司电话
     */
    private String phone;
    /**
     * qq号码
     */
    private String qq;
    /**
     * 备注
     */
    private String remark;
    /**
     * 供应商编码
     */
    private String sno;
    /**
     * 调用来源
     */
    private String source;
    /**
     * 是否启用  0 启用 1 禁用
     */
    private Long status;
    /**
     * 微信号码
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSno() {
        return this.sno;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
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
        if (name != null) {
            params.put("name", name);
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
        if (sno != null) {
            params.put("sno", sno);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (status != null) {
            params.put("status", status);
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