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

public class YouzanTradeQrcodeExtCreateParams implements APIParams, FileParams  {

    /**
     * 外部订单号（不超过30个字符）
     */
    private String outId;
    /**
     * 外部来源（由有赞分配），需要跟有赞申请才能使用
     */
    private String outSource;
    /**
     * 二维码名称
     */
    private String qrName;
    /**
     * 分为单位
     */
    private Long qrPrice;
    /**
     * 网点编号
     */
    private String shopId;
    /**
     * 网点类型
     */
    private String shopType;

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public String getOutId() {
        return this.outId;
    }

    public void setOutSource(String outSource) {
        this.outSource = outSource;
    }

    public String getOutSource() {
        return this.outSource;
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

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopType() {
        return this.shopType;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (outId != null) {
            params.put("out_id", outId);
        }
        if (outSource != null) {
            params.put("out_source", outSource);
        }
        if (qrName != null) {
            params.put("qr_name", qrName);
        }
        if (qrPrice != null) {
            params.put("qr_price", qrPrice);
        }
        if (shopId != null) {
            params.put("shop_id", shopId);
        }
        if (shopType != null) {
            params.put("shop_type", shopType);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}