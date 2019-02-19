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

public class YouzanUmpCouponDetailGetResult implements APIResult {

    @JsonProperty(value = "group")
    /**
     * 优惠活动
     */
    private CouponGroup group;

    public void setGroup(CouponGroup group) {
        this.group = group;
    }

    public CouponGroup getGroup() {
        return this.group;
    }

    public static class CouponGroup {
            @JsonProperty(value = "id")
        /**
        * 活动ID
        */
        private Long id;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "group_type")
        /**
        * 优惠券类型 7：优惠券 9：优惠码 - 一卡一码 10：优惠码 - 通用码
        */
        private Long groupType;
            @JsonProperty(value = "title")
        /**
        * 优惠券名称
        */
        private String title;
            @JsonProperty(value = "preferential_type")
        /**
        * 优惠属性，1表示优惠，2表示折扣
        */
        private Long preferentialType;
            @JsonProperty(value = "denominations")
        /**
        * 面额（单位分）
        */
        private Long denominations;
            @JsonProperty(value = "value_random_to")
        /**
        * 面值随机上限。不随机为0
        */
        private Long valueRandomTo;
            @JsonProperty(value = "condition")
        /**
        * 满额条件
        */
        private Long condition;
            @JsonProperty(value = "discount")
        /**
        * 折扣（88，8.8折）
        */
        private Long discount;
            @JsonProperty(value = "is_limit")
        /**
        * 是否限制 1：一人一次 0：不限制
        */
        private Long isLimit;
            @JsonProperty(value = "is_forbid_preference")
        /**
        * 是否仅原价购买商品时可用（1:是，0:否）
        */
        private Long isForbidPreference;
            @JsonProperty(value = "user_level")
        /**
        * 会员等级
        */
        private Long userLevel;
            @JsonProperty(value = "date_type")
        /**
        * 优惠使用时间类型，1表示固定活动时间，2表示延迟类型，几天后几天内有效
        */
        private Long dateType;
            @JsonProperty(value = "fixed_term")
        /**
        * 固定时长
        */
        private Long fixedTerm;
            @JsonProperty(value = "fixed_begin_term")
        /**
        * 延迟开始的时间
        */
        private Long fixedBeginTerm;
            @JsonProperty(value = "valid_start_time")
        /**
        * 有效开始时间
        */
        private Date validStartTime;
            @JsonProperty(value = "valid_end_time")
        /**
        * 有效结束时间
        */
        private Date validEndTime;
            @JsonProperty(value = "total_qty")
        /**
        * 总发放量
        */
        private Long totalQty;
            @JsonProperty(value = "stock_qty")
        /**
        * 库存数量
        */
        private Long stockQty;
            @JsonProperty(value = "range_type")
        /**
        * 使用范围类型
        */
        private String rangeType;
            @JsonProperty(value = "range_value")
        /**
        * 使用范围值
        */
        private String rangeValue;
            @JsonProperty(value = "expire_notice")
        /**
        * 到期是否提醒 1是 0否
        */
        private String expireNotice;
            @JsonProperty(value = "description")
        /**
        * 使用说明
        */
        private String description;
            @JsonProperty(value = "meta_data")
        /**
        * 一些额外配置信息
        */
        private String metaData;
            @JsonProperty(value = "is_share")
        /**
        * 到期是否可分享 1是 0否
        */
        private Long isShare;
            @JsonProperty(value = "is_sync_weixin")
        /**
        * 是否同步微信卡券 1是 0否
        */
        private Long isSyncWeixin;
            @JsonProperty(value = "is_invalid")
        /**
        * 是否失效，默认0为没失效
        */
        private Long isInvalid;
            @JsonProperty(value = "total_fans_taked")
        /**
        * 粉丝领取总人数(去重)
        */
        private Long totalFansTaked;
            @JsonProperty(value = "total_used")
        /**
        * 已使用总数
        */
        private Long totalUsed;
            @JsonProperty(value = "total_take")
        /**
        * 领取次数
        */
        private Long totalTake;
            @JsonProperty(value = "created_at")
        /**
        * 创建于
        */
        private Date createdAt;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Date updatedAt;
    
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

            public void setGroupType(Long groupType) {
            this.groupType = groupType;
        }

        public Long getGroupType() {
            return this.groupType;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setPreferentialType(Long preferentialType) {
            this.preferentialType = preferentialType;
        }

        public Long getPreferentialType() {
            return this.preferentialType;
        }

            public void setDenominations(Long denominations) {
            this.denominations = denominations;
        }

        public Long getDenominations() {
            return this.denominations;
        }

            public void setValueRandomTo(Long valueRandomTo) {
            this.valueRandomTo = valueRandomTo;
        }

        public Long getValueRandomTo() {
            return this.valueRandomTo;
        }

            public void setCondition(Long condition) {
            this.condition = condition;
        }

        public Long getCondition() {
            return this.condition;
        }

            public void setDiscount(Long discount) {
            this.discount = discount;
        }

        public Long getDiscount() {
            return this.discount;
        }

            public void setIsLimit(Long isLimit) {
            this.isLimit = isLimit;
        }

        public Long getIsLimit() {
            return this.isLimit;
        }

            public void setIsForbidPreference(Long isForbidPreference) {
            this.isForbidPreference = isForbidPreference;
        }

        public Long getIsForbidPreference() {
            return this.isForbidPreference;
        }

            public void setUserLevel(Long userLevel) {
            this.userLevel = userLevel;
        }

        public Long getUserLevel() {
            return this.userLevel;
        }

            public void setDateType(Long dateType) {
            this.dateType = dateType;
        }

        public Long getDateType() {
            return this.dateType;
        }

            public void setFixedTerm(Long fixedTerm) {
            this.fixedTerm = fixedTerm;
        }

        public Long getFixedTerm() {
            return this.fixedTerm;
        }

            public void setFixedBeginTerm(Long fixedBeginTerm) {
            this.fixedBeginTerm = fixedBeginTerm;
        }

        public Long getFixedBeginTerm() {
            return this.fixedBeginTerm;
        }

            public void setValidStartTime(Date validStartTime) {
            this.validStartTime = validStartTime;
        }

        public Date getValidStartTime() {
            return this.validStartTime;
        }

            public void setValidEndTime(Date validEndTime) {
            this.validEndTime = validEndTime;
        }

        public Date getValidEndTime() {
            return this.validEndTime;
        }

            public void setTotalQty(Long totalQty) {
            this.totalQty = totalQty;
        }

        public Long getTotalQty() {
            return this.totalQty;
        }

            public void setStockQty(Long stockQty) {
            this.stockQty = stockQty;
        }

        public Long getStockQty() {
            return this.stockQty;
        }

            public void setRangeType(String rangeType) {
            this.rangeType = rangeType;
        }

        public String getRangeType() {
            return this.rangeType;
        }

            public void setRangeValue(String rangeValue) {
            this.rangeValue = rangeValue;
        }

        public String getRangeValue() {
            return this.rangeValue;
        }

            public void setExpireNotice(String expireNotice) {
            this.expireNotice = expireNotice;
        }

        public String getExpireNotice() {
            return this.expireNotice;
        }

            public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

            public void setMetaData(String metaData) {
            this.metaData = metaData;
        }

        public String getMetaData() {
            return this.metaData;
        }

            public void setIsShare(Long isShare) {
            this.isShare = isShare;
        }

        public Long getIsShare() {
            return this.isShare;
        }

            public void setIsSyncWeixin(Long isSyncWeixin) {
            this.isSyncWeixin = isSyncWeixin;
        }

        public Long getIsSyncWeixin() {
            return this.isSyncWeixin;
        }

            public void setIsInvalid(Long isInvalid) {
            this.isInvalid = isInvalid;
        }

        public Long getIsInvalid() {
            return this.isInvalid;
        }

            public void setTotalFansTaked(Long totalFansTaked) {
            this.totalFansTaked = totalFansTaked;
        }

        public Long getTotalFansTaked() {
            return this.totalFansTaked;
        }

            public void setTotalUsed(Long totalUsed) {
            this.totalUsed = totalUsed;
        }

        public Long getTotalUsed() {
            return this.totalUsed;
        }

            public void setTotalTake(Long totalTake) {
            this.totalTake = totalTake;
        }

        public Long getTotalTake() {
            return this.totalTake;
        }

            public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        public Date getCreatedAt() {
            return this.createdAt;
        }

            public void setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Date getUpdatedAt() {
            return this.updatedAt;
        }

        }


}