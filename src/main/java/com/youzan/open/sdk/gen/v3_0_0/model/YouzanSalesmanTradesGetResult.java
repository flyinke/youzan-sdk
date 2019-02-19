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

public class YouzanSalesmanTradesGetResult implements APIResult {

    @JsonProperty(value = "total_results")
    /**
     * 记录总数
     */
    private Long totalResults;
    @JsonProperty(value = "trades")
    /**
     * 推广订单列表
     */
    private SalesmanTradeDetail[] trades;

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
    public void setTrades(SalesmanTradeDetail[] trades) {
        this.trades = trades;
    }

    public SalesmanTradeDetail[] getTrades() {
        return this.trades;
    }

    public static class SalesmanTradeItem {
            @JsonProperty(value = "price")
        /**
        * 商品价格(元)
        */
        private String price;
            @JsonProperty(value = "num")
        /**
        * 商品数量
        */
        private Long num;
            @JsonProperty(value = "title")
        /**
        * 商品名称
        */
        private String title;
            @JsonProperty(value = "is_join")
        /**
        * 商品是否参与推广0:不参与1参与
        */
        private Long isJoin;
            @JsonProperty(value = "num_iid")
        /**
        * 商品ID
        */
        private String numIid;
            @JsonProperty(value = "i_rate")
        /**
        * 商品提成比例(%)
        */
        private String iRate;
            @JsonProperty(value = "ii_rate")
        /**
        * 商品邀请奖励提成比例(%)
        */
        private String iiRate;
            @JsonProperty(value = "i_cps_money")
        /**
        * 商品提成奖励(元)
        */
        private String iCpsMoney;
            @JsonProperty(value = "ii_cps_money")
        /**
        * 商品邀请奖励提成奖励(元)
        */
        private String iiCpsMoney;
    
            public void setPrice(String price) {
            this.price = price;
        }

        public String getPrice() {
            return this.price;
        }

            public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }

            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setIsJoin(Long isJoin) {
            this.isJoin = isJoin;
        }

        public Long getIsJoin() {
            return this.isJoin;
        }

            public void setNumIid(String numIid) {
            this.numIid = numIid;
        }

        public String getNumIid() {
            return this.numIid;
        }

            public void setIRate(String iRate) {
            this.iRate = iRate;
        }

        public String getIRate() {
            return this.iRate;
        }

            public void setIiRate(String iiRate) {
            this.iiRate = iiRate;
        }

        public String getIiRate() {
            return this.iiRate;
        }

            public void setICpsMoney(String iCpsMoney) {
            this.iCpsMoney = iCpsMoney;
        }

        public String getICpsMoney() {
            return this.iCpsMoney;
        }

            public void setIiCpsMoney(String iiCpsMoney) {
            this.iiCpsMoney = iiCpsMoney;
        }

        public String getIiCpsMoney() {
            return this.iiCpsMoney;
        }

        }

    public static class SalesmanTradeDetail {
            @JsonProperty(value = "seller")
        /**
        * 销售员标记
        */
        private String seller;
            @JsonProperty(value = "order_no")
        /**
        * 推广订单号
        */
        private String orderNo;
            @JsonProperty(value = "money")
        /**
        * 订单总额(元),扣除运费
        */
        private String money;
            @JsonProperty(value = "created_at")
        /**
        * 下单时间
        */
        private String createdAt;
            @JsonProperty(value = "cps_money")
        /**
        * 提成金额(元)
        */
        private String cpsMoney;
            @JsonProperty(value = "state")
        /**
        * 订单状态:3:待付款，5:已付款，6:已发货，100:交易完成
        */
        private Long state;
            @JsonProperty(value = "phone")
        /**
        * 销售员手机号
        */
        private String phone;
            @JsonProperty(value = "items")
        /**
        * 销售员推广订单详细商品提成信息数据结构
        */
        private SalesmanTradeItem[] items;
            @JsonProperty(value = "settle_state")
        /**
        * 结算状态1:待结算 2:已结算 3:余额不足 4:结算异常，等待重试 5:货到付款
        */
        private Long settleState;
            @JsonProperty(value = "auto_settle")
        /**
        * 是否自动结算0:人工结算1:自动结算
        */
        private Long autoSettle;
    
            public void setSeller(String seller) {
            this.seller = seller;
        }

        public String getSeller() {
            return this.seller;
        }

            public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderNo() {
            return this.orderNo;
        }

            public void setMoney(String money) {
            this.money = money;
        }

        public String getMoney() {
            return this.money;
        }

            public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getCreatedAt() {
            return this.createdAt;
        }

            public void setCpsMoney(String cpsMoney) {
            this.cpsMoney = cpsMoney;
        }

        public String getCpsMoney() {
            return this.cpsMoney;
        }

            public void setState(Long state) {
            this.state = state;
        }

        public Long getState() {
            return this.state;
        }

            public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return this.phone;
        }

            public void setItems(SalesmanTradeItem[] items) {
            this.items = items;
        }

        public SalesmanTradeItem[] getItems() {
            return this.items;
        }

            public void setSettleState(Long settleState) {
            this.settleState = settleState;
        }

        public Long getSettleState() {
            return this.settleState;
        }

            public void setAutoSettle(Long autoSettle) {
            this.autoSettle = autoSettle;
        }

        public Long getAutoSettle() {
            return this.autoSettle;
        }

        }


}