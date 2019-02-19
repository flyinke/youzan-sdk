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

public class YouzanPayQrcodeGetResult implements APIResult {

    @JsonProperty(value = "qr_id")
    /**
     * 二维码图片id
     */
    private Long qrId;
    @JsonProperty(value = "qr_name")
    /**
     * 二维码名称
     */
    private String qrName;
    @JsonProperty(value = "qr_price")
    /**
     * 二维码金额，以分为单位
     */
    private Long qrPrice;
    @JsonProperty(value = "qr_code")
    /**
     * 图片源信息
     */
    private String qrCode;
    @JsonProperty(value = "qr_url")
    /**
     * 二维码关联URL
     */
    private String qrUrl;
    @JsonProperty(value = "qr_type")
    /**
     * 二维码类型
     */
    private String qrType;
    @JsonProperty(value = "qr_source")
    /**
     * 二维码生成来源
     */
    private String qrSource;
    @JsonProperty(value = "activityInfo")
    /**
     * 优惠信息
     */
    private String activityInfo;
    @JsonProperty(value = "qr_created_time")
    /**
     * 生成时间
     */
    private String qrCreatedTime;

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
    public void setQrType(String qrType) {
        this.qrType = qrType;
    }

    public String getQrType() {
        return this.qrType;
    }
    public void setQrSource(String qrSource) {
        this.qrSource = qrSource;
    }

    public String getQrSource() {
        return this.qrSource;
    }
    public void setActivityInfo(String activityInfo) {
        this.activityInfo = activityInfo;
    }

    public String getActivityInfo() {
        return this.activityInfo;
    }
    public void setQrCreatedTime(String qrCreatedTime) {
        this.qrCreatedTime = qrCreatedTime;
    }

    public String getQrCreatedTime() {
        return this.qrCreatedTime;
    }


}