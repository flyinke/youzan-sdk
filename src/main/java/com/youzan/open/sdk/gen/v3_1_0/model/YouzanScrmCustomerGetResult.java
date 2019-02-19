package com.youzan.open.sdk.gen.v3_1_0.model;

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

public class YouzanScrmCustomerGetResult implements APIResult {

    @JsonProperty(value = "name")
    /**
     * 姓名
     */
    private String name;
    @JsonProperty(value = "gender")
    /**
     * 性别。0:未知；1:男；2:女
     */
    private Long gender;
    @JsonProperty(value = "birthday")
    /**
     * 生日
     */
    private String birthday;
    @JsonProperty(value = "mobile")
    /**
     * 手机号
     */
    private String mobile;
    @JsonProperty(value = "is_member")
    /**
     * 是否为会员
     */
    private Boolean isMember;
    @JsonProperty(value = "contact_address")
    /**
     * 联系地址
     */
    private ContactAddress contactAddress;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setGender(Long gender) {
        this.gender = gender;
    }

    public Long getGender() {
        return this.gender;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return this.birthday;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }

    public Boolean getIsMember() {
        return this.isMember;
    }
    public void setContactAddress(ContactAddress contactAddress) {
        this.contactAddress = contactAddress;
    }

    public ContactAddress getContactAddress() {
        return this.contactAddress;
    }

    public static class ContactAddress {
            @JsonProperty(value = "areaCode")
        /**
        * 地域编码
        */
        private Long areaCode;
            @JsonProperty(value = "province")
        /**
        * 省份
        */
        private String province;
            @JsonProperty(value = "city")
        /**
        * 地级市
        */
        private String city;
            @JsonProperty(value = "county")
        /**
        * 县级市、区
        */
        private String county;
            @JsonProperty(value = "address")
        /**
        * 详细地址
        */
        private String address;
    
            public void setAreaCode(Long areaCode) {
            this.areaCode = areaCode;
        }

        public Long getAreaCode() {
            return this.areaCode;
        }

            public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }

            public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

            public void setCounty(String county) {
            this.county = county;
        }

        public String getCounty() {
            return this.county;
        }

            public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return this.address;
        }

        }


}