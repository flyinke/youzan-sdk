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

public class YouzanUmpCouponTakeResult implements APIResult {

    @JsonProperty(value = "coupon_type")
    /**
     * 值：1.PROMOCODE（表示优惠码） 2.PROMOCARD（表示优惠券）
     */
    private String couponType;
    @JsonProperty(value = "promocode")
    /**
     * 用户领取优惠码详情
     */
    private UmpPromocodeUserTakedetail promocode;
    @JsonProperty(value = "promocard")
    /**
     * 用户领取优惠券详情（优惠码or优惠券详情只返回其一） 
     */
    private UmpPromocardUserTakedetail promocard;

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponType() {
        return this.couponType;
    }
    public void setPromocode(UmpPromocodeUserTakedetail promocode) {
        this.promocode = promocode;
    }

    public UmpPromocodeUserTakedetail getPromocode() {
        return this.promocode;
    }
    public void setPromocard(UmpPromocardUserTakedetail promocard) {
        this.promocard = promocard;
    }

    public UmpPromocardUserTakedetail getPromocard() {
        return this.promocard;
    }

    public static class UmpPromocodeUserTakedetail {
            @JsonProperty(value = "promocode_id")
        /**
        * 优惠码id
        */
        private Long promocodeId;
            @JsonProperty(value = "title")
        /**
        * 优惠码标题
        */
        private String title;
            @JsonProperty(value = "code")
        /**
        * 优惠码编号
        */
        private String code;
            @JsonProperty(value = "value")
        /**
        * 优惠码面额
        */
        private Float value;
            @JsonProperty(value = "condition")
        /**
        * 优惠码满额条件
        */
        private String condition;
            @JsonProperty(value = "start_at")
        /**
        * 优惠码生效时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startAt;
            @JsonProperty(value = "end_at")
        /**
        * 优惠码结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endAt;
            @JsonProperty(value = "is_used")
        /**
        * 优惠码是否已使用，0 表示未使用，1 表示已使用
        */
        private Long isUsed;
            @JsonProperty(value = "is_invalid")
        /**
        * 优惠码是否已实效，0 表示未实效，1 表示已实效
        */
        private Long isInvalid;
            @JsonProperty(value = "is_expired")
        /**
        * 优惠码是否已过期，0 表示未过期，1 表示已过期
        */
        private Long isExpired;
            @JsonProperty(value = "background_color")
        /**
        * 优惠码背景颜色
        */
        private String backgroundColor;
            @JsonProperty(value = "detail_url")
        /**
        * 优惠码详情链接
        */
        private String detailUrl;
            @JsonProperty(value = "verify_code")
        /**
        * 优惠券核销码
        */
        private String verifyCode;
    
            public void setPromocodeId(Long promocodeId) {
            this.promocodeId = promocodeId;
        }

        public Long getPromocodeId() {
            return this.promocodeId;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setCode(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

            public void setValue(Float value) {
            this.value = value;
        }

        public Float getValue() {
            return this.value;
        }

            public void setCondition(String condition) {
            this.condition = condition;
        }

        public String getCondition() {
            return this.condition;
        }

            public void setStartAt(Date startAt) {
            this.startAt = startAt;
        }

        public Date getStartAt() {
            return this.startAt;
        }

            public void setEndAt(Date endAt) {
            this.endAt = endAt;
        }

        public Date getEndAt() {
            return this.endAt;
        }

            public void setIsUsed(Long isUsed) {
            this.isUsed = isUsed;
        }

        public Long getIsUsed() {
            return this.isUsed;
        }

            public void setIsInvalid(Long isInvalid) {
            this.isInvalid = isInvalid;
        }

        public Long getIsInvalid() {
            return this.isInvalid;
        }

            public void setIsExpired(Long isExpired) {
            this.isExpired = isExpired;
        }

        public Long getIsExpired() {
            return this.isExpired;
        }

            public void setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

            public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }

            public void setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
        }

        public String getVerifyCode() {
            return this.verifyCode;
        }

        }

    public static class UmpPromocardUserTakedetail {
            @JsonProperty(value = "promocard_id")
        /**
        * 优惠券Id
        */
        private Long promocardId;
            @JsonProperty(value = "title")
        /**
        * 优惠券标题
        */
        private String title;
            @JsonProperty(value = "value")
        /**
        * 优惠券面额
        */
        private Float value;
            @JsonProperty(value = "condition")
        /**
        * 优惠券满额条件
        */
        private String condition;
            @JsonProperty(value = "start_at")
        /**
        * 优惠券生效时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startAt;
            @JsonProperty(value = "end_at")
        /**
        * 优惠券结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endAt;
            @JsonProperty(value = "is_used")
        /**
        * 优惠券是否已使用，0 表示未使用，1 表示已使用
        */
        private Long isUsed;
            @JsonProperty(value = "is_invalid")
        /**
        * 优惠券是否已实效，0 表示未实效，1 表示已实效
        */
        private Long isInvalid;
            @JsonProperty(value = "is_expired")
        /**
        * 优惠券是否已过期，0 表示未过期，1 表示已过期
        */
        private Long isExpired;
            @JsonProperty(value = "background_color")
        /**
        * 优惠券背景颜色
        */
        private String backgroundColor;
            @JsonProperty(value = "detail_url")
        /**
        * 优惠券详情链接
        */
        private String detailUrl;
            @JsonProperty(value = "verify_code")
        /**
        * 优惠券核销码
        */
        private String verifyCode;
    
            public void setPromocardId(Long promocardId) {
            this.promocardId = promocardId;
        }

        public Long getPromocardId() {
            return this.promocardId;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setValue(Float value) {
            this.value = value;
        }

        public Float getValue() {
            return this.value;
        }

            public void setCondition(String condition) {
            this.condition = condition;
        }

        public String getCondition() {
            return this.condition;
        }

            public void setStartAt(Date startAt) {
            this.startAt = startAt;
        }

        public Date getStartAt() {
            return this.startAt;
        }

            public void setEndAt(Date endAt) {
            this.endAt = endAt;
        }

        public Date getEndAt() {
            return this.endAt;
        }

            public void setIsUsed(Long isUsed) {
            this.isUsed = isUsed;
        }

        public Long getIsUsed() {
            return this.isUsed;
        }

            public void setIsInvalid(Long isInvalid) {
            this.isInvalid = isInvalid;
        }

        public Long getIsInvalid() {
            return this.isInvalid;
        }

            public void setIsExpired(Long isExpired) {
            this.isExpired = isExpired;
        }

        public Long getIsExpired() {
            return this.isExpired;
        }

            public void setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

            public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }

            public void setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
        }

        public String getVerifyCode() {
            return this.verifyCode;
        }

        }


}