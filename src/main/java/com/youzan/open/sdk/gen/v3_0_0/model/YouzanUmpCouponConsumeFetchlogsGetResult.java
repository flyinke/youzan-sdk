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

public class YouzanUmpCouponConsumeFetchlogsGetResult implements APIResult {

    @JsonProperty(value = "fetchlogs")
    /**
     * 领取记录
     */
    private UmpPromotionFetchlog[] fetchlogs;
    @JsonProperty(value = "total_results")
    /**
     * 领取总数
     */
    private Long totalResults;

    public void setFetchlogs(UmpPromotionFetchlog[] fetchlogs) {
        this.fetchlogs = fetchlogs;
    }

    public UmpPromotionFetchlog[] getFetchlogs() {
        return this.fetchlogs;
    }
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public static class UmpPromotionFetchlog {
            @JsonProperty(value = "title")
        /**
        * 优惠券／优惠码活动的名称
        */
        private String title;
            @JsonProperty(value = "fans_id")
        /**
        * 领取人fans_id
        */
        private Long fansId;
            @JsonProperty(value = "fans_type")
        /**
        * 领取人用户类型
        */
        private Long fansType;
            @JsonProperty(value = "used_in_order_no")
        /**
        * 使用的订单号
        */
        private String usedInOrderNo;
            @JsonProperty(value = "is_used")
        /**
        * 是否已使用 0未使用 1已使用
        */
        private Long isUsed;
            @JsonProperty(value = "used_at")
        /**
        * 使用时间
        */
        private Date usedAt;
            @JsonProperty(value = "created_at")
        /**
        * 优惠券和通用优惠码的领取时间；若优惠码是用户自行导入的，则为优惠码导入时间。
        */
        private Date createdAt;
            @JsonProperty(value = "promocode_id")
        /**
        * 优惠码ID
        */
        private Long promocodeId;
            @JsonProperty(value = "promocard_id")
        /**
        * 优惠券ID
        */
        private Long promocardId;
            @JsonProperty(value = "mobile")
        /**
        * 手机号（若有）
        */
        private String mobile;
            @JsonProperty(value = "taked_at")
        /**
        * 领取时间
        */
        private Date takedAt;
            @JsonProperty(value = "open_user_id")
        /**
        * 三方用户ID
        */
        private String openUserId;
    
            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setFansId(Long fansId) {
            this.fansId = fansId;
        }

        public Long getFansId() {
            return this.fansId;
        }

            public void setFansType(Long fansType) {
            this.fansType = fansType;
        }

        public Long getFansType() {
            return this.fansType;
        }

            public void setUsedInOrderNo(String usedInOrderNo) {
            this.usedInOrderNo = usedInOrderNo;
        }

        public String getUsedInOrderNo() {
            return this.usedInOrderNo;
        }

            public void setIsUsed(Long isUsed) {
            this.isUsed = isUsed;
        }

        public Long getIsUsed() {
            return this.isUsed;
        }

            public void setUsedAt(Date usedAt) {
            this.usedAt = usedAt;
        }

        public Date getUsedAt() {
            return this.usedAt;
        }

            public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        public Date getCreatedAt() {
            return this.createdAt;
        }

            public void setPromocodeId(Long promocodeId) {
            this.promocodeId = promocodeId;
        }

        public Long getPromocodeId() {
            return this.promocodeId;
        }

            public void setPromocardId(Long promocardId) {
            this.promocardId = promocardId;
        }

        public Long getPromocardId() {
            return this.promocardId;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setTakedAt(Date takedAt) {
            this.takedAt = takedAt;
        }

        public Date getTakedAt() {
            return this.takedAt;
        }

            public void setOpenUserId(String openUserId) {
            this.openUserId = openUserId;
        }

        public String getOpenUserId() {
            return this.openUserId;
        }

        }


}