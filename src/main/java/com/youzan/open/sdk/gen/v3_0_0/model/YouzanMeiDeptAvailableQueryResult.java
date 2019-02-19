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

public class YouzanMeiDeptAvailableQueryResult implements APIResult {

    @JsonProperty(value = "depts")
    /**
     * 门店列表
     */
    private MeiDeptInfo[] depts;

    public void setDepts(MeiDeptInfo[] depts) {
        this.depts = depts;
    }

    public MeiDeptInfo[] getDepts() {
        return this.depts;
    }

    public static class mei_shop_address {
            @JsonProperty(value = "detailed_address")
        /**
        * 详细地址
        */
        private String detailedAddress;
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
            @JsonProperty(value = "area_code")
        /**
        * 区域编码
        */
        private Long areaCode;
            @JsonProperty(value = "district")
        /**
        * 区
        */
        private String district;
            @JsonProperty(value = "latitude")
        /**
        * 维度
        */
        private Long latitude;
            @JsonProperty(value = "longitude")
        /**
        * 精度
        */
        private Long longitude;
    
            public void setDetailedAddress(String detailedAddress) {
            this.detailedAddress = detailedAddress;
        }

        public String getDetailedAddress() {
            return this.detailedAddress;
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

            public void setAreaCode(Long areaCode) {
            this.areaCode = areaCode;
        }

        public Long getAreaCode() {
            return this.areaCode;
        }

            public void setDistrict(String district) {
            this.district = district;
        }

        public String getDistrict() {
            return this.district;
        }

            public void setLatitude(Long latitude) {
            this.latitude = latitude;
        }

        public Long getLatitude() {
            return this.latitude;
        }

            public void setLongitude(Long longitude) {
            this.longitude = longitude;
        }

        public Long getLongitude() {
            return this.longitude;
        }

        }

    public static class MeiDeptInfo {
            @JsonProperty(value = "dept_name")
        /**
        * 门店名字
        */
        private String deptName;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "role_id")
        /**
        * 角色ID
        */
        private Long roleId;
            @JsonProperty(value = "dept_id")
        /**
        * 门店ID
        */
        private Long deptId;
            @JsonProperty(value = "role_name")
        /**
        * 角色名字
        */
        private String roleName;
            @JsonProperty(value = "logo")
        /**
        * 门店logo
        */
        private String logo;
            @JsonProperty(value = "shop_name")
        /**
        * 店铺名称
        */
        private String shopName;
            @JsonProperty(value = "status")
        /**
        * 店铺状态
        */
        private Long status;
            @JsonProperty(value = "shop_address")
        /**
        * 店铺地址
        */
        private mei_shop_address shopAddress;
    
            public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getDeptName() {
            return this.deptName;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setRoleId(Long roleId) {
            this.roleId = roleId;
        }

        public Long getRoleId() {
            return this.roleId;
        }

            public void setDeptId(Long deptId) {
            this.deptId = deptId;
        }

        public Long getDeptId() {
            return this.deptId;
        }

            public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleName() {
            return this.roleName;
        }

            public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getLogo() {
            return this.logo;
        }

            public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getShopName() {
            return this.shopName;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setShopAddress(mei_shop_address shopAddress) {
            this.shopAddress = shopAddress;
        }

        public mei_shop_address getShopAddress() {
            return this.shopAddress;
        }

        }


}