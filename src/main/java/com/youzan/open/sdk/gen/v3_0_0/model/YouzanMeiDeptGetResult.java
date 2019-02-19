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

public class YouzanMeiDeptGetResult implements APIResult {

    @JsonProperty(value = "dept_short_url")
    /**
     * 分店url短连接
     */
    private String deptShortUrl;
    @JsonProperty(value = "principal_cert_status")
    /**
     * 主体认证状态
     */
    private Long principalCertStatus;
    @JsonProperty(value = "create_time")
    /**
     * 创建时间
     */
    private Long createTime;
    @JsonProperty(value = "pre_code")
    /**
     * 客服电话区号
     */
    private String preCode;
    @JsonProperty(value = "principal_cert_type")
    /**
     * 主体认证类型
     */
    private Long principalCertType;
    @JsonProperty(value = "telephone_number")
    /**
     * 客服电话
     */
    private String telephoneNumber;
    @JsonProperty(value = "dept_name")
    /**
     * 分店名称
     */
    private String deptName;
    @JsonProperty(value = "description")
    /**
     * 简介
     */
    private String description;
    @JsonProperty(value = "principal_cert_name")
    /**
     * 主体认证名称
     */
    private String principalCertName;
    @JsonProperty(value = "business_hour")
    /**
     * 营业时间
     */
    private MeiBusinessHour businessHour;
    @JsonProperty(value = "dept_url")
    /**
     * 分店url
     */
    private String deptUrl;
    @JsonProperty(value = "shop_address")
    /**
     * 分店地址
     */
    private MeiShopAddress shopAddress;
    @JsonProperty(value = "kdt_id")
    /**
     * 店铺id
     */
    private Long kdtId;
    @JsonProperty(value = "logo")
    /**
     * 分店logo
     */
    private String logo;
    @JsonProperty(value = "reserve_hour")
    /**
     * 可预约时间
     */
    private MeiBusinessHour reserveHour;

    public void setDeptShortUrl(String deptShortUrl) {
        this.deptShortUrl = deptShortUrl;
    }

    public String getDeptShortUrl() {
        return this.deptShortUrl;
    }
    public void setPrincipalCertStatus(Long principalCertStatus) {
        this.principalCertStatus = principalCertStatus;
    }

    public Long getPrincipalCertStatus() {
        return this.principalCertStatus;
    }
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getCreateTime() {
        return this.createTime;
    }
    public void setPreCode(String preCode) {
        this.preCode = preCode;
    }

    public String getPreCode() {
        return this.preCode;
    }
    public void setPrincipalCertType(Long principalCertType) {
        this.principalCertType = principalCertType;
    }

    public Long getPrincipalCertType() {
        return this.principalCertType;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public void setPrincipalCertName(String principalCertName) {
        this.principalCertName = principalCertName;
    }

    public String getPrincipalCertName() {
        return this.principalCertName;
    }
    public void setBusinessHour(MeiBusinessHour businessHour) {
        this.businessHour = businessHour;
    }

    public MeiBusinessHour getBusinessHour() {
        return this.businessHour;
    }
    public void setDeptUrl(String deptUrl) {
        this.deptUrl = deptUrl;
    }

    public String getDeptUrl() {
        return this.deptUrl;
    }
    public void setShopAddress(MeiShopAddress shopAddress) {
        this.shopAddress = shopAddress;
    }

    public MeiShopAddress getShopAddress() {
        return this.shopAddress;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return this.logo;
    }
    public void setReserveHour(MeiBusinessHour reserveHour) {
        this.reserveHour = reserveHour;
    }

    public MeiBusinessHour getReserveHour() {
        return this.reserveHour;
    }

    public static class MeiHourTime {
            @JsonProperty(value = "start")
        /**
        * 开始的分钟数
        */
        private Long start;
            @JsonProperty(value = "end")
        /**
        * 结束的分钟数
        */
        private Long end;
    
            public void setStart(Long start) {
            this.start = start;
        }

        public Long getStart() {
            return this.start;
        }

            public void setEnd(Long end) {
            this.end = end;
        }

        public Long getEnd() {
            return this.end;
        }

        }

    public static class MeiShopAddress {
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

    public static class MeiBusinessHour {
            @JsonProperty(value = "time")
        /**
        * HourTime结构
        */
        private MeiHourTime time;
            @JsonProperty(value = "allWeek")
        /**
        * 是否7*24小时营业
        */
        private Boolean allWeek;
            @JsonProperty(value = "date")
        /**
        * 工作的的日期
        */
        private Number[] date;
            @JsonProperty(value = "valid")
        /**
        * 判断businessHour是否有效
        */
        private Boolean valid;
    
            public void setTime(MeiHourTime time) {
            this.time = time;
        }

        public MeiHourTime getTime() {
            return this.time;
        }

            public void setAllWeek(Boolean allWeek) {
            this.allWeek = allWeek;
        }

        public Boolean getAllWeek() {
            return this.allWeek;
        }

            public void setDate(Number[] date) {
            this.date = date;
        }

        public Number[] getDate() {
            return this.date;
        }

            public void setValid(Boolean valid) {
            this.valid = valid;
        }

        public Boolean getValid() {
            return this.valid;
        }

        }


}