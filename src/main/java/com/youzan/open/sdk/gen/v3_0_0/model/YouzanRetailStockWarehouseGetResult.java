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

public class YouzanRetailStockWarehouseGetResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 仓库信息
     */
    private WarehouseDetailVO response;

    public void setResponse(WarehouseDetailVO response) {
        this.response = response;
    }

    public WarehouseDetailVO getResponse() {
        return this.response;
    }

    public static class WarehouseDetailVO {
            @JsonProperty(value = "warehouse_id")
        /**
        * 仓库kdtId
        */
        private Long warehouseId;
            @JsonProperty(value = "group_id")
        /**
        * 总部kdtId
        */
        private Long groupId;
            @JsonProperty(value = "status")
        /**
        * 仓库状态  0:启用   1:停用
        */
        private Long status;
            @JsonProperty(value = "type")
        /**
        * 仓库类型  1:独立仓  2:门店仓  3:虚拟仓
        */
        private Long type;
            @JsonProperty(value = "remark")
        /**
        * 仓库备注
        */
        private String remark;
            @JsonProperty(value = "name")
        /**
        * 仓库名称
        */
        private String name;
            @JsonProperty(value = "province")
        /**
        * 省份
        */
        private String province;
            @JsonProperty(value = "city")
        /**
        * 城市
        */
        private String city;
            @JsonProperty(value = "county")
        /**
        * 区域
        */
        private String county;
            @JsonProperty(value = "county_id")
        /**
        * 区域id
        */
        private Long countyId;
            @JsonProperty(value = "address")
        /**
        * 详细地址
        */
        private String address;
            @JsonProperty(value = "contact_name")
        /**
        * 联系人姓名
        */
        private String contactName;
            @JsonProperty(value = "contact_phone_num")
        /**
        * 手机号
        */
        private String contactPhoneNum;
            @JsonProperty(value = "contact_phone_code")
        /**
        * 手机区号
        */
        private String contactPhoneCode;
            @JsonProperty(value = "lng")
        /**
        * 经度
        */
        private String lng;
            @JsonProperty(value = "lat")
        /**
        * 纬度
        */
        private String lat;
    
            public void setWarehouseId(Long warehouseId) {
            this.warehouseId = warehouseId;
        }

        public Long getWarehouseId() {
            return this.warehouseId;
        }

            public void setGroupId(Long groupId) {
            this.groupId = groupId;
        }

        public Long getGroupId() {
            return this.groupId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRemark() {
            return this.remark;
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

            public void setCountyId(Long countyId) {
            this.countyId = countyId;
        }

        public Long getCountyId() {
            return this.countyId;
        }

            public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return this.address;
        }

            public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public String getContactName() {
            return this.contactName;
        }

            public void setContactPhoneNum(String contactPhoneNum) {
            this.contactPhoneNum = contactPhoneNum;
        }

        public String getContactPhoneNum() {
            return this.contactPhoneNum;
        }

            public void setContactPhoneCode(String contactPhoneCode) {
            this.contactPhoneCode = contactPhoneCode;
        }

        public String getContactPhoneCode() {
            return this.contactPhoneCode;
        }

            public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLng() {
            return this.lng;
        }

            public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLat() {
            return this.lat;
        }

        }


}