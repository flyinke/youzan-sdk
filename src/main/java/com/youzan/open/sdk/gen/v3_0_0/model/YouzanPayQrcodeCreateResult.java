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

public class YouzanPayQrcodeCreateResult implements APIResult {

    @JsonProperty(value = "qr_url")
    /**
     * 二维码收银台Url
     */
    private String qrUrl;
    @JsonProperty(value = "qr_code")
    /**
     * 二维码图标
     */
    private String qrCode;
    @JsonProperty(value = "qr_id")
    /**
     * 二维码标识
     */
    private Long qrId;

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getQrUrl() {
        return this.qrUrl;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getQrCode() {
        return this.qrCode;
    }
    public void setQrId(Long qrId) {
        this.qrId = qrId;
    }

    public Long getQrId() {
        return this.qrId;
    }


}