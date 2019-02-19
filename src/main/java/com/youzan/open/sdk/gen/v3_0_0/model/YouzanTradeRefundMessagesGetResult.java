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

public class YouzanTradeRefundMessagesGetResult implements APIResult {

    @JsonProperty(value = "refund_messages")
    /**
     * 退款记录
     */
    private RefundMessages[] refundMessages;

    public void setRefundMessages(RefundMessages[] refundMessages) {
        this.refundMessages = refundMessages;
    }

    public RefundMessages[] getRefundMessages() {
        return this.refundMessages;
    }

    public static class RefundMessages {
            @JsonProperty(value = "owner_role")
        /**
        * 角色 2买家 3卖家
        */
        private Long ownerRole;
            @JsonProperty(value = "created")
        /**
        * 退款时间
        */
        private Date created;
            @JsonProperty(value = "refund_id")
        /**
        * 退款id
        */
        private String refundId;
            @JsonProperty(value = "content")
        /**
        * 描述
        */
        private String content;
    
            public void setOwnerRole(Long ownerRole) {
            this.ownerRole = ownerRole;
        }

        public Long getOwnerRole() {
            return this.ownerRole;
        }

            public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }

            public void setRefundId(String refundId) {
            this.refundId = refundId;
        }

        public String getRefundId() {
            return this.refundId;
        }

            public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }

        }


}