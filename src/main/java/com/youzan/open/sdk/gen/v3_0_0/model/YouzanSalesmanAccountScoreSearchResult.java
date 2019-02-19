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

public class YouzanSalesmanAccountScoreSearchResult implements APIResult {

    @JsonProperty(value = "accumulations")
    /**
     * 业绩统计列表
     */
    private accumulationsItemDTO[] accumulations;
    @JsonProperty(value = "total_results")
    /**
     * 记录总数
     */
    private Long totalResults;

    public void setAccumulations(accumulationsItemDTO[] accumulations) {
        this.accumulations = accumulations;
    }

    public accumulationsItemDTO[] getAccumulations() {
        return this.accumulations;
    }
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public static class accumulationsItemDTO {
            @JsonProperty(value = "manual_settle_order_amount")
        /**
        * 人工结算订单金额
        */
        private String manualSettleOrderAmount;
            @JsonProperty(value = "manual_settle_order_num")
        /**
        * 人工结算订单数
        */
        private String manualSettleOrderNum;
            @JsonProperty(value = "auto_settle_order_amount")
        /**
        * 自动结算订单金额
        */
        private String autoSettleOrderAmount;
            @JsonProperty(value = "auto_settle_order_num")
        /**
        * 自动结算订单数
        */
        private String autoSettleOrderNum;
            @JsonProperty(value = "wait_settle_money")
        /**
        * 待结算佣金
        */
        private String waitSettleMoney;
            @JsonProperty(value = "settle_money")
        /**
        * 已结算佣金
        */
        private String settleMoney;
            @JsonProperty(value = "mobile")
        /**
        * 手机号
        */
        private String mobile;
            @JsonProperty(value = "nickname")
        /**
        * 昵称
        */
        private String nickname;
    
            public void setManualSettleOrderAmount(String manualSettleOrderAmount) {
            this.manualSettleOrderAmount = manualSettleOrderAmount;
        }

        public String getManualSettleOrderAmount() {
            return this.manualSettleOrderAmount;
        }

            public void setManualSettleOrderNum(String manualSettleOrderNum) {
            this.manualSettleOrderNum = manualSettleOrderNum;
        }

        public String getManualSettleOrderNum() {
            return this.manualSettleOrderNum;
        }

            public void setAutoSettleOrderAmount(String autoSettleOrderAmount) {
            this.autoSettleOrderAmount = autoSettleOrderAmount;
        }

        public String getAutoSettleOrderAmount() {
            return this.autoSettleOrderAmount;
        }

            public void setAutoSettleOrderNum(String autoSettleOrderNum) {
            this.autoSettleOrderNum = autoSettleOrderNum;
        }

        public String getAutoSettleOrderNum() {
            return this.autoSettleOrderNum;
        }

            public void setWaitSettleMoney(String waitSettleMoney) {
            this.waitSettleMoney = waitSettleMoney;
        }

        public String getWaitSettleMoney() {
            return this.waitSettleMoney;
        }

            public void setSettleMoney(String settleMoney) {
            this.settleMoney = settleMoney;
        }

        public String getSettleMoney() {
            return this.settleMoney;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return this.nickname;
        }

        }


}