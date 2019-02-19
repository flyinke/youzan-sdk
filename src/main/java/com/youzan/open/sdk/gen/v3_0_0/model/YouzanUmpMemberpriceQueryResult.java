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

public class YouzanUmpMemberpriceQueryResult implements APIResult {

    @JsonProperty(value = "response")
    /**
     * 自定义会员价
     */
    private ItemMemberPrice[] response;

    public void setResponse(ItemMemberPrice[] response) {
        this.response = response;
    }

    public ItemMemberPrice[] getResponse() {
        return this.response;
    }

    public static class SkuMemberPrice {
            @JsonProperty(value = "skuId")
        /**
        * skuId
        */
        private Long skuId;
            @JsonProperty(value = "price")
        /**
        * 原价，单位分
        */
        private Long price;
            @JsonProperty(value = "cards")
        /**
        * 自定义会员价信息
        */
        private MemberPrice[] cards;
    
            public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }

            public void setPrice(Long price) {
            this.price = price;
        }

        public Long getPrice() {
            return this.price;
        }

            public void setCards(MemberPrice[] cards) {
            this.cards = cards;
        }

        public MemberPrice[] getCards() {
            return this.cards;
        }

        }

    public static class ItemMemberPrice {
            @JsonProperty(value = "itemId")
        /**
        * 商品id
        */
        private Long itemId;
            @JsonProperty(value = "skus")
        /**
        * sku自定义会员价信息
        */
        private SkuMemberPrice[] skus;
    
            public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }

            public void setSkus(SkuMemberPrice[] skus) {
            this.skus = skus;
        }

        public SkuMemberPrice[] getSkus() {
            return this.skus;
        }

        }

    public static class MemberPrice {
            @JsonProperty(value = "cardId")
        /**
        * 会员卡id
        */
        private Long cardId;
            @JsonProperty(value = "discountType")
        /**
        * 优惠类型 1：减钱 2：指定价格
        */
        private Long discountType;
            @JsonProperty(value = "discountValue")
        /**
        * 优惠值
        */
        private Long discountValue;
    
            public void setCardId(Long cardId) {
            this.cardId = cardId;
        }

        public Long getCardId() {
            return this.cardId;
        }

            public void setDiscountType(Long discountType) {
            this.discountType = discountType;
        }

        public Long getDiscountType() {
            return this.discountType;
        }

            public void setDiscountValue(Long discountValue) {
            this.discountValue = discountValue;
        }

        public Long getDiscountValue() {
            return this.discountValue;
        }

        }


}