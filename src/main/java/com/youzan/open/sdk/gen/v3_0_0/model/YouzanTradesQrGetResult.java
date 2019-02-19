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

public class YouzanTradesQrGetResult implements APIResult {

    @JsonProperty(value = "qr_trades")
    /**
     * 搜索到的交易列表
     */
    private TradePayQrcode[] qrTrades;
    @JsonProperty(value = "total_results")
    /**
     * 搜索到的交易总数
     */
    private Long totalResults;

    public void setQrTrades(TradePayQrcode[] qrTrades) {
        this.qrTrades = qrTrades;
    }

    public TradePayQrcode[] getQrTrades() {
        return this.qrTrades;
    }
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public static class TradePayQrcode {
            @JsonProperty(value = "status")
        /**
        * 交易状态。取值范围：<br>WAIT_RECEIVED（待收款）<br>TRADE_RECEIVED（已收款）<br>TRADE_EXPIRED（已过期，即：48小时内未付款）
        */
        private String status;
            @JsonProperty(value = "pay_type")
        /**
        * 支付类型。取值范围：<br>WXPAY (微信支付)<br>ALIWAP (支付宝付款)<br>ALIPAY (支付宝pc付款)<br>UNIONPAY (银行卡付款)<br>TENPAY (财付通付款)<br>UNIONWAP (银行卡付款)<br>PEERPAY (找人代付)<br>UMPAY (信用卡付款)<br>CODPAY (货到付款)<br>WXPAY_BIGUNSIGN (微信支付)<br>WXPAY_BIGSIGN (微信支付)<br>BAIDUWAP (储蓄卡付款)<br>WXAPPPAY (微信支付)<br>MERGED_PAY (分销采购单合并付款)<br>PRESENT
        */
        private String payType;
            @JsonProperty(value = "qr_name")
        /**
        * 收款理由
        */
        private String qrName;
            @JsonProperty(value = "qr_price")
        /**
        * 收款金额。精确到2位小数；单位：元。
        */
        private Float qrPrice;
            @JsonProperty(value = "outer_tid")
        /**
        * 外部交易编号。比如，如果支付方式是微信支付，就是财付通的交易单号
        */
        private String outerTid;
            @JsonProperty(value = "created_date")
        /**
        * 交易创建时间
        */
        private Date createdDate;
            @JsonProperty(value = "payer_nick")
        /**
        * 付款者昵称
        */
        private String payerNick;
            @JsonProperty(value = "real_price")
        /**
        * 实际收款金额。精确到2位小数；单位：元。
        */
        private Float realPrice;
            @JsonProperty(value = "pay_date")
        /**
        * 支付时间
        */
        private Date payDate;
            @JsonProperty(value = "qr_id")
        /**
        * 二维码编号
        */
        private String qrId;
            @JsonProperty(value = "book_date")
        /**
        * 预定时间
        */
        private Date bookDate;
            @JsonProperty(value = "tid")
        /**
        * 交易编号
        */
        private String tid;
            @JsonProperty(value = "qr_url")
        /**
        * 可以访问的支付页URL
        */
        private String qrUrl;
    
            public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

            public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayType() {
            return this.payType;
        }

            public void setQrName(String qrName) {
            this.qrName = qrName;
        }

        public String getQrName() {
            return this.qrName;
        }

            public void setQrPrice(Float qrPrice) {
            this.qrPrice = qrPrice;
        }

        public Float getQrPrice() {
            return this.qrPrice;
        }

            public void setOuterTid(String outerTid) {
            this.outerTid = outerTid;
        }

        public String getOuterTid() {
            return this.outerTid;
        }

            public void setCreatedDate(Date createdDate) {
            this.createdDate = createdDate;
        }

        public Date getCreatedDate() {
            return this.createdDate;
        }

            public void setPayerNick(String payerNick) {
            this.payerNick = payerNick;
        }

        public String getPayerNick() {
            return this.payerNick;
        }

            public void setRealPrice(Float realPrice) {
            this.realPrice = realPrice;
        }

        public Float getRealPrice() {
            return this.realPrice;
        }

            public void setPayDate(Date payDate) {
            this.payDate = payDate;
        }

        public Date getPayDate() {
            return this.payDate;
        }

            public void setQrId(String qrId) {
            this.qrId = qrId;
        }

        public String getQrId() {
            return this.qrId;
        }

            public void setBookDate(Date bookDate) {
            this.bookDate = bookDate;
        }

        public Date getBookDate() {
            return this.bookDate;
        }

            public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }

            public void setQrUrl(String qrUrl) {
            this.qrUrl = qrUrl;
        }

        public String getQrUrl() {
            return this.qrUrl;
        }

        }


}