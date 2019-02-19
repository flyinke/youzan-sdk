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

public class YouzanMultistoreSettingGetResult implements APIResult {

    @JsonProperty(value = "status")
    /**
     * 0表示关闭多门店，1表示开启多门店
     */
    private Long status;
    @JsonProperty(value = "default_offline_id")
    /**
     * 设为总店的网点id
     */
    private Long defaultOfflineId;
    @JsonProperty(value = "separate_stock")
    /**
     * 1表示开启独立库存，0表示关闭。（注意：独立价格和独立库存必须同时开启，同时关闭）
     */
    private Long separateStock;
    @JsonProperty(value = "separate_price")
    /**
     * 1表示开启独立价格，0表示关闭。（注意：独立价格和独立库存必须同时开启，同时关闭）
     */
    private Long separatePrice;
    @JsonProperty(value = "sold_out_recommend")
    /**
     * 1表示开启商品售罄时推荐可售网点，0表示关闭
     */
    private Long soldOutRecommend;

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }
    public void setDefaultOfflineId(Long defaultOfflineId) {
        this.defaultOfflineId = defaultOfflineId;
    }

    public Long getDefaultOfflineId() {
        return this.defaultOfflineId;
    }
    public void setSeparateStock(Long separateStock) {
        this.separateStock = separateStock;
    }

    public Long getSeparateStock() {
        return this.separateStock;
    }
    public void setSeparatePrice(Long separatePrice) {
        this.separatePrice = separatePrice;
    }

    public Long getSeparatePrice() {
        return this.separatePrice;
    }
    public void setSoldOutRecommend(Long soldOutRecommend) {
        this.soldOutRecommend = soldOutRecommend;
    }

    public Long getSoldOutRecommend() {
        return this.soldOutRecommend;
    }


}