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

public class YouzanRetailStockVendorGetResult implements APIResult {

    @JsonProperty(value = "vendor_vo")
    /**
     * 供应商VO
     */
    private VendorVO vendorVo;

    public void setVendorVo(VendorVO vendorVo) {
        this.vendorVo = vendorVo;
    }

    public VendorVO getVendorVo() {
        return this.vendorVo;
    }

    public static class VendorVO {
            @JsonProperty(value = "qq")
        /**
        * qq
        */
        private String qq;
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
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "remark")
        /**
        * 备注
        */
        private String remark;
            @JsonProperty(value = "wei_xin")
        /**
        * 微信
        */
        private String weiXin;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Long updatedAt;
            @JsonProperty(value = "sno")
        /**
        * 供应商编码
        */
        private String sno;
            @JsonProperty(value = "phone")
        /**
        * 电话
        */
        private String phone;
            @JsonProperty(value = "vendor_id")
        /**
        * 供应商id
        */
        private Long vendorId;
            @JsonProperty(value = "name")
        /**
        * 供应商名称
        */
        private String name;
            @JsonProperty(value = "fax")
        /**
        * 传真
        */
        private String fax;
            @JsonProperty(value = "contacts")
        /**
        * 联系人名称
        */
        private String contacts;
            @JsonProperty(value = "email")
        /**
        * 邮箱
        */
        private String email;
            @JsonProperty(value = "status")
        /**
        * 状态
        */
        private Long status;
    
            public void setQq(String qq) {
            this.qq = qq;
        }

        public String getQq() {
            return this.qq;
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

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
        }

            public void setWeiXin(String weiXin) {
            this.weiXin = weiXin;
        }

        public String getWeiXin() {
            return this.weiXin;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

            public void setSno(String sno) {
            this.sno = sno;
        }

        public String getSno() {
            return this.sno;
        }

            public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return this.phone;
        }

            public void setVendorId(Long vendorId) {
            this.vendorId = vendorId;
        }

        public Long getVendorId() {
            return this.vendorId;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setFax(String fax) {
            this.fax = fax;
        }

        public String getFax() {
            return this.fax;
        }

            public void setContacts(String contacts) {
            this.contacts = contacts;
        }

        public String getContacts() {
            return this.contacts;
        }

            public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return this.email;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

        }


}