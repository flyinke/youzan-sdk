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

public class YouzanLogisticsFeeGetResult implements APIResult {

    @JsonProperty(value = "countyId")
    /**
     * 区县id
     */
    private Long countyId;
    @JsonProperty(value = "totalPostage")
    /**
     * 订单总快递费
     */
    private Long totalPostage;
    @JsonProperty(value = "itemsPostage")
    /**
     * 商品运费详情 key=itemId, value=postage
     */
    private Map itemsPostage;

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public Long getCountyId() {
        return this.countyId;
    }
    public void setTotalPostage(Long totalPostage) {
        this.totalPostage = totalPostage;
    }

    public Long getTotalPostage() {
        return this.totalPostage;
    }
    public void setItemsPostage(Map itemsPostage) {
        this.itemsPostage = itemsPostage;
    }

    public Map getItemsPostage() {
        return this.itemsPostage;
    }

    public static class Map {
            @JsonProperty(value = "skuId")
        /**
        * 待更新商品id
        */
        private Long skuId;
            @JsonProperty(value = "result")
        /**
        * 是否更新成功
        */
        private Boolean result;
    
            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setResult(Boolean result) {
            this.result = result;
        }

        public Boolean getResult() {
            return this.result;
        }

        }


}