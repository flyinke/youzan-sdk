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

public class YouzanTradeQrcodeExtCreateResult implements APIResult {

    @JsonProperty(value = "qr_id")
    /**
     * 二维码id
     */
    private Long qrId;
    @JsonProperty(value = "qr_name")
    /**
     * 二维码名称
     */
    private String qrName;
    @JsonProperty(value = "qr_price")
    /**
     * 二维码金额(单位/分)
     */
    private Long qrPrice;
    @JsonProperty(value = "qr_code")
    /**
     * 二维码图片data
     */
    private String qrCode;
    @JsonProperty(value = "qr_url")
    /**
     * 扫码连接
     */
    private String qrUrl;

    public void setQrId(Long qrId) {
        this.qrId = qrId;
    }

    public Long getQrId() {
        return this.qrId;
    }
    public void setQrName(String qrName) {
        this.qrName = qrName;
    }

    public String getQrName() {
        return this.qrName;
    }
    public void setQrPrice(Long qrPrice) {
        this.qrPrice = qrPrice;
    }

    public Long getQrPrice() {
        return this.qrPrice;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getQrCode() {
        return this.qrCode;
    }
    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getQrUrl() {
        return this.qrUrl;
    }


}