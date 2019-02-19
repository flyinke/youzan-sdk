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

public class YouzanMultistoreGoodsDeliveryListResult implements APIResult {

    @JsonProperty(value = "list")
    /**
     * 网点下所有商品的配送方式
     */
    private MultistoreDeliverySetting[] list;

    public void setList(MultistoreDeliverySetting[] list) {
        this.list = list;
    }

    public MultistoreDeliverySetting[] getList() {
        return this.list;
    }

    public static class MultistoreDeliverySetting {
            @JsonProperty(value = "self_fetch")
        /**
        * 是否支持自提：1支持；0不支持
        */
        private Long selfFetch;
            @JsonProperty(value = "express")
        /**
        * 是否支持快递：1支持；0不支持
        */
        private Long express;
            @JsonProperty(value = "shop_id")
        /**
        * 网点id
        */
        private Long shopId;
            @JsonProperty(value = "local_delivery")
        /**
        * 是否支持同城送：1支持；0不支持
        */
        private Long localDelivery;
            @JsonProperty(value = "goods_id")
        /**
        * 商品id
        */
        private Long goodsId;
    
            public void setSelfFetch(Long selfFetch) {
            this.selfFetch = selfFetch;
        }

        public Long getSelfFetch() {
            return this.selfFetch;
        }

            public void setExpress(Long express) {
            this.express = express;
        }

        public Long getExpress() {
            return this.express;
        }

            public void setShopId(Long shopId) {
            this.shopId = shopId;
        }

        public Long getShopId() {
            return this.shopId;
        }

            public void setLocalDelivery(Long localDelivery) {
            this.localDelivery = localDelivery;
        }

        public Long getLocalDelivery() {
            return this.localDelivery;
        }

            public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public Long getGoodsId() {
            return this.goodsId;
        }

        }


}