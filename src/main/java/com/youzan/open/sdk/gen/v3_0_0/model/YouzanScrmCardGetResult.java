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

public class YouzanScrmCardGetResult implements APIResult {

    @JsonProperty(value = "card_alias")
    /**
     * 商家会员卡的唯一标识
     */
    private String cardAlias;
    @JsonProperty(value = "name")
    /**
     * 会员卡名
     */
    private String name;
    @JsonProperty(value = "color_code")
    /**
     * 卡背景颜色
     */
    private String colorCode;
    @JsonProperty(value = "description")
    /**
     * 使用须知
     */
    private String description;
    @JsonProperty(value = "service_phone")
    /**
     * 客服电话
     */
    private String servicePhone;
    @JsonProperty(value = "activate_mode")
    /**
     * 激活方式，0:不需要激活；1:仅需手机激活；2:手机+填写资料
     */
    private Long activateMode;
    @JsonProperty(value = "sync_weixin_mode")
    /**
     * 微信卡包的同步设置
0:不同步；1:基于卡号核销；2:基于卡号和条形码；3:基于卡号和二维码
     */
    private Long syncWeixinMode;
    @JsonProperty(value = "rights")
    /**
     * 会员卡权益
     */
    private CardRightsV2DTO[] rights;
    @JsonProperty(value = "term_start_time")
    /**
     * 生效开始时间，如："2017-03-07 00:00:00"
     */
    private String termStartTime;
    @JsonProperty(value = "term_end_time")
    /**
     * 生效结束时间，如："2017-03-08 00:00:00"
     */
    private String termEndTime;
    @JsonProperty(value = "term_days")
    /**
     * 生效持续天数
     */
    private Long termDays;
    @JsonProperty(value = "term_type")
    /**
     * 生效方式类型，1:从领取开始无期限；2:从固定时刻开始，到固定时刻结束；
3:从领取开始，持续一段时长(termDays)
     */
    private Long termType;
    @JsonProperty(value = "term_to_card_alias")
    /**
     * 失效后，默认转变的会员卡，默认不转变
     */
    private String termToCardAlias;
    @JsonProperty(value = "is_allow_share")
    /**
     * 是否允许微信端分享 ，默认允许
     */
    private Boolean isAllowShare;
    @JsonProperty(value = "card_url")
    /**
     * 发卡链接
     */
    private String cardUrl;
    @JsonProperty(value = "sync_weixin_status")
    /**
     * 同步微信卡状态，1：不同步；2：审核中；3：通过；4：失败
     */
    private Long syncWeixinStatus;
    @JsonProperty(value = "status")
    /**
     * 会员卡状态，1：正常；2：已禁用；3：已删除
     */
    private Long status;
    @JsonProperty(value = "level")
    /**
     * 会员卡等级，没有则为0
     */
    private Long level;
    @JsonProperty(value = "card_type")
    /**
     * 卡的类型;1:无门槛卡,2:规则卡,3:付费卡
     */
    private Long cardType;
    @JsonProperty(value = "grant_condition")
    /**
     * 当卡为规则卡时卡的发放规则
     */
    private GrantCondition grantCondition;

    public void setCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
    }

    public String getCardAlias() {
        return this.cardAlias;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return this.colorCode;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getServicePhone() {
        return this.servicePhone;
    }
    public void setActivateMode(Long activateMode) {
        this.activateMode = activateMode;
    }

    public Long getActivateMode() {
        return this.activateMode;
    }
    public void setSyncWeixinMode(Long syncWeixinMode) {
        this.syncWeixinMode = syncWeixinMode;
    }

    public Long getSyncWeixinMode() {
        return this.syncWeixinMode;
    }
    public void setRights(CardRightsV2DTO[] rights) {
        this.rights = rights;
    }

    public CardRightsV2DTO[] getRights() {
        return this.rights;
    }
    public void setTermStartTime(String termStartTime) {
        this.termStartTime = termStartTime;
    }

    public String getTermStartTime() {
        return this.termStartTime;
    }
    public void setTermEndTime(String termEndTime) {
        this.termEndTime = termEndTime;
    }

    public String getTermEndTime() {
        return this.termEndTime;
    }
    public void setTermDays(Long termDays) {
        this.termDays = termDays;
    }

    public Long getTermDays() {
        return this.termDays;
    }
    public void setTermType(Long termType) {
        this.termType = termType;
    }

    public Long getTermType() {
        return this.termType;
    }
    public void setTermToCardAlias(String termToCardAlias) {
        this.termToCardAlias = termToCardAlias;
    }

    public String getTermToCardAlias() {
        return this.termToCardAlias;
    }
    public void setIsAllowShare(Boolean isAllowShare) {
        this.isAllowShare = isAllowShare;
    }

    public Boolean getIsAllowShare() {
        return this.isAllowShare;
    }
    public void setCardUrl(String cardUrl) {
        this.cardUrl = cardUrl;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }
    public void setSyncWeixinStatus(Long syncWeixinStatus) {
        this.syncWeixinStatus = syncWeixinStatus;
    }

    public Long getSyncWeixinStatus() {
        return this.syncWeixinStatus;
    }
    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }
    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getLevel() {
        return this.level;
    }
    public void setCardType(Long cardType) {
        this.cardType = cardType;
    }

    public Long getCardType() {
        return this.cardType;
    }
    public void setGrantCondition(GrantCondition grantCondition) {
        this.grantCondition = grantCondition;
    }

    public GrantCondition getGrantCondition() {
        return this.grantCondition;
    }

    public static class CouponRightsValueDTO {
            @JsonProperty(value = "coupon_id")
        /**
        * 优惠券ID
        */
        private Long couponId;
            @JsonProperty(value = "name")
        /**
        * 优惠券名称
        */
        private String name;
            @JsonProperty(value = "number")
        /**
        * 优惠券数量
        */
        private Long number;
    
            public void setCouponId(Long couponId) {
            this.couponId = couponId;
        }

        public Long getCouponId() {
            return this.couponId;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setNumber(Long number) {
            this.number = number;
        }

        public Long getNumber() {
            return this.number;
        }

        }

    public static class CardRightsV2DTO {
            @JsonProperty(value = "type")
        /**
        * 权益类型
        */
        private Long type;
            @JsonProperty(value = "name")
        /**
        * 权益名称
        */
        private String name;
            @JsonProperty(value = "is_available")
        /**
        * 是否可用
        */
        private Boolean isAvailable;
            @JsonProperty(value = "discount")
        /**
        * 折扣权益字段，折数 ，1表示0.01折 范围选择：1-100, type为2时必传
        */
        private Long discount;
            @JsonProperty(value = "points")
        /**
        * 积分权益字段，积分数量,type为4时必传
        */
        private Long points;
            @JsonProperty(value = "coupon")
        /**
        * 优惠券内容
        */
        private CouponRightsValueDTO[] coupon;
    
            public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
        }

        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

            public void setDiscount(Long discount) {
            this.discount = discount;
        }

        public Long getDiscount() {
            return this.discount;
        }

            public void setPoints(Long points) {
            this.points = points;
        }

        public Long getPoints() {
            return this.points;
        }

            public void setCoupon(CouponRightsValueDTO[] coupon) {
            this.coupon = coupon;
        }

        public CouponRightsValueDTO[] getCoupon() {
            return this.coupon;
        }

        }

    public static class GrantCondition {
            @JsonProperty(value = "trade_limit")
        /**
        * 累积下单成功次数
        */
        private Long tradeLimit;
            @JsonProperty(value = "amount_limit")
        /**
        * 累积消费金额(金额单位为分)
        */
        private Long amountLimit;
            @JsonProperty(value = "points_limit")
        /**
        * 累积积分
        */
        private Long pointsLimit;
    
            public void setTradeLimit(Long tradeLimit) {
            this.tradeLimit = tradeLimit;
        }

        public Long getTradeLimit() {
            return this.tradeLimit;
        }

            public void setAmountLimit(Long amountLimit) {
            this.amountLimit = amountLimit;
        }

        public Long getAmountLimit() {
            return this.amountLimit;
        }

            public void setPointsLimit(Long pointsLimit) {
            this.pointsLimit = pointsLimit;
        }

        public Long getPointsLimit() {
            return this.pointsLimit;
        }

        }


}