package com.youzan.open.sdk.gen.v1_0_0.model;

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

public class YouzanUmpLimitdiscountDetailSearchResult implements APIResult {

    @JsonProperty(value = "total")
    /**
     * 总条数
     */
    private Long total;
    @JsonProperty(value = "items")
    /**
     * 限时折扣参与商品信息
     */
    private BriefTimeLimitedDiscountGoodsJoin[] items;

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
    }
    public void setItems(BriefTimeLimitedDiscountGoodsJoin[] items) {
        this.items = items;
    }

    public BriefTimeLimitedDiscountGoodsJoin[] getItems() {
        return this.items;
    }

    public static class BriefTimeLimitedDiscountGoodsJoin {
            @JsonProperty(value = "activityId")
        /**
        * 活动id
        */
        private Long activityId;
            @JsonProperty(value = "goodsId")
        /**
        * 商品id
        */
        private Long goodsId;
            @JsonProperty(value = "discountType")
        /**
        * 优惠类型；discount:打折；decrease:减价
        */
        private String discountType;
            @JsonProperty(value = "discountValue")
        /**
        * 优惠值;如果是打折:70=7折; 如果是减价:100=1元
        */
        private Long discountValue;
            @JsonProperty(value = "quota")
        /**
        * 限购数；0为不限购
        */
        private Long quota;
            @JsonProperty(value = "quotaType")
        /**
        * 限购类型；0:不限购，1：超过限购数后允许原价购买；2:限购X件
        */
        private Long quotaType;
            @JsonProperty(value = "valid")
        /**
        * 是否有效；
        */
        private Boolean valid;
            @JsonProperty(value = "eraseType")
        /**
        * 抹去金额类型。1表示抹去角、分，2表示抹去分，0表示不抹去
        */
        private Long eraseType;
            @JsonProperty(value = "createdAt")
        /**
        * 创建时间
        */
        private Date createdAt;
            @JsonProperty(value = "updatedAt")
        /**
        * 编辑时间
        */
        private Date updatedAt;
            @JsonProperty(value = "startAt")
        /**
        * 开始时间
        */
        private Date startAt;
            @JsonProperty(value = "endAt")
        /**
        * 结束时间
        */
        private Date endAt;
            @JsonProperty(value = "discountPrice")
        /**
        * 折扣价；单位分
        */
        private Long discountPrice;
            @JsonProperty(value = "period")
        /**
        * 限时折扣周期类型
        */
        private PeriodDTO period;
    
            public void setActivityId(Long activityId) {
            this.activityId = activityId;
        }

        public Long getActivityId() {
            return this.activityId;
        }

            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

            public void setDiscountType(String discountType) {
            this.discountType = discountType;
        }

        public String getDiscountType() {
            return this.discountType;
        }

            public void setDiscountValue(Long discountValue) {
            this.discountValue = discountValue;
        }

        public Long getDiscountValue() {
            return this.discountValue;
        }

            public void setQuota(Long quota) {
            this.quota = quota;
        }

        public Long getQuota() {
            return this.quota;
        }

            public void setQuotaType(Long quotaType) {
            this.quotaType = quotaType;
        }

        public Long getQuotaType() {
            return this.quotaType;
        }

            public void setValid(Boolean valid) {
            this.valid = valid;
        }

        public Boolean getValid() {
            return this.valid;
        }

            public void setEraseType(Long eraseType) {
            this.eraseType = eraseType;
        }

        public Long getEraseType() {
            return this.eraseType;
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

            public void setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
        }

        public Long getDiscountPrice() {
            return this.discountPrice;
        }

            public void setPeriod(PeriodDTO period) {
            this.period = period;
        }

        public PeriodDTO getPeriod() {
            return this.period;
        }

        }

    public static class PeriodDTO {
            @JsonProperty(value = "type")
        /**
        * 重复类型；每天:daily; 每周:weekly; 每月:monthly；
        */
        private String type;
            @JsonProperty(value = "days")
        /**
        * 按周、月重复时有值，按月时1-31，按周时0-6，周日是0
        */
        private Number[] days;
            @JsonProperty(value = "start_at")
        /**
        * 开始时间，格式：HH:mm
        */
        private String startAt;
            @JsonProperty(value = "end_at")
        /**
        * 结束时间，格式：HH:mm
        */
        private String endAt;
    
            public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

            public void setDays(Number[] days) {
            this.days = days;
        }

        public Number[] getDays() {
            return this.days;
        }

            public void setStartAt(String startAt) {
            this.startAt = startAt;
        }

        public String getStartAt() {
            return this.startAt;
        }

            public void setEndAt(String endAt) {
            this.endAt = endAt;
        }

        public String getEndAt() {
            return this.endAt;
        }

        }


}