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

public class YouzanPayQrcodesGetResult implements APIResult {

    @JsonProperty(value = "total_results")
    /**
     * 搜索到符合条件的结果总数
     */
    private QrTotalResult totalResults;
    @JsonProperty(value = "qrcodes")
    /**
     * 二维码生成记录,包含is_discount(是否有折扣)、activityInfo(折扣详情)，如果没有折扣则is_discount、activityInfo两个字段不返回
     */
    private TradeCashierQrcode[] qrcodes;

    public void setTotalResults(QrTotalResult totalResults) {
        this.totalResults = totalResults;
    }

    public QrTotalResult getTotalResults() {
        return this.totalResults;
    }
    public void setQrcodes(TradeCashierQrcode[] qrcodes) {
        this.qrcodes = qrcodes;
    }

    public TradeCashierQrcode[] getQrcodes() {
        return this.qrcodes;
    }

    public static class TradeCashierQrcode {
            @JsonProperty(value = "qr_name")
        /**
        * 收款名称
        */
        private String qrName;
            @JsonProperty(value = "qr_price")
        /**
        * 收款金额。精确到2位小数；单位：元。
        */
        private Float qrPrice;
            @JsonProperty(value = "qr_code")
        /**
        * 收款码编码
        */
        private String qrCode;
            @JsonProperty(value = "activityInfo")
        /**
        * 收款码当前关联优惠信息。
        */
        private String activityInfo;
            @JsonProperty(value = "qr_source")
        /**
        * 收款码创建类型标记。<br>类型有：<br>INSIDE（内部创建）<br>OUTSIDE（外部创建）
        */
        private String qrSource;
            @JsonProperty(value = "qr_type")
        /**
        * 收款码类型。<br>类型有：<br>QR_TYPE_FIXED（收款码和店铺绑定并且可多次支付）<br>QR_TYPE_NOLIMIT（收款码可多次支付）<br>QR_TYPE_DYNAMIC（收款码只能被支付一次）
        */
        private String qrType;
            @JsonProperty(value = "qr_id")
        /**
        * 收款码编号
        */
        private String qrId;
            @JsonProperty(value = "qr_url")
        /**
        * 可以访问的支付页URL
        */
        private String qrUrl;
            @JsonProperty(value = "qr_created_time")
        /**
        * 收款码创建日期
        */
        private String qrCreatedTime;
    
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

            public void setQrCode(String qrCode) {
            this.qrCode = qrCode;
        }

        public String getQrCode() {
            return this.qrCode;
        }

            public void setActivityInfo(String activityInfo) {
            this.activityInfo = activityInfo;
        }

        public String getActivityInfo() {
            return this.activityInfo;
        }

            public void setQrSource(String qrSource) {
            this.qrSource = qrSource;
        }

        public String getQrSource() {
            return this.qrSource;
        }

            public void setQrType(String qrType) {
            this.qrType = qrType;
        }

        public String getQrType() {
            return this.qrType;
        }

            public void setQrId(String qrId) {
            this.qrId = qrId;
        }

        public String getQrId() {
            return this.qrId;
        }

            public void setQrUrl(String qrUrl) {
            this.qrUrl = qrUrl;
        }

        public String getQrUrl() {
            return this.qrUrl;
        }

            public void setQrCreatedTime(String qrCreatedTime) {
            this.qrCreatedTime = qrCreatedTime;
        }

        public String getQrCreatedTime() {
            return this.qrCreatedTime;
        }

        }

    public static class QrTotalResult {
            @JsonProperty(value = "total")
        /**
        * 结果总数
        */
        private Integer total;
    
            public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getTotal() {
            return this.total;
        }

        }


}