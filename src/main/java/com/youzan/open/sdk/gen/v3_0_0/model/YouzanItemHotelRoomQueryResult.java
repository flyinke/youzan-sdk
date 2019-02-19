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

public class YouzanItemHotelRoomQueryResult implements APIResult {

    @JsonProperty(value = "hotel_skus")
    /**
     * 房态列表
     */
    private HotelSkuModel[] hotelSkus;

    public void setHotelSkus(HotelSkuModel[] hotelSkus) {
        this.hotelSkus = hotelSkus;
    }

    public HotelSkuModel[] getHotelSkus() {
        return this.hotelSkus;
    }

    public static class HotelSkuModel {
            @JsonProperty(value = "hotelSkuId")
        /**
        * 酒店库存ID
        */
        private Long hotelSkuId;
            @JsonProperty(value = "itemId")
        /**
        * 商品ID
        */
        private Long itemId;
            @JsonProperty(value = "kdtId")
        /**
        * 店铺ID
        */
        private Long kdtId;
            @JsonProperty(value = "stockDate")
        /**
        * 酒店库存日期
        */
        private String stockDate;
            @JsonProperty(value = "itemSkuId")
        /**
        * goods_sku 表的id
        */
        private Long itemSkuId;
            @JsonProperty(value = "status")
        /**
        * 房间状态: 0 关闭, 1 开启
        */
        private Long status;
            @JsonProperty(value = "stockNum")
        /**
        * 库存数量
        */
        private Long stockNum;
            @JsonProperty(value = "price")
        /**
        * 房间价格（分）
        */
        private Long price;
    
            public void setHotelSkuId(Long hotelSkuId) {
            this.hotelSkuId = hotelSkuId;
        }

        public Long getHotelSkuId() {
            return this.hotelSkuId;
        }

            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setStockDate(String stockDate) {
            this.stockDate = stockDate;
        }

        public String getStockDate() {
            return this.stockDate;
        }

            public void setItemSkuId(Long itemSkuId) {
            this.itemSkuId = itemSkuId;
        }

        public Long getItemSkuId() {
            return this.itemSkuId;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

            public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

        }


}