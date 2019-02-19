package com.youzan.open.sdk.gen.v3_0_1.model;

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

public class YouzanCrmCustomerPointsChangelogGetResult implements APIResult {

    @JsonProperty(value = "total_results")
    /**
     * 总记录条数
     */
    private String totalResults;
    @JsonProperty(value = "total_points")
    /**
     * 用户总积分
     */
    private String totalPoints;
    @JsonProperty(value = "details")
    /**
     * 积分变动记录
     */
    private UserPointsChangeLogDTO[] details;

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getTotalResults() {
        return this.totalResults;
    }
    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getTotalPoints() {
        return this.totalPoints;
    }
    public void setDetails(UserPointsChangeLogDTO[] details) {
        this.details = details;
    }

    public UserPointsChangeLogDTO[] getDetails() {
        return this.details;
    }

    public static class UserPointsChangeLogDTO {
            @JsonProperty(value = "amount")
        /**
        * 积分值（负数为扣积分）
        */
        private String amount;
            @JsonProperty(value = "total")
        /**
        * 操作之后的最新积分数值
        */
        private String total;
            @JsonProperty(value = "description")
        /**
        * 描述
        */
        private String description;
            @JsonProperty(value = "created_time")
        /**
        * 创建时间
        */
        private String createdTime;
    
            public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getAmount() {
            return this.amount;
        }

            public void setTotal(String total) {
            this.total = total;
        }

        public String getTotal() {
            return this.total;
        }

            public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

            public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getCreatedTime() {
            return this.createdTime;
        }

        }


}