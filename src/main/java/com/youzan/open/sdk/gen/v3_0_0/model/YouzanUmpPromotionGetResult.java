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

public class YouzanUmpPromotionGetResult implements APIResult {

    @JsonProperty(value = "item_promotion")
    /**
     * 商品级优惠信息，没有优惠则为null
     */
    private UmpPromotionItem itemPromotion;
    @JsonProperty(value = "order_promotions")
    /**
     * 订单级优惠信息，没有优惠则为空数组
     */
    private UmpPromotionOrder[] orderPromotions;
    @JsonProperty(value = "goods_points")
    /**
     * 商品参与积分抵扣活动优惠信息，没有参与则为null
     */
    private UmpPromotionPointsexchange goodsPoints;
    @JsonProperty(value = "package_buy")
    /**
     * 商品参与的优惠套餐活动优惠信息，没有参与则为null
     */
    private UmpPromotionPackagebuyDetail packageBuy;

    public void setItemPromotion(UmpPromotionItem itemPromotion) {
        this.itemPromotion = itemPromotion;
    }

    public UmpPromotionItem getItemPromotion() {
        return this.itemPromotion;
    }
    public void setOrderPromotions(UmpPromotionOrder[] orderPromotions) {
        this.orderPromotions = orderPromotions;
    }

    public UmpPromotionOrder[] getOrderPromotions() {
        return this.orderPromotions;
    }
    public void setGoodsPoints(UmpPromotionPointsexchange goodsPoints) {
        this.goodsPoints = goodsPoints;
    }

    public UmpPromotionPointsexchange getGoodsPoints() {
        return this.goodsPoints;
    }
    public void setPackageBuy(UmpPromotionPackagebuyDetail packageBuy) {
        this.packageBuy = packageBuy;
    }

    public UmpPromotionPackagebuyDetail getPackageBuy() {
        return this.packageBuy;
    }

    public static class UmpPromotionItem {
            @JsonProperty(value = "promotion_type_id")
        /**
        * 优惠活动类型编码：
						<br>2：团购
						<br>3：降价拍
						<br>4：多人拼团
						<br>6：秒杀
						<br>10：会员折扣
						<br>11：限时折扣
        */
        private Long promotionTypeId;
            @JsonProperty(value = "promotion_id")
        /**
        * 优惠活动编码
        */
        private Long promotionId;
            @JsonProperty(value = "promotion_alias")
        /**
        * 优惠活动别名
        */
        private String promotionAlias;
            @JsonProperty(value = "promotion_name")
        /**
        * 优惠活动名称
        */
        private String promotionName;
            @JsonProperty(value = "desc")
        /**
        * 优惠活动描述
        */
        private String desc;
            @JsonProperty(value = "start_date")
        /**
        * 优惠活动开始时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startDate;
            @JsonProperty(value = "end_date")
        /**
        * 优惠活动结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endDate;
            @JsonProperty(value = "sku_id_list")
        /**
        * sku的id，以半角“,”号分隔（同sku_price_list的顺序保持一一对应关系）
        */
        private String skuIdList;
            @JsonProperty(value = "sku_price_list")
        /**
        * sku优惠后的价格，原位元，精确到分，以半角“,”号分隔（同sku_id_list的顺序保持一一对应关系）
        */
        private String skuPriceList;
            @JsonProperty(value = "stock")
        /**
        * 优惠活动独立库存，为-1表示没有独立库存。如秒杀、降价拍，都有各自的独立库存
        */
        private Long stock;
            @JsonProperty(value = "can_join_cart")
        /**
        * 该优惠活动商品是否能够加购物车
        */
        private Boolean canJoinCart;
    
            public void setPromotionTypeId(Long promotionTypeId) {
            this.promotionTypeId = promotionTypeId;
        }

        public Long getPromotionTypeId() {
            return this.promotionTypeId;
        }

            public void setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
        }

        public Long getPromotionId() {
            return this.promotionId;
        }

            public void setPromotionAlias(String promotionAlias) {
            this.promotionAlias = promotionAlias;
        }

        public String getPromotionAlias() {
            return this.promotionAlias;
        }

            public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

            public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Date getStartDate() {
            return this.startDate;
        }

            public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }

        public Date getEndDate() {
            return this.endDate;
        }

            public void setSkuIdList(String skuIdList) {
            this.skuIdList = skuIdList;
        }

        public String getSkuIdList() {
            return this.skuIdList;
        }

            public void setSkuPriceList(String skuPriceList) {
            this.skuPriceList = skuPriceList;
        }

        public String getSkuPriceList() {
            return this.skuPriceList;
        }

            public void setStock(Long stock) {
            this.stock = stock;
        }

        public Long getStock() {
            return this.stock;
        }

            public void setCanJoinCart(Boolean canJoinCart) {
            this.canJoinCart = canJoinCart;
        }

        public Boolean getCanJoinCart() {
            return this.canJoinCart;
        }

        }

    public static class UmpPromotionPackagebuyDetail {
            @JsonProperty(value = "promotion_type_id")
        /**
        * 优惠套餐活动类型编码
        */
        private Long promotionTypeId;
            @JsonProperty(value = "promotion_id")
        /**
        * 优惠活动编码
        */
        private Long promotionId;
            @JsonProperty(value = "promotion_name")
        /**
        * 优惠活动名称
        */
        private String promotionName;
            @JsonProperty(value = "desc")
        /**
        * 优惠活动描述
        */
        private String desc;
            @JsonProperty(value = "start_date")
        /**
        * 优惠活动开始时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startDate;
            @JsonProperty(value = "end_date")
        /**
        * 优惠活动结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endDate;
            @JsonProperty(value = "goods_list")
        /**
        * 优惠套餐商品数据结构
        */
        private UmpPromotionPackagebuyGoods[] goodsList;
    
            public void setPromotionTypeId(Long promotionTypeId) {
            this.promotionTypeId = promotionTypeId;
        }

        public Long getPromotionTypeId() {
            return this.promotionTypeId;
        }

            public void setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
        }

        public Long getPromotionId() {
            return this.promotionId;
        }

            public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

            public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Date getStartDate() {
            return this.startDate;
        }

            public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }

        public Date getEndDate() {
            return this.endDate;
        }

            public void setGoodsList(UmpPromotionPackagebuyGoods[] goodsList) {
            this.goodsList = goodsList;
        }

        public UmpPromotionPackagebuyGoods[] getGoodsList() {
            return this.goodsList;
        }

        }

    public static class UmpPromotionPackagebuyGoods {
            @JsonProperty(value = "title")
        /**
        * 商品标题
        */
        private String title;
            @JsonProperty(value = "price")
        /**
        * 商品价格，格式：5.00；单位：元；精确到：分
        */
        private Float price;
            @JsonProperty(value = "pic_url")
        /**
        * 商品主图片地址
        */
        private String picUrl;
            @JsonProperty(value = "pic_thumb_url")
        /**
        * 商品主图片缩略图地址
        */
        private String picThumbUrl;
    
            public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

            public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }

            public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getPicUrl() {
            return this.picUrl;
        }

            public void setPicThumbUrl(String picThumbUrl) {
            this.picThumbUrl = picThumbUrl;
        }

        public String getPicThumbUrl() {
            return this.picThumbUrl;
        }

        }

    public static class UmpPromotionPointsexchange {
            @JsonProperty(value = "promotion_type_id")
        /**
        * 积分兑换活动类型编码
        */
        private Long promotionTypeId;
            @JsonProperty(value = "promotion_id")
        /**
        * 优惠活动编码
        */
        private Long promotionId;
            @JsonProperty(value = "promotion_name")
        /**
        * 优惠活动名称
        */
        private String promotionName;
            @JsonProperty(value = "exchange_points")
        /**
        * 兑换所需积分
        */
        private Long exchangePoints;
            @JsonProperty(value = "exchange_price")
        /**
        * 兑换所需价格，格式：5.00；单位：元；精确到：分
        */
        private Float exchangePrice;
            @JsonProperty(value = "start_date")
        /**
        * 优惠活动开始时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startDate;
            @JsonProperty(value = "end_date")
        /**
        * 优惠活动结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endDate;
    
            public void setPromotionTypeId(Long promotionTypeId) {
            this.promotionTypeId = promotionTypeId;
        }

        public Long getPromotionTypeId() {
            return this.promotionTypeId;
        }

            public void setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
        }

        public Long getPromotionId() {
            return this.promotionId;
        }

            public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }

            public void setExchangePoints(Long exchangePoints) {
            this.exchangePoints = exchangePoints;
        }

        public Long getExchangePoints() {
            return this.exchangePoints;
        }

            public void setExchangePrice(Float exchangePrice) {
            this.exchangePrice = exchangePrice;
        }

        public Float getExchangePrice() {
            return this.exchangePrice;
        }

            public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Date getStartDate() {
            return this.startDate;
        }

            public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }

        public Date getEndDate() {
            return this.endDate;
        }

        }

    public static class UmpPromotionOrder {
            @JsonProperty(value = "promotion_type_id")
        /**
        * 优惠活动类型编码：
						<br>101：满减送
						<br>102：订单返现
        */
        private Long promotionTypeId;
            @JsonProperty(value = "promotion_id")
        /**
        * 优惠活动编码
        */
        private Long promotionId;
            @JsonProperty(value = "promotion_name")
        /**
        * 优惠活动名称
        */
        private String promotionName;
            @JsonProperty(value = "desc")
        /**
        * 优惠活动描述
        */
        private String desc;
            @JsonProperty(value = "start_date")
        /**
        * 优惠活动开始时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date startDate;
            @JsonProperty(value = "end_date")
        /**
        * 优惠活动结束时间，时间格式：yyyy-MM-dd HH:mm:ss
        */
        private Date endDate;
    
            public void setPromotionTypeId(Long promotionTypeId) {
            this.promotionTypeId = promotionTypeId;
        }

        public Long getPromotionTypeId() {
            return this.promotionTypeId;
        }

            public void setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
        }

        public Long getPromotionId() {
            return this.promotionId;
        }

            public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }

            public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }

            public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Date getStartDate() {
            return this.startDate;
        }

            public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }

        public Date getEndDate() {
            return this.endDate;
        }

        }


}