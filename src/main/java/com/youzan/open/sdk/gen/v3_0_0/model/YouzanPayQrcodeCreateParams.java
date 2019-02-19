package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanPayQrcodeCreateParams implements APIParams, FileParams  {

    /**
     * 标签 json格式字符串,例如:[1,2],表示有两个标签
     */
    private String labelIds;
    /**
     * 收款理由
     */
    private String qrName;
    /**
     * 价格（单位 分）。qr_type 为 QR_TYPE_FIXED 时，价格可为空。

     */
    private String qrPrice;
    /**
     * 二维码创建类型标记
     */
    private String qrSource;
    /**
     * 二维码类型.
QR_TYPE_FIXED_BY_PERSON ：无金额二维码，扫码后用户需自己输入金额；
QR_TYPE_NOLIMIT ： 确定金额二维码，可以重复支付;
QR_TYPE_DYNAMIC：确定金额二维码，只能被支付一次
     */
    private String qrType;

    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    public String getLabelIds() {
        return this.labelIds;
    }

    public void setQrName(String qrName) {
        this.qrName = qrName;
    }

    public String getQrName() {
        return this.qrName;
    }

    public void setQrPrice(String qrPrice) {
        this.qrPrice = qrPrice;
    }

    public String getQrPrice() {
        return this.qrPrice;
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


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (labelIds != null) {
            params.put("label_ids", labelIds);
        }
        if (qrName != null) {
            params.put("qr_name", qrName);
        }
        if (qrPrice != null) {
            params.put("qr_price", qrPrice);
        }
        if (qrSource != null) {
            params.put("qr_source", qrSource);
        }
        if (qrType != null) {
            params.put("qr_type", qrType);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}