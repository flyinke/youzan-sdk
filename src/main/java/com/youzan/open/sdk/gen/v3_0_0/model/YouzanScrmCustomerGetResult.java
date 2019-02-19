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

public class YouzanScrmCustomerGetResult implements APIResult {

    @JsonProperty(value = "name")
    /**
     * 姓名
     */
    private String name;
    @JsonProperty(value = "gender")
    /**
     * 性别 1:男 2:女 0:未知
     */
    private Long gender;
    @JsonProperty(value = "birthday")
    /**
     * 生日
     */
    private String birthday;
    @JsonProperty(value = "area")
    /**
     * 地域
     */
    private ScrmUserArea area;
    @JsonProperty(value = "mobile")
    /**
     * 手机号
     */
    private String mobile;
    @JsonProperty(value = "source_type")
    /**
     * 来源: 0:未知 100:关注公众号 200:普通下单 201:收银台下单 202 : 有赞买家版下单 300:外部导入 301: 开放接口导入 400: 网店客户登记 401: 门店版客户登记 500: 批发客户 600:储值充值客户
     */
    private Long sourceType;
    @JsonProperty(value = "tag_names")
    /**
     * 标签，以“，”分隔
     */
    private String tagNames;
    @JsonProperty(value = "remark")
    /**
     * 备注
     */
    private String remark;
    @JsonProperty(value = "current_points")
    /**
     * 当前可用积分
     */
    private Long currentPoints;
    @JsonProperty(value = "trade_count")
    /**
     * 购次
     */
    private Long tradeCount;
    @JsonProperty(value = "last_trade_time")
    /**
     * 最后购买时间
     */
    private String lastTradeTime;
    @JsonProperty(value = "first_time")
    /**
     * 首次成为会员的时间
     */
    private String firstTime;

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
    public void setArea(ScrmUserArea area) {
        this.area = area;
    }

    public ScrmUserArea getArea() {
        return this.area;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setSourceType(Long sourceType) {
        this.sourceType = sourceType;
    }

    public Long getSourceType() {
        return this.sourceType;
    }
    public void setTagNames(String tagNames) {
        this.tagNames = tagNames;
    }

    public String getTagNames() {
        return this.tagNames;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }
    public void setCurrentPoints(Long currentPoints) {
        this.currentPoints = currentPoints;
    }

    public Long getCurrentPoints() {
        return this.currentPoints;
    }
    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Long getTradeCount() {
        return this.tradeCount;
    }
    public void setLastTradeTime(String lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public String getLastTradeTime() {
        return this.lastTradeTime;
    }
    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public String getFirstTime() {
        return this.firstTime;
    }

    public static class ScrmUserArea {
            @JsonProperty(value = "city_name")
        /**
        * 城市名
        */
        private String cityName;
            @JsonProperty(value = "city_id")
        /**
        * 城市id
        */
        private Long cityId;
            @JsonProperty(value = "county_name")
        /**
        * 城区名
        */
        private String countyName;
            @JsonProperty(value = "county_id")
        /**
        * 城区id
        */
        private Long countyId;
            @JsonProperty(value = "province_name")
        /**
        * 省名
        */
        private String provinceName;
            @JsonProperty(value = "province_id")
        /**
        * 省id
        */
        private Long provinceId;
    
            public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCityName() {
            return this.cityName;
        }

            public void setCityId(Long cityId) {
            this.cityId = cityId;
        }

        public Long getCityId() {
            return this.cityId;
        }

            public void setCountyName(String countyName) {
            this.countyName = countyName;
        }

        public String getCountyName() {
            return this.countyName;
        }

            public void setCountyId(Long countyId) {
            this.countyId = countyId;
        }

        public Long getCountyId() {
            return this.countyId;
        }

            public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public String getProvinceName() {
            return this.provinceName;
        }

            public void setProvinceId(Long provinceId) {
            this.provinceId = provinceId;
        }

        public Long getProvinceId() {
            return this.provinceId;
        }

        }


}