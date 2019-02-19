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

public class YouzanUmpCouponConsumeVerifylogsGetResult implements APIResult {

    @JsonProperty(value = "verifylogs")
    /**
     * 验证列表
     */
    private UmpPromotionVerifylog[] verifylogs;

    public void setVerifylogs(UmpPromotionVerifylog[] verifylogs) {
        this.verifylogs = verifylogs;
    }

    public UmpPromotionVerifylog[] getVerifylogs() {
        return this.verifylogs;
    }

    public static class UmpPromotionVerifylog {
            @JsonProperty(value = "id")
        /**
        * 记录的ID
        */
        private String id;
            @JsonProperty(value = "group_id")
        /**
        * 优惠的ID
        */
        private String groupId;
            @JsonProperty(value = "title")
        /**
        * 优惠券／优惠码的名称
        */
        private String title;
            @JsonProperty(value = "value")
        /**
        * 面额。单位：元，精确到分
        */
        private String value;
            @JsonProperty(value = "condition")
        /**
        * 满额条件。单位：元，精确到分
        */
        private String condition;
            @JsonProperty(value = "description")
        /**
        * 使用说明
        */
        private String description;
            @JsonProperty(value = "verify_type")
        /**
        * 验证方式 1扫码 2输入id
        */
        private String verifyType;
            @JsonProperty(value = "verify_code")
        /**
        * 核销号码
        */
        private String verifyCode;
            @JsonProperty(value = "trade_no")
        /**
        * 交易号
        */
        private String tradeNo;
            @JsonProperty(value = "state")
        /**
        * 状态
        */
        private String state;
            @JsonProperty(value = "admin_nickname")
        /**
        * 验证人员
        */
        private String adminNickname;
            @JsonProperty(value = "created_at")
        /**
        * 验证时间
        */
        private Date createdAt;
            @JsonProperty(value = "promocard_id")
        /**
        * 优惠券ID
        */
        private String promocardId;
            @JsonProperty(value = "promocode_id")
        /**
        * 优惠码ID
        */
        private String promocodeId;
    
            public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }

            public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getGroupId() {
            return this.groupId;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

            public void setCondition(String condition) {
            this.condition = condition;
        }

        public String getCondition() {
            return this.condition;
        }

            public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

            public void setVerifyType(String verifyType) {
            this.verifyType = verifyType;
        }

        public String getVerifyType() {
            return this.verifyType;
        }

            public void setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
        }

        public String getVerifyCode() {
            return this.verifyCode;
        }

            public void setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
        }

        public String getTradeNo() {
            return this.tradeNo;
        }

            public void setState(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }

            public void setAdminNickname(String adminNickname) {
            this.adminNickname = adminNickname;
        }

        public String getAdminNickname() {
            return this.adminNickname;
        }

            public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        public Date getCreatedAt() {
            return this.createdAt;
        }

            public void setPromocardId(String promocardId) {
            this.promocardId = promocardId;
        }

        public String getPromocardId() {
            return this.promocardId;
        }

            public void setPromocodeId(String promocodeId) {
            this.promocodeId = promocodeId;
        }

        public String getPromocodeId() {
            return this.promocodeId;
        }

        }


}