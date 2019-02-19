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

public class YouzanUmpPromocardDetailGetResult implements APIResult {

    @JsonProperty(value = "couponCard")
    /**
     * 卡券详情
     */
    private CouponCard couponCard;

    public void setCouponCard(CouponCard couponCard) {
        this.couponCard = couponCard;
    }

    public CouponCard getCouponCard() {
        return this.couponCard;
    }

    public static class CouponCard {
            @JsonProperty(value = "id")
        /**
        * 卡ID
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "coupon_group_id")
        /**
        * 活动ID
        */
        private Long couponGroupId;
            @JsonProperty(value = "preferential_type")
        /**
        * 优惠属性，1：CASH，2：discount
        */
        private Long preferentialType;
            @JsonProperty(value = "value")
        /**
        * 面额（单位：分）
        */
        private Long value;
            @JsonProperty(value = "discount")
        /**
        * 领取到的折扣值（88，8.8折）
        */
        private Long discount;
            @JsonProperty(value = "is_used")
        /**
        * 是否已使用 1 是 0 否
        */
        private Long isUsed;
            @JsonProperty(value = "take_at")
        /**
        * 领取时间
        */
        private Date takeAt;
            @JsonProperty(value = "used_value")
        /**
        * 实际优惠金额（单位：分）
        */
        private Long usedValue;
            @JsonProperty(value = "used_at")
        /**
        * 使用时间
        */
        private Date usedAt;
            @JsonProperty(value = "used_in_order_no")
        /**
        * 用于订单号
        */
        private String usedInOrderNo;
            @JsonProperty(value = "valid_start_at")
        /**
        * 优惠开始时间
        */
        private Date validStartAt;
            @JsonProperty(value = "expire_at")
        /**
        * 过期时间
        */
        private Date expireAt;
            @JsonProperty(value = "is_sync_card")
        /**
        * 是否已同步卡包 1: 已同步 2:已删除
        */
        private Long isSyncCard;
            @JsonProperty(value = "verify_code")
        /**
        * 核销码
        */
        private String verifyCode;
    
            public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setCouponGroupId(Long couponGroupId) {
            this.couponGroupId = couponGroupId;
        }

        public Long getCouponGroupId() {
            return this.couponGroupId;
        }

            public void setPreferentialType(Long preferentialType) {
            this.preferentialType = preferentialType;
        }

        public Long getPreferentialType() {
            return this.preferentialType;
        }

            public void setValue(Long value) {
            this.value = value;
        }

        public Long getValue() {
            return this.value;
        }

            public void setDiscount(Long discount) {
            this.discount = discount;
        }

        public Long getDiscount() {
            return this.discount;
        }

            public void setIsUsed(Long isUsed) {
            this.isUsed = isUsed;
        }

        public Long getIsUsed() {
            return this.isUsed;
        }

            public void setTakeAt(Date takeAt) {
            this.takeAt = takeAt;
        }

        public Date getTakeAt() {
            return this.takeAt;
        }

            public void setUsedValue(Long usedValue) {
            this.usedValue = usedValue;
        }

        public Long getUsedValue() {
            return this.usedValue;
        }

            public void setUsedAt(Date usedAt) {
            this.usedAt = usedAt;
        }

        public Date getUsedAt() {
            return this.usedAt;
        }

            public void setUsedInOrderNo(String usedInOrderNo) {
            this.usedInOrderNo = usedInOrderNo;
        }

        public String getUsedInOrderNo() {
            return this.usedInOrderNo;
        }

            public void setValidStartAt(Date validStartAt) {
            this.validStartAt = validStartAt;
        }

        public Date getValidStartAt() {
            return this.validStartAt;
        }

            public void setExpireAt(Date expireAt) {
            this.expireAt = expireAt;
        }

        public Date getExpireAt() {
            return this.expireAt;
        }

            public void setIsSyncCard(Long isSyncCard) {
            this.isSyncCard = isSyncCard;
        }

        public Long getIsSyncCard() {
            return this.isSyncCard;
        }

            public void setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
        }

        public String getVerifyCode() {
            return this.verifyCode;
        }

        }


}