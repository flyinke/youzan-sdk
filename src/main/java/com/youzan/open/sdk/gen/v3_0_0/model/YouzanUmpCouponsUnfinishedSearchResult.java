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

public class YouzanUmpCouponsUnfinishedSearchResult implements APIResult {

    @JsonProperty(value = "coupons")
    /**
     * 未结束的优惠券组列表
     */
    private UmpCoupon[] coupons;

    public void setCoupons(UmpCoupon[] coupons) {
        this.coupons = coupons;
    }

    public UmpCoupon[] getCoupons() {
        return this.coupons;
    }

    public static class UmpCoupon {
            @JsonProperty(value = "group_id")
        /**
        * 优惠的ID
        */
        private Long groupId;
            @JsonProperty(value = "coupon_type")
        /**
        * 优惠的类型。可选值：PROMOCARD（优惠券）、PROMOCODE（优惠码）
        */
        private String couponType;
            @JsonProperty(value = "range_type")
        /**
        * 可用范围的类型，可选值：
						<br>PART（部分商品可用，或指定商品可用）
						<br>ALL（全部商品可用）
        */
        private String rangeType;
            @JsonProperty(value = "title")
        /**
        * 优惠标题
        */
        private String title;
            @JsonProperty(value = "value")
        /**
        * 优惠面额。如果 is_random 为 1，则该字段表示随机金额的下限。单位：元，精确到分
        */
        private Float value;
            @JsonProperty(value = "is_random")
        /**
        * 是否是随机优惠，0 表示不随机，1 表示随机
        */
        private Long isRandom;
            @JsonProperty(value = "value_random_to")
        /**
        * 如果 is_random 为 1，则该字段表示随机金额的上限。单位：元，精确到分
        */
        private Float valueRandomTo;
            @JsonProperty(value = "need_user_level")
        /**
        * 是否限制领用者的等级，0 表示不限制，大于 0 表示领用者必须是这个等级ID
        */
        private Long needUserLevel;
            @JsonProperty(value = "user_level_name")
        /**
        * 限制领用者等级的名称
        */
        private String userLevelName;
            @JsonProperty(value = "quota")
        /**
        * 每人限领个数，为 0 则表示不限制
        */
        private Long quota;
            @JsonProperty(value = "is_at_least")
        /**
        * 是否设置满多少元可用，0 表示不限制，1 表示限制
        */
        private Long isAtLeast;
            @JsonProperty(value = "at_least")
        /**
        * 如果 is_at_least 为 1，该字段表示订单必须满这个价格，优惠才可用。单位：元，精确到分
        */
        private Float atLeast;
            @JsonProperty(value = "total")
        /**
        * 总库存
        */
        private Long total;
            @JsonProperty(value = "stock")
        /**
        * 剩余可用库存
        */
        private Long stock;
            @JsonProperty(value = "start_at")
        /**
        * 优惠生效时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startAt;
            @JsonProperty(value = "end_at")
        /**
        * 优惠结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endAt;
            @JsonProperty(value = "expire_notice")
        /**
        * 是否到期前4天发送提醒，0 表示不发送，1 表示发送
        */
        private Long expireNotice;
            @JsonProperty(value = "description")
        /**
        * 使用说明
        */
        private String description;
            @JsonProperty(value = "is_forbid_preference")
        /**
        * 是否仅原价购买商品时可用，0 表示否，1 表示是
        */
        private Long isForbidPreference;
            @JsonProperty(value = "is_sync_weixin")
        /**
        * 是否同步微信卡券，0 表示否，1 表示是
        */
        private Long isSyncWeixin;
            @JsonProperty(value = "weixin_card_id")
        /**
        * 微信卡券ID
        */
        private String weixinCardId;
            @JsonProperty(value = "status")
        /**
        * 优惠状态，0 表示有效，1 表示失效，2 表示微信卡券审核中
        */
        private Long status;
            @JsonProperty(value = "is_share")
        /**
        * 是否可分享领取链接，0 表示否，1 表示是
        */
        private Long isShare;
            @JsonProperty(value = "fetch_url")
        /**
        * 优惠领取链接
        */
        private String fetchUrl;
            @JsonProperty(value = "stat_fetch_user_num")
        /**
        * 领取优惠的人数
        */
        private Long statFetchUserNum;
            @JsonProperty(value = "stat_fetch_num")
        /**
        * 领取优惠的次数
        */
        private Long statFetchNum;
            @JsonProperty(value = "stat_use_num")
        /**
        * 使用优惠的次数
        */
        private Long statUseNum;
            @JsonProperty(value = "created")
        /**
        * 优惠创建时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date created;
            @JsonProperty(value = "updated")
        /**
        * 优惠券更新时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date updated;
            @JsonProperty(value = "preferential_type")
        /**
        * 1表示优惠,2表示折扣
        */
        private Long preferentialType;
            @JsonProperty(value = "discount")
        /**
        * 领取到的折扣值
        */
        private Long discount;
            @JsonProperty(value = "date_type")
        /**
        * 优惠使用时间类型, 1表示固定活动时间，2表示动态类型,几天后几天内有效
        */
        private Long dateType;
            @JsonProperty(value = "fixed_term")
        /**
        * 优惠有效固定时长
        */
        private Long fixedTerm;
            @JsonProperty(value = "fixed_begin_term")
        /**
        * 延迟开始的时间, 延迟几天生效
        */
        private Long fixedBeginTerm;
    
            public void setGroupId(Long groupId) {
            this.groupId = groupId;
        }

        public Long getGroupId() {
            return this.groupId;
        }

            public void setCouponType(String couponType) {
            this.couponType = couponType;
        }

        public String getCouponType() {
            return this.couponType;
        }

            public void setRangeType(String rangeType) {
            this.rangeType = rangeType;
        }

        public String getRangeType() {
            return this.rangeType;
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

            public void setIsRandom(Long isRandom) {
            this.isRandom = isRandom;
        }

        public Long getIsRandom() {
            return this.isRandom;
        }

            public void setValueRandomTo(Float valueRandomTo) {
            this.valueRandomTo = valueRandomTo;
        }

        public Float getValueRandomTo() {
            return this.valueRandomTo;
        }

            public void setNeedUserLevel(Long needUserLevel) {
            this.needUserLevel = needUserLevel;
        }

        public Long getNeedUserLevel() {
            return this.needUserLevel;
        }

            public void setUserLevelName(String userLevelName) {
            this.userLevelName = userLevelName;
        }

        public String getUserLevelName() {
            return this.userLevelName;
        }

            public void setQuota(Long quota) {
            this.quota = quota;
        }

        public Long getQuota() {
            return this.quota;
        }

            public void setIsAtLeast(Long isAtLeast) {
            this.isAtLeast = isAtLeast;
        }

        public Long getIsAtLeast() {
            return this.isAtLeast;
        }

            public void setAtLeast(Float atLeast) {
            this.atLeast = atLeast;
        }

        public Float getAtLeast() {
            return this.atLeast;
        }

            public void setTotal(Long total) {
            this.total = total;
        }

        public Long getTotal() {
            return this.total;
        }

            public void setStock(Long stock) {
            this.stock = stock;
        }

        public Long getStock() {
            return this.stock;
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

            public void setExpireNotice(Long expireNotice) {
            this.expireNotice = expireNotice;
        }

        public Long getExpireNotice() {
            return this.expireNotice;
        }

            public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

            public void setIsForbidPreference(Long isForbidPreference) {
            this.isForbidPreference = isForbidPreference;
        }

        public Long getIsForbidPreference() {
            return this.isForbidPreference;
        }

            public void setIsSyncWeixin(Long isSyncWeixin) {
            this.isSyncWeixin = isSyncWeixin;
        }

        public Long getIsSyncWeixin() {
            return this.isSyncWeixin;
        }

            public void setWeixinCardId(String weixinCardId) {
            this.weixinCardId = weixinCardId;
        }

        public String getWeixinCardId() {
            return this.weixinCardId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setIsShare(Long isShare) {
            this.isShare = isShare;
        }

        public Long getIsShare() {
            return this.isShare;
        }

            public void setFetchUrl(String fetchUrl) {
            this.fetchUrl = fetchUrl;
        }

        public String getFetchUrl() {
            return this.fetchUrl;
        }

            public void setStatFetchUserNum(Long statFetchUserNum) {
            this.statFetchUserNum = statFetchUserNum;
        }

        public Long getStatFetchUserNum() {
            return this.statFetchUserNum;
        }

            public void setStatFetchNum(Long statFetchNum) {
            this.statFetchNum = statFetchNum;
        }

        public Long getStatFetchNum() {
            return this.statFetchNum;
        }

            public void setStatUseNum(Long statUseNum) {
            this.statUseNum = statUseNum;
        }

        public Long getStatUseNum() {
            return this.statUseNum;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setUpdated(Date updated) {
            this.updated = updated;
        }

        public Date getUpdated() {
            return this.updated;
        }

            public void setPreferentialType(Long preferentialType) {
            this.preferentialType = preferentialType;
        }

        public Long getPreferentialType() {
            return this.preferentialType;
        }

            public void setDiscount(Long discount) {
            this.discount = discount;
        }

        public Long getDiscount() {
            return this.discount;
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

        }


}